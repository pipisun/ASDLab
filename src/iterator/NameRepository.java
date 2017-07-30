package iterator;

import java.util.ArrayList;
import java.util.List;

public class NameRepository implements Aggregate {
	private String names[][] = { { "Rob", "Roseth" }, { "Jon", "-", "David" }, { "July", "Daharis" },
			{ "Lor", "Brette" }, { "Pat", "Williams" }, { "Ken", "Johnson" } };

	private int rownum = names.length;
	private int lastrowcolnum = names[rownum - 1].length;

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int col = 0;
		int row = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if ((row < (rownum - 1)) || (row == (rownum - 1) && col < lastrowcolnum)) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			String getName = "";

			if (this.hasNext()) {
				if (col < names[row].length) {
					getName = names[row][col];
				} else if (row < names.length) {
					col = 0;
					row++;
					getName = names[row][col];
				}
				if (getName.equals("-")) {
					if (col < names[row].length) {
						col++;
					} else {
						col = 0;
						row++;
					}
					getName = names[row][col];
					if (col < names[row].length) {
						col++;
					} else {
						col = 0;
						row++;
					}
					return getName;
				} else {
					if (col < names[row].length) {
						col++;
					} else {
						col = 0;
						row++;
					}
					return getName;
				}
			}
			return null;
		}

		@Override
		public Object first() {
			// TODO Auto-generated method stub
			String str = "";
			for(int i=0;i<names[0].length;i++) {
				if(!names[0][i].equals("-"))
					str += names[0][i] + " ";
			}
			
			return (Object)str;
		}

		@Override
		public Object currentItem() {
			// TODO Auto-generated method stub
			if (this.hasNext()) {
				return names[row][col];
			} else {
				return null;
			}
		}

		@Override
		public Object last() {
			// TODO Auto-generated method stub
			String str = "";
			for(int i= 0;i<names[rownum-1].length;i++) {
				if(!names[rownum-1][i].equals("-"))
					str += names[rownum-1][i] + " ";
			}
			
			return (Object)str;
		}

	}
}
