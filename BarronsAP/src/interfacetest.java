interface kar {
	public int speed();
	public String brand();
	public boolean moving();
}
class variables {
	int carspeed;
	String carbrand;
	boolean carmoving;
}
public class interfacetest extends variables implements kar {
	public int speed() {
		this.carspeed = 120;
		return this.carspeed;
	}
	public String brand() {
		this.carbrand = "T";
		return this.carbrand;
	}
	public boolean moving() {
		this.carmoving = true;
		return this.carmoving;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfacetest Car = new interfacetest();
		System.out.println(Car.speed());

	}

}
