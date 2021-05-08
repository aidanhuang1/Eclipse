package main;
import java.util.Scanner;

public class DMOJ16bitswonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			c[i] = sc.nextLong();
		}
		for (int i=0; i<n; i++) {
			if (a[i]*b[i]!=c[i]) {
				System.out.println("16 BIT S/W ONLY");
			} else {
				System.out.println("POSSIBLE DOUBLE SIGMA");
			}
		}
		

	}

}
