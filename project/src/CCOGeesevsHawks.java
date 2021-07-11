import java.util.*;
import java.io.*;
public class CCOGeesevsHawks {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		char[] result1 = new char[n+1], result2 = new char[n+1];
		int[] goals1 = new int[n+1], goals2 = new int[n+1];
		String[] temp1 = readLine().split("");
		for (int i=1; i<=n; i++) {
			result1[i] = temp1[i-1].charAt(0);
			goals1[i] = readInt();
		}
		String[] temp2 = readLine().split("");
		for (int i=1; i<=n; i++) {
			result2[i] = temp2[i-1].charAt(0);
			goals2[i] = readInt();
		}


		int[][] dp = new int[n+1][n+1];
		int temp = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if (result1[i]=='W' && result2[j]=='L' && goals1[i]>goals2[j]) {
					temp = dp[i-1][j-1] + goals1[i] + goals2[j];
				} else if (result1[i]=='L' && result2[j]=='W' && goals1[i]<goals2[j]) {
					temp = dp[i-1][j-1] + goals1[i] + goals2[j];
				} else {
					temp = 0;
				}
				dp[i][j] = Math.max(temp, Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1])));
			}
		}
		System.out.println(dp[n][n]);

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
