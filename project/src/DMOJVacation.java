import java.util.*;
import java.io.*;
public class DMOJVacation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		int[] act = new int[3];
		int[][] dp = new int[n][3];
		for (int i=0; i<n; i++) {
			for (int j=0; j<3; j++) {
				act[j] = readInt();
			}
			if (i>0) {
				dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + act[0];
				dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + act[1];
				dp[i][2] = Math.max(dp[i-1][1], dp[i-1][0]) + act[2];
			} else {
				dp[i][0] = act[0];
				dp[i][1] = act[1];
				dp[i][2] = act[2];
			}
		}
		int max = 0;
		for (int i=0; i<3; i++) {
			max = Math.max(dp[n-1][i], max);
		}
		System.out.println(max);
		

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
