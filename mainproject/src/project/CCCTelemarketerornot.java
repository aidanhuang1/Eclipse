package project;
import java.util.Scanner;
public class CCCTelemarketerornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if (A == 8 || A == 9) {
			if (D == 8 || D == 9) {
				if (B == C) {
					System.out.print("ignore");
				} else {
					System.out.print("answer");
				}
			} else {
				System.out.print("answer");
			}
		} else {
			System.out.print("answer");
		}

	}
} 



