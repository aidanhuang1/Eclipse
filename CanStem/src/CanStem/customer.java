package CanStem;

import java.util.Scanner;

public class customer {
	private int amount;
	private String name;
	private String password;
	private int chequing;
	private int savings;
	
	public customer() {
		this.name = "";
		this.password = "";
		this.chequing = 0;
		this.savings = 0;
	}
	
	public customer(String name, String password, int chequing, int savings) {
		this.name = name;
		this.password = password;
		this.chequing = chequing;
		this.savings = savings;
	}
	
	public boolean checkpassword(String password) {
		return this.password.equals(password);
	}
	
	//getName
	public String getName() {
		return this.name;
	}
	//setName
	public void setName(String name) {
		Scanner sc = new Scanner(System.in);
		if (this.checkpassword((sc.nextLine()))) {
			this.name = name;
		} else {
			System.out.println("wrong password");
		}
	}
	public void setpassword(String password) {
		Scanner sc = new Scanner(System.in);
		if (this.checkpassword((sc.nextLine()))) {
			this.password = password;
		} else {
			System.out.println("wrong original password");
		}
	}
	public void deposit(String account, int amount) {
		if (account.equals("chequing")) {
			this.chequing += amount;
		} else {
			this.savings += amount;
		}
	}
	public void withdraw(String account, int amount) {
		if (account.equals("chequing") && !(chequing > amount)) {
			this.chequing -= amount;
		} 
		else if (account.equals("savings") && !(savings > amount)) {
			this.savings -= amount;
		} else {
			System.out.println("your broke");
		}
	}
	
	//getbalance
	
	public int getbalance() {
		return this.chequing + this.savings;
		
	}
	public String toString() {
		return this.name + " has " +chequing + " in his/her chequing account.";
		
	}
	
	

}
