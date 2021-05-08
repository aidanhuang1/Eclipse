package APjava;
import java.util.Scanner;
public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//6 
		System.out.println("input a number: ");
		int a = sc.nextInt();
		if (a%2==0) 
			System.out.println("number is an even number.");
		else 
			System.out.println("number is an odd number.");

		
		//7
		System.out.println("input a number: ");
		int b = sc.nextInt();
		if (b==0) {
			System.out.println("number is zero");
		}
		if (b>0) {
			System.out.println("number is positive");
		}
		if (b<0) {
			System.out.println("number is negative");
		}
		
		//8
		System.out.println("input two numbers: ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		int bigger = 0;
		int smaller = 0;
		System.out.println("sum is "+(c+d));
		System.out.println("difference is: "+Math.abs(c-d));
		if (c>d) {
			bigger = c;
			smaller = d;
		} 
		else if (d>c) {
			bigger = d;
			smaller = c;
	
		}
		System.out.println("product is: "+c*d);
		System.out.println("average is: "+(c+d)/2.0);
		System.out.println("The bigger number is: "+bigger+"\nthe smaller number is: "+smaller);
		//9
		
		System.out.println("input minutes: ");
		int minutes = sc.nextInt();
		int originalminutes = minutes;
		int hours = minutes/60;
		minutes = minutes%60;
		int days = hours/24;
		hours = hours%24;
		int years = days/365;
		days = days%365;
		
		
		System.out.println(originalminutes+" minutes equals "+years+" years, "+days+" days, "+hours+" hours, "+minutes+" minutes.");
		
	}

}
