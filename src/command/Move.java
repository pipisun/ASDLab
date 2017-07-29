package command;

public class Move {
	private int secSize;
	private int movenum;

	public Move(int secSize, int movenum) {
		this.movenum = movenum;
		this.secSize = secSize;
	}

	public int getSecSize() {
		return secSize;
	}

	public void setSecSize(int secSize) {
		this.secSize = secSize;
	}

	public boolean move() {
		try {
			for(int i=0;i<secSize;i++) {
				for(int k=0;k<movenum;k++) {
					System.out.print(" ");
				}
				for(int j=0;j<secSize;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean unmove() {
		try {
			System.out.println("Move done");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
