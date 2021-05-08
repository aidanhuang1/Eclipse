
interface waterbottleinterface {
	String color = "blue";
	void fillup();
	void pourout();
}

public class Interface implements waterbottleinterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(color);
		Interface ex = new Interface();
		ex.fillup();
	}


	@Override
	public void fillup() {
		// TODO Auto-generated method stub
		System.out.println("water bottle is filled up.");
	}
	@Override
	public void pourout() {
		// TODO Auto-generated method stub
		System.out.println("water bottle is emptied.");
	}

}
