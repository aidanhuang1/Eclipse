package project;
import java.util.Scanner;

public class WaterandCompManu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of computer/monitor combos you have: ");
		double number = sc.nextDouble();
		System.out.print("This is the amount of water it took to manufacture it/them: " + number*1.5);
		

	}

}
