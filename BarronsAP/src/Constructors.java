
public class Constructors {
	String name;
	final String password;
	int balance;
	//Constructor
	public Constructors() { //DEFAULT CONSTRUCTOR or NO-ARG CONSTRUCTOR?
		this.name = "newname";
		this.password = "";
		this.balance = 0;
	}
	
	public Constructors(String acctpassword, int acctbalance) { //PARAMETERIZED CONSTRUCTOR
		password = acctpassword;
		balance = acctbalance;
	}
	
	public int getbalance() {
		return this.balance;
	}
	
	public void setbalance(int balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Constructors obj = new Constructors(); // Object variables store the addresses of Constructors, 
		//they do not store the actual objects
		System.out.println(obj.name);
		
		Constructors c = new Constructors("abcd", 2020);
		System.out.println(c.balance);
		
		System.out.println(c.getbalance()); // ACCESSOR (getters), accesses a class object without changing the object
		c.setbalance(2021); //MUTATOR (setters), changes the state of an object by modifying its instance variables
		
		
	}	
}
