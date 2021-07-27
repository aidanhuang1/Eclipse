import java.util.*;
import java.io.*;
public class DMOJNotEnoughTime {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), t = readInt();
		int[] dp = new int[10001];
		for (int l=0; l<n; l++) {

			int[] revenue = new int[2001], preptime = new int[2001];
			for (int i=1; i<=3; i++) {
				preptime[i] = readInt();
				revenue[i] = readInt();
			}
			dp[0] = 0;
			for (int j = 1; j <= n; j++) {
				for (int i = t; i >= 0; i--) {
					for (int k = 0; k < 3; k++) {
						if (i >= time[j][k]) {
							dp[i] = max(dp[i], dp[i - t[j][k]] + v[j][k]);
						}
					}
				}
			}
			System.out.println(Arrays.toString(dp));
			System.out.println(dp[t]);
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
