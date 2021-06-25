package project;
import java.util.*;
import java.io.*;
public class TwoSets2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		int sum = (n*(n+1))/2; //you could also find the sum using for loop
		if (sum%2!=0) {
			System.out.println(0); //if sum is odd, there are no solutions because sum/2 would have a decimal
			return;
		}
		sum/=2; //this is the sum that both groups need to add up to
		long[] dp = new long[sum+1];
		dp[0] = 1;
		for (int i=1; i<=n; i++) {
			for (int j=sum; j>=i; j--) {	
				dp[j]+=dp[j-i];
				dp[j]%=1000000007;
			}
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[sum]/2);
		
		
	}
	
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
