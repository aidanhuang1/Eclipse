import java.util.*;
import java.io.*;
public class DMOJNotEnoughTime {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	/*
	 * We may need to consider a 1d array
	 * dp[i][j] = the max money ABC can earn, where i is the item and j is the capacity
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), t = readInt();
		int[][] dp = new int[4][t+1];
		for (int l=0; l<n; l++) {

			int[] revenue = new int[4], preptime = new int[4];
			for (int i=1; i<=3; i++) {
				preptime[i] = readInt();
				revenue[i] = readInt();
			}
			for (int i=1; i<=3; i++) {
				for (int j=1; j<=t; j++) {
					if (j-preptime[i]>=0 && preptime[i]+j<=t) {
						dp[i][j] = Math.max(dp[i][j-preptime[i]]+revenue[i], Math.max(dp[i-1][j], dp[i][j]));
					} else {	
						dp[i][j] = Math.max(dp[i][j-1], Math.max(dp[i-1][j], dp[i][j]));
					}
				}
			}
			for (int i[]: dp) {
				System.out.println(Arrays.toString(i));
			}
			System.out.println(dp[3][t]);
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
