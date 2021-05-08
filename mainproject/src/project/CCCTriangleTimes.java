package project;
import java.util.Scanner;
public class CCCTriangleTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int total = A+B+C;
		if (total==180 && A==60 && B==60 && C==60) {
			System.out.println("Equilateral");
		}
		if (total==180) {
			if (A==B || B==C || A==C) {
				if (A!=60 && B!=60 && C!=60) {
					System.out.println("Isosceles");
				}
			}
		}
		if (total==180) {
			if (A!=B && B!=C && A!=C) {	
				System.out.println("Scalene");
			}

		}
		if (total!=180) {
			System.out.println("Error");
		}
	}

}
