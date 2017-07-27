package proxy.rowsync;

public class Row implements IRow {
	
	private IRow row;
	
	public Row(ITable table, int i) {
		this.row = table.getRow(i);
	}

}
