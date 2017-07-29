package command;

public class Scale {
	
	private int secSize;
	private int scalenum;

	public Scale(int secSize, int scalenum) {
		this.secSize = secSize;
		this.scalenum = scalenum;
	}

	public int getSecSize() {
		return secSize;
	}

	public void setSecSize(int secSize) {
		this.secSize = secSize;
	}

	public boolean scale() {
		try {
//			g.setColor(Color.BLUE);
//			g.drawRect(80, 80, this.secSize * scalenum, this.secSize * scalenum);
			for(int i=0;i<secSize * scalenum;i++) {
				for(int j=0;j<secSize * scalenum;j++) {
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

	public boolean unscale() {
		try {
			System.out.println("Scale done");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
