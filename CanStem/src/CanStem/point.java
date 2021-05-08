package CanStem;

public class point {
	private int x;
	private int y;
	public point() {
		this.x = 0;
		this.y = 0;
	}
	public point(int x, int y) {
		this.x = x;
		this.y = y;//the one with "this" is the instant variable, the one without is the input variable
		
	}
	//getX
	public int getX() { //public int needs to have something that is to be returned, but public void doesn't return anything
		return this.x;
}
	//getY
	public int getY() {
		return this.y;
	}
	
	//what if we want to change them
	//changeX
	public void changeX(int x) {
		this.x = x;
	}
	public void changeY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		 return "("+x+", "+y+")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}