import java.util.*;
import java.io.*;
public class DMOJMoMoney {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), t = readInt();
		int[][] dp = new int[n+1][t+1];
		dp[0][0] = 1;
		int[] coins = new int[n+1];
		for (int i=1; i<=n; i++) {
			coins[i] = readInt();
		}
		for (int i=1; i<=n; i++) {
			for (int j=0; j<=t; j++) {
				
				dp[i][j] = dp[i-1][j];
				
				if (j-coins[i]>=0) {
					dp[i][j]+=dp[i-1][j-coins[i]];	
				}
			}
		}
		System.out.println(dp[n][t]);

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
