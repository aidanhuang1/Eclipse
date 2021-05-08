
abstract class Abstract { //Abstract class is a restricted class. To access this, it must be inherited 
	//from another class
	public abstract void sound(); //Abstract methods do not have a body {}; 

}

class anotherclass extends Abstract {
	public void sound() {
		System.out.println("make sound");
	}
}	

class Main {
	public static void main(String[] args) {
		anotherclass makesound = new anotherclass();
		makesound.sound();

	}
}
