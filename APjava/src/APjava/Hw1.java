package APjava;
import java.util.Scanner;
public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1
		// from the "main" method
		
		//2
		// D) 67count is invalid. Variable names cannot start with a number.
		
		//3 
		float myNum1 = 8.99f;
		long myNum2 = 26L;
		char myLetter = 'A';
		boolean myBool = false;
		String myText = "Hello World";
	
		
		//4
		System.out.println("input your weight");
		int earthweight = sc.nextInt();
		System.out.println("Your weight on the moon is: "+earthweight*0.17);
		
		//5
		System.out.println("input radius");
		double radius = sc.nextDouble();
		System.out.println("Area: "+Math.PI*(radius*radius));
		System.out.println("Perimeter: "+2*Math.PI*radius);


	}

}
