import java.util.*;
import java.io.*;
public class DMOJDeque {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		long[][] dp = new long[n][n];
		int[] seq = new int[n];
		for (int i=0; i<n; i++) {
			int temp = readInt();
			seq[i] = temp;
			dp[i][i] = temp;
		}
		for (int i=n-1; i>=0; i--) {
			for (int j=i+1; j<n; j++) {
				dp[i][j] = Math.max(seq[i]-dp[i+1][j], seq[j]-dp[i][j-1]);
				for (long k[]: dp) {
					System.out.println(Arrays.toString(k));
				}
				System.out.println();
			}
			
		}
		
		System.out.println(dp[0][n-1]);

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
