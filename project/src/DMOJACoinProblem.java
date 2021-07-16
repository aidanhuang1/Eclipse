import java.util.*;
import java.io.*;
public class DMOJACoinProblem {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	 * Here, if we processed each query every time, the code will TLE
	 * However, if we take in all the query numbers, store them for later and access the array when needed
	 * This saves time and since we only using a 1d dp array, we save memory
	 * 
	 * This problem also relates to DMOJCoinChange
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), v = readInt();
		int[] coins = new int[n+1];
		for (int i=1; i<=n; i++) {
			coins[i] = readInt();
		}
		int max = 0;
		int[] c = new int[v+1];
		int[] l = new int[v+1];
		int[] ans = new int[v+1];
		for (int i=1; i<=v; i++) {
			c[i] = readInt();
			max = Math.max(max, c[i]);
			l[i] = readInt();
		}

		int[] dp = new int[max+1];
		Arrays.fill(dp, Integer.MAX_VALUE/10);
		dp[0] = 0;
		for (int j=1; j<=n; j++) {
			for (int k=coins[j]; k<=max; k++) {
				dp[k] = Math.min(dp[k], dp[k-coins[j]]+1);
			}
			for (int k=1; k<=v; k++) {
				if (l[k]==j) {
					ans[k] = dp[c[k]];
				}
			}
		}
		for (int i=1; i<=v; i++) {
			if (ans[i]==Integer.MAX_VALUE/10) System.out.println(-1);
			else System.out.println(ans[i]);
		}

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
