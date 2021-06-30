import java.util.*;
import java.io.*;
public class CSESEditDistance {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	static String s1, s2;
	static int[][] dp;
	
	/*
	 * Code retrieved from another user on CSES
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		s1 = in.next();
		s2 = in.next();
		
		dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i = 1; i < dp.length; i++) {
			dp[i][0] = i;
		}
		
		for(int j = 1; j < dp[0].length; j++) {
			dp[0][j] = j;
		}
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[i].length; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j-1], dp[i][j-1]), dp[i-1][j]);
				}
			}
		}
		
		System.out.println(dp[s1.length()][s2.length()]);
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
