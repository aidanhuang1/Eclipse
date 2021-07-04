import java.util.*;
import java.io.*;
public class DMOJSimonandMarcy {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c = readInt(), m = readInt();
		int[] dp = new int[m+1];
		for (int i=1; i<=c; i++) {
			int n = readInt(), k = readInt(); //n = value, k = cost
			for (int j=m; j>=k; j--) { //j starts from max capacity and goes down until j is equal to k (and in which j-k == 0)
				dp[j] = Math.max(dp[j-k]+n, dp[j]);
			}
			System.out.println(Arrays.toString(dp));
		}
		System.out.println(dp[m]);
		

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
