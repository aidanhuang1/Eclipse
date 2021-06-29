import java.util.*;
import java.io.*;
public class CCCPiday {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static int[][] dp;

	public static void search(int n, int k) {
		dp = new int[n+1][n+1];
		Arrays.fill(dp[0], 1);
		for (int i=1; i<=k; i++) {		
			dp[i][i] = 1;
			for (int j=i+1; j<=n; j++) {
				dp[i][j] = dp[i-1][j-1]+dp[i][j-i-1];
			}
		}
		System.out.println(dp[k-1][n-1]);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), k = readInt();
		if (k==n || k==1) {
			System.out.println(1);
			return;
		}	
		search(n, k);

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
