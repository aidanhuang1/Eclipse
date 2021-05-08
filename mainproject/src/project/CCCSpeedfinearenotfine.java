package project;
import java.util.Scanner;
public class CCCSpeedfinearenotfine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //speed limit
		int B = sc.nextInt(); //recorded speed
		int speed = B-A;
		int fine = 0;
		if (speed >= 1 && speed <= 20) {
			fine = 100;
		}
		if (speed >= 21 && speed <= 30) {
			fine = 270;
		}
		if (speed >= 31) {
			fine = 500;
		}
		if (speed > 0) {
			System.out.println("You are speeding and your fine is $"+fine+".");
		} else {
			System.out.println("Congratulations, you are within the speed limit!");
		}

	}

}
