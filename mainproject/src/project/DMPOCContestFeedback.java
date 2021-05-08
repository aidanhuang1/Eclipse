package project;
import java.util.Scanner;
public class DMPOCContestFeedback {

	public static double avg2(double a, double b) {
		return (a+b)/2;
	}
	public static double avg3(double a, double b, double c) {
		return (a+b+c)/3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();

		System.out.println(avg2(A,B));
		System.out.println(avg2(A,C));
		System.out.println(avg2(A,D));
		System.out.println(avg2(B,C));
		System.out.println(avg2(B,D));
		System.out.println(avg2(C,D));
		System.out.println(avg3(A,B,C));
		System.out.println(avg3(A,B,D));
		System.out.println(avg3(A,C,D));
		System.out.println(avg3(B,C,D));
		System.out.println((A+B+C+D)/4);

	}

}
