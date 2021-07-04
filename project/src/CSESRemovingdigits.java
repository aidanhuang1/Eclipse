import java.util.*;
import java.io.*;
public class CSESRemovingdigits {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		int[] dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE/10);
		dp[0] = 0;
		for (int i=1; i<=n; i++) {
			int temp = i;
			while (temp >0) {
				dp[i] = Math.min(dp[i], dp[i-(temp%10)]+1);
				temp/=10;
			}
		}
		System.out.println(dp[n]);

		

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
