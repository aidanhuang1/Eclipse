import java.util.*;
import java.io.*;
public class USACOGold248 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//incomplete

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		int[] sequence = new int[n];
		for (int i=0; i<n; i++) {
			sequence[i] = readInt();
		}
		int ans = 0;
		int[][] dp = new int[n][n];
		for (int i=0; i<n; i++) {
			dp[i][i] = sequence[i];
			ans = Math.max(ans, sequence[i]);
		}
		
		for (int i=n-1; i>=0; i--) {
			for (int j=i+1; j<n; j++) {
				dp[i][j] = -1;
			}
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
