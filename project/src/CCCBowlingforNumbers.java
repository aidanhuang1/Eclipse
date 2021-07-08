import java.util.*;
import java.io.*;
public class CCCBowlingforNumbers {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int t = readInt();
		
		while(t-->0) {
			int n = readInt(), k = readInt(), w = readInt();
			int[][] dp = new int[k+1][n]; 
			int[] pins = new int[n+1], sums = new int[n];
			for (int i=0; i<n; i++) {
				pins[i] = readInt();
				for (int j=0; j<w; j++){ 
					if (i-j>=0) {
						sums[i] += pins[i-j];
					}
				}
			}
			
			for (int i=1; i<=k; i++) {
				for (int j=1; j<n; j++) {
					if (j-w < 0) {
						dp[i][j] = sums[j];
					} else {
						dp[i][j] = Math.max(dp[i-1][j-w]+sums[j], dp[i][j-1]);
					}
				}
			}

			System.out.println(dp[k][n-1]);

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
