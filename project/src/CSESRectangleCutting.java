import java.util.*;
import java.io.*;
public class CSESRectangleCutting {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int w = readInt(), h = readInt();
		int[][] dp = new int[w+1][h+1];
		for (int i=0; i<=w; i++) {
			for (int j=0; j<=h; j++) {
				if (i==j) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = Integer.MAX_VALUE;
					for (int k=1; k<i; k++) {
						dp[i][j] = Math.min(dp[i][j], dp[k][j]+dp[i-k][j]+1);
					}
					for (int k=1; k<j; k++) {
						dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[i][j-k]+1);
					}
				}
			}
			
		}
		System.out.println(dp[w][h]);
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
