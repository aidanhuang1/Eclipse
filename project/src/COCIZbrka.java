import java.util.*;
import java.io.*;
public class COCIZbrka {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), c = readInt();
		int[][] dp = new int[n+1][c+1]; 
		dp[1][0] = 1;
		for (int i=2; i<=n; i++) {
			int t = 0;
			for (int j=0; j<=c; j++) {
				t = (t+dp[i-1][j])%MOD;
				if (j-i>=0) {
					t = (t-dp[i-1][j-i]+MOD)%MOD;
				}
				dp[i][j] = t;
			}
		}
		System.out.println(dp[n][c]);
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
