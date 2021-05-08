
class bird {
	public void sing() {
		System.out.println("tweet");
	}
}

class robin extends bird { //extends takes everything that class bird knows and into class robin
	public void sing() { //class robin has its own way to sing
		System.out.println("twat");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bird b = new bird();
		robin r = new robin();
		b.sing();
		r.sing();
		
	}

}
