import java.util.*;
import java.io.*;
public class DMOJLongestCommonSubsequence2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	 * This is LCS but with letters and we also need to find the actual sequence
	 * I use a deque to find the sequence after we filled in the 2d array
	 * so that I can also removelast from deque because the order needs to be reversed
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] s = readLine().split("");
		String[] b = readLine().split("");
		int[][] dp = new int[s.length+1][b.length+1];
		for (int i=1; i<=s.length; i++) {
			for (int j=1; j<=b.length; j++) {
				if (s[i-1].charAt(0)==b[j-1].charAt(0)) {
					dp[i][j] = dp[i-1][j-1]+1;
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		Deque<String> q = new LinkedList<>();
		int i = s.length, j = b.length;
		while(i>0 && j>0) {
			if (dp[i][j] != dp[i-1][j] && dp[i][j] != dp[i][j-1]) {
				q.add(s[i-1]);
				i--;
				j--;
			} else if (dp[i][j] == dp[i-1][j]) {
				i--;
			} else {
				j--;
			}

		}
		while (!q.isEmpty()) {
			System.out.print(q.removeLast());
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
