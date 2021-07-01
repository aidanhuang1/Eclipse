import java.util.*;
import java.io.*;
public class IOITheTriangle {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		int[][] dp = new int[n][n];
		for (int i[]: dp) {
			Arrays.fill(i, -1);
		}
		System.out.println();
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) {
				int number = readInt();
				if (i==0) {
					dp[i][j] = number;
				} else if (i==j) {
					dp[i][j] = dp[i-1][j-1]+number;
				} else if (j==0) {
					dp[i][j] = dp[i-1][j]+number;
				} else {
					dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + number;
				}
			}

		}
		int max = 0;
		for (int i=0; i<n; i++) {
			max = Math.max(max, dp[n-1][i]);
		}
		System.out.println(max);


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
