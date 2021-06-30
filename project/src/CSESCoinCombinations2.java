import java.util.*;
import java.io.*;
public class CSESCoinCombinations2 {
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
		
		for (int i: coins) { //we loop through the coins first and making sure they go from least to greatest cause we are looking for an ordered list, that means starting with the smallest coins and going up to the largest
			for (int j=0; j<=x; j++) { 
				if (j-i>=0) {
					dp[j] += dp[j-i];
					dp[j] %= 1000000007;
				}	
			}
		}
		System.out.println(dp[x]);
		
		
		
		
		
		
		
		/* Another valid solution
		 * 
		 * int n = readInt(), x = readInt();
		int[] coins = new int[n];
		for (int i=0; i<n; i++) { 
			coins[i] = readInt();
		}
		Arrays.sort(coins);
		long[] dp = new long[x+1];
		dp[0] = 1;
		for (int i: coins) {
			for (int j=0; j<=x; j++) {
				if (dp[j]!=0 && j+i<=x) {
					dp[j+i]+=dp[j];
					dp[j+i]%=MOD;
				}
				
			}
		}
		System.out.println(dp[x]);
		 */
		
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
