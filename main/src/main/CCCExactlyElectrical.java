package main;
import java.util.Scanner;

public class CCCExactlyElectrical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int t = sc.nextInt();
		int total = Math.abs(a-c)+Math.abs(b-d);
		if (total <= t) {
			if (total%2==0 && t%2==0 || total%2==1 && t%2==1) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			
		} else {
			System.out.println("N");
		}
	}

}
