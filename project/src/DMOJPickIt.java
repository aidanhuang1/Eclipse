import java.util.*;
import java.io.*;
public class DMOJPickIt {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	 * Create a 2d array
	 * dp[i][j] represents the max score using i-2 moves, where i is the number of moves and j is/are the numbers chosen
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while (true) {
			int n = readInt();
			if (n==0) break;
			int[] number = new int[n+1];
			for (int i=1; i<=n; i++) {
				number[i] = readInt();
			}
			int[][] dp = new int
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
