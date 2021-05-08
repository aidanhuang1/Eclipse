package project;
import java.util.Scanner;
public class CCCBodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double BMI = A/(B*B);
		if (BMI>25) {
			System.out.println("Overweight");
		}
		if (BMI<18.5) {
			System.out.println("Underweight");
		}
		if (BMI<=25 && BMI>=18.5) {
			System.out.println("Normal weight");
		}
	}

}
