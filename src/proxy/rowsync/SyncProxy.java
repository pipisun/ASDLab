package proxy.rowsync;

public class SyncProxy implements ITable {
	private ITable table;
	private IRow[] rows;
	
	public SyncProxy(ITable table) {
		this.table = table;
		this.rows = new Row[table.numOfRows()];
		for(int i=0;i<table.numOfRows();i++) {
			this.rows[i] = new Row(table, i);
		}
	}

	@Override
	public int numOfRows() {
		return table.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		synchronized(rows[rowNum]) {
			return rows[rowNum];
		}
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		synchronized(rows[rowNum]) {
			table.addRow(row, rowNum);
		}
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		synchronized(rows[rowNum]) {
			table.modifyRow(rowNum, row);
		}
	}

	@Override
	public void deleteRow(int rowNum) {
		synchronized(rows[rowNum]) {
			table.deleteRow(rowNum);
		}
	}

}
