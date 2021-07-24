import java.util.*;
import java.io.*;
public class CSESArrayDescription {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	//	dp[i][v] = number of ways to fill the array up to index i, if x[i] = v.

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), m = readInt();
		int[] numbers = new int[n+1]; 
		for (int i=1; i<=n; i++) {
			numbers[i] = readInt();
		}
		int[][] dp = new int[n+2][m+2];
		for (int i=1; i<=n; i++) {

			for (int j=1; j<=m; j++) {

				if (i==1) { //if we are on the first row
					if (numbers[i]==0 || numbers[i]==j) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = 0;
					}
				} else {
					if (numbers[i]==0 || numbers[i]==j) {
						dp[i][j] = ((dp[i-1][j-1] + dp[i-1][j])%MOD + dp[i-1][j+1])%MOD;
					} else {
						dp[i][j] = 0;
					}
				} 
			}
		}
		int ans = 0;
		for (int i=1; i<=m; i++) {
			ans = (ans +dp[n][i]) % MOD;
		}
		System.out.println(ans);
		for (int i[]: dp) {
			System.out.println(Arrays.toString(i));
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
