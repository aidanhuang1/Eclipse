import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] coins;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), x = readInt();
		int[] coins = new int[n];
		for (int i=0; i<n; i++) {
			coins[i] = readInt();
		}
		long[] dp = new long[x+1];
		Arrays.fill(dp, Integer.MAX_VALUE/10);
		dp[0] = 0;
		for (int i=1; i<=x; i++) {
			for (int j: coins) {
				if (i-j >= 0) {
					dp[i] = Math.min(dp[i], dp[i-j]+1);
				}
			}
		}
		if (dp[x]==Integer.MAX_VALUE/10) System.out.println(-1);
		else System.out.println(dp[x]);
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
