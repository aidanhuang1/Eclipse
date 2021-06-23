import java.util.*;
import java.io.*;
public class fibonacci {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] f2;

	static int bottomup(int n) { //Bottom-Up Fibonacci solution
		if (n==1 || n==2) {
			return 1;
		}
		int[] f = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for (int i=2; i<=n; i++) {
			f[i] = f[i-1] + f[i-2];
			System.out.println(Arrays.toString(f));
			
		}
		return f[n];
	}
	
	static int dp(int n) { //Memoized Fibonacci Solution
		int result = 0;
		if (f2[n]!=0) {
			return f2[n];
		}
		if (n==1 || n==2) {
			result = 1;
		} else {
			result = dp(n-1) + dp(n-2);
		}
		f2[n] = result;
		System.out.println(Arrays.toString(f2));
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println("Bottom-Up: "+bottomup(n));
		f2 = new int[n+1];
		Arrays.fill(f2, 0);
		System.out.println("Memoized: "+dp(n));

	}
}
