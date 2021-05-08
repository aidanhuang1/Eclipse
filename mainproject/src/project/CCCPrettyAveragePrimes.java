package project;

import java.util.Scanner;

public class CCCPrettyAveragePrimes {

	public static boolean checkprime(int n) {
		for (int i=2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) { 
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			int N = sc.nextInt();
			int a = N, b = N;	
			while(true) {
				if (checkprime(a)&&checkprime(b)) {
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