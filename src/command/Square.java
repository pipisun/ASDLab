package command;

public class Square {
	int secSize;

	public Square(int secSize) {
		this.secSize = secSize;
	}

	public boolean paint() {
		try {
			for (int i = 0; i < secSize; i++) {
				for (int j = 0; j < secSize; j++) {
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

	public boolean unpaint() {
		try {
			System.out.println("Paint done");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public int getSecSize() {
		return secSize;
	}

	public void setSecSize(int secSize) {
		this.secSize = secSize;
	}

}
