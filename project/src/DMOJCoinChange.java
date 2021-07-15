import java.util.*;
import java.io.*;
public class DMOJCoinChange {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int x = readInt();
		int n = readInt();
		int[] coins = new int[n+1];
		for (int i=1; i<=n; i++) {
			coins[i] = readInt();
		}
		int[] dp = new int[x+1];
		
		Arrays.fill(dp, Integer.MAX_VALUE/10);
		dp[0] = 0;
		for (int i=1; i<=x; i++) {
			for (int j=1; j<=n; j++) {
				if (i-coins[j]>=0) {
					dp[i] = Math.min(dp[i-coins[j]]+1, dp[i]);
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
