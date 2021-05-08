
class Methodoverriding /* Human */ {

	//Overridden method
	public void eat() // This is the general method, and class Methodoverriding (Human) has a method to eat
	{
		System.out.println("Human is eating");
	}
}
class Boy extends Methodoverriding {
	//Overriding method
	public void eat(){ // It overrides the general method and "eats" in its own version
		System.out.println("Boy is eating");
	}
	public static void main(String args[]) {
		Boy obj = new Boy();
		//This will call the child class version of eat()
		obj.eat();
	}
}


