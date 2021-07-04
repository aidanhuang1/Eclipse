import java.util.*;
import java.io.*;
public class DMOJStones {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int n = readInt(), k = readInt();
		int[] stones = new int[n];
		for (int i=0; i<n; i++) {
			stones[i] = readInt();
		}
		boolean[] dp = new boolean[k+1];
		for (int i=1; i<=k; i++) {
			for (int j: stones) {
				if (i-j>=0) {
					if (!dp[i-j]) {
						dp[i] = true;
					}
				}
			}
		}
		System.out.println((dp[k]) ? "First" : "Second");

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
