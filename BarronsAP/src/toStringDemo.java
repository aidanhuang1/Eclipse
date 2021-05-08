
public class toStringDemo {
	
	private double x;
	private double y;
	
	public toStringDemo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { //to Override, it needs to have the name toString
		return "(" + x + "," + y + ")";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toStringDemo obj = new toStringDemo(2,3);
		System.out.println(obj);
	}

}
