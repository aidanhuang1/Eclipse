import java.util.*;
import java.io.*;
public class intervaldp {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	/*
	 * Statement
	Given a set of numbers find an optimal solution for a problem considering the current number and the best you can get from the left and right sides.

	Approach
	Find all optimal solutions for every interval and return the best possible answer.
	
	// from i to j
	dp[i][j] = dp[i][k] + result[k] + dp[k+1][j]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub


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
