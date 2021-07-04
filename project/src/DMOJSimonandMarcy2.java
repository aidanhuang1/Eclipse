import java.util.*;
import java.io.*;
public class DMOJSimonandMarcy2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//2d array version of Simon and Marcy

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c = readInt(), m = readInt();
		int[][] dp = new int[c+1][m+1];
		int[] p = new int[c+1], s = new int[c+1];
		for (int i=1; i<=c; i++) {
			p[i] = readInt();
			s[i] = readInt();
		}
		for (int i=1; i<=c; i++) {
			for (int j=1; j<=m; j++) {
				dp[i][j] = dp[i-1][j];	
				if (j >= s[i] && dp[i-1][j-s[i]] + p[i]>dp[i][j]) {
					dp[i][j] = dp[i-1][j-s[i]] + p[i];
				}
			}	
		}
		System.out.println(dp[c][m]);

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
