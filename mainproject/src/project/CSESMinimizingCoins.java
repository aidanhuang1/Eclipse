package project;
import java.util.*;
import java.io.*;
public class CSESMinimizingCoins {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] coins;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), x = readInt();
		coins = new int[n];
		for (int i=0; i<n; i++) {
			coins[i] = readInt();
		}

		int[] dp = new int[x+1];
		Arrays.fill(dp, Integer.MAX_VALUE/10);
		dp[0] = 0;

		for (int i = 1; i <= n; i++) {
			for (int sum = 0; sum <= x; sum++) {
				if (sum - coins[i - 1] >= 0) {
					dp[sum] = Integer.min(dp[sum], dp[sum - coins[i - 1]] + 1);
				}
			}
		}
		if (dp[x] == Integer.MAX_VALUE/10) {
			System.out.println(-1);
			System.exit(0);
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
