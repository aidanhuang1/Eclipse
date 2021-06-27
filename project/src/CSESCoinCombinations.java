import java.util.*;
import java.io.*;
public class CSESCoinCombinations {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), x = readInt();
		int[] coins = new int[n];
		for (int i=0; i<n; i++) {	
			coins[i] = readInt();
		}
		long[] dp = new long[x+1];
		dp[0] = 1;
		
		for (int i=1; i<=x; i++) {
			for (int j: coins) {
				if (i-j>=0) { //if i-j>=0 is true then that means we have room for the coin j
					dp[i]+=dp[i-j]; // then we add the sum of the previous answers
					
					dp[i] %= 1000000007;
				}
			}
		}
		System.out.println(dp[x]);
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
