class Superkeyword {
	int maxspeed = 120;
	Superkeyword() {
		System.out.println("Superkeyword constructor");
	}

}

class car extends Superkeyword { //extends takes everything from class Superkeyword
	public void display() {
		System.out.println(super.maxspeed); //super refers to the parent object (Superkeyword in this case)
	}
	car() {
		super();
		System.out.println("car constructor");
	}	
	int nextmaxspeed = 140;

}

class nextcar extends car {
	int nextmaxspeed = 10; //this is a local variable
	public void e() {
		System.out.println(super.nextmaxspeed); //here, super refers to its parent object, car
		//super.nextmaxspeed refers to the parent variable, not the local variable
	}
}
