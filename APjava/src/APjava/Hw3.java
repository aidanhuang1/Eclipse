package APjava;
import java.util.Scanner;
public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Question 10
		System.out.println("Input an integer");
		int N = sc.nextInt();
		int c = (N%10);
		int b = (((N%100)-c)/10);
		int a = (((N%1000)-b)/100);
		int sum = a+b+c;
		System.out.println("The sum of "+a+", "+b+", "+c+" is "+sum);
		
		//Question 12
		System.out.println("Input first number");
		int x = sc.nextInt();
		System.out.println("Input second number");
		int y = sc.nextInt();
		System.out.println("Input third number");
		int z = sc.nextInt();
		if ((z>y) && (y>x)) {
			System.out.println("Increasing order");
		} 
		else if ((x>y)&&(y>z)) {
			System.out.println("Decreasing order");
		} else {
			System.out.println("Neither increasing or decreasing");
		}
		
		//Question 13
		System.out.println("Input a letter");
		String letter = sc.next();
		letter.toLowerCase();
		boolean vowel = false;
		boolean alphabet = false;
		char letterchar = letter.charAt(0);
		if (Character.isLetter(letterchar)) {
			alphabet = true;
		}
		switch (letter) {
		case "a":
			vowel = true;
		case "e":
			vowel = true;
		case "i":
			vowel = true;
		case "o":
			vowel = true;
		case "u":
			vowel = true;
		}
		if (!alphabet) {
			System.out.println("error");
		} else if (vowel & alphabet) {
			System.out.println("letter "+letter+" is a vowel");
		} else if (!vowel & alphabet) {
			System.out.println("letter "+letter+" is a consonant");
		}
	
		
		//Question 14
		System.out.println("Input the year: ");
		int year = sc.nextInt();
		if (year%4==0) {
			if (year%2==0) {
				if (year%400==0) {
					System.out.println(year+" is a leap year");
				} else {

				}
			} else {
				
			}
		} else {
			System.out.println(year+" is not a leap year");
		}

		System.out.println("input the month: ");
		int month = sc.nextInt();
		String monthName;
		int days = 0;
		switch (month) {
		case 1:
			monthName = "January";
			days = 31;
			break;
		case 2:  
			monthName = "February";
			days = 29;
			break;
		case 3:  
			monthName = "March";
			days = 31;
			break;
		case 4:  
			monthName = "April";
			days = 30;
			break;
		case 5:  
			monthName = "May";
			days = 31;
			break;
		case 6:  
			monthName = "June";
			days = 30;
			break;
		case 7: 
			monthName = "July";
			days = 31;
			break;
		case 8:  
			monthName = "August";
			days = 31;
			break;
		case 9:  
			monthName = "September";
			days = 30;
			break;
		case 10: 
			monthName = "October";
			days = 31;
			break;
		case 11: 
			monthName = "November";
			days = 30;
			break;
		case 12: 
			monthName = "December";
			days = 31;
			break;
		default: 
			monthName = "Invalid month";
			break;
		}

		System.out.println(monthName+" of "+year+" has "+days+" days");


	}

}
