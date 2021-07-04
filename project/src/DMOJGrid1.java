import java.util.*;
import java.io.*;
public class DMOJGrid1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static char[][] grids;
	static long[][] dp;
	static int h, w;
	
	public static long search(int r, int c) {
		dp[1][1] = 1;
		for (int i=r; i<=h; i++) {
			for (int j=c; j<=w; j++) {
				if (grids[i][j]=='.') {
					dp[i][j] += dp[i-1][j] + dp[i][j-1];
					dp[i][j]%=MOD;
				} else if (grids[i][j]=='#') {
					dp[i][j] = 0;
				}
			}
		}
		return dp[h][w];
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		h = readInt();
		w = readInt();
		grids = new char[h+1][w+1];
		dp = new long[h+1][w+1];
		for (int i=1; i<=h; i++) {
			String[] temp = readLine().split("");
			for (int j=1; j<=w; j++) {
				grids[i][j] = temp[j-1].charAt(0);
			}
		}
		System.out.println(search(1, 1));


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
