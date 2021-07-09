import java.util.*;
import java.io.*;
public class DMOJCodingSpree {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), t = readInt();
		int[] dp = new int[t+1]; 
		for (int i=0; i<n; i++) {
			int points = readInt();
			int hours = readInt();
			for (int j=t; j>=0; j--) {
				if (j-hours>=0) {
					dp[j] = Math.max(dp[j], dp[j-hours]+points);
				}
			}
		}
		System.out.println(dp[t]);
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
