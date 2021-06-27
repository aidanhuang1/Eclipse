
import java.util.*;
import java.io.*;
public class CSESGridPaths {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	public static void lcs(char[][] grid, int n) {
		int[][] dp = new int[n+1][n+1];
		dp[1][1] = 1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if (grid[i][j]=='.') {
					dp[i][j] += dp[i-1][j]+dp[i][j-1];
					dp[i][j] %= MOD;
				} else if (grid[i][j]=='*') {
					dp[i][j] = 0;
				}
			}
		}	
		System.out.println(dp[n][n]);
		return;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		char[][] grid = new char[n+1][n+1];
		for (int i=1; i<=n; i++) {
			String[] temp = readLine().split("");
			for (int j=1; j<=n; j++) {
				grid[i][j] = temp[j-1].charAt(0);
			}
		}
		lcs(grid, n);
		
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
