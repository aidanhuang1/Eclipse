package main;
import java.util.Scanner;
public class CCCPrettyAveragePrimes {

	public static boolean prime(int n) {
		if (n <= 1) {  
			return false;  
		}  
		for (int i = 2; i < Math.sqrt(n); i++) {  
			if (n % i == 0) {  
				return false;  
			}  
		}  
		return true;  
	}  


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]x = new int[n];
		for (int i=0; i<n; i++) {
			x[i] = sc.nextInt()*2;
		}
		for (int i=0; i<n; i++) {
			int a = x[i]-2;
			int b = 2;
			while (true) {
				if (prime(a)==true && prime(b)==true) {
					System.out.println(a+" "+b);
					break;
				} else {
					a--;
					b++;
				}
			}

		}
	}

}
