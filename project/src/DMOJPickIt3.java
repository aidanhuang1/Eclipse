import java.util.*;
import java.io.*;
public class DMOJPickIt3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	/*
	 * Bruce's code on DMOJ PickIt
	 */
	public static void main(String[] args) throws IOException {
		while(true) {
			int n = readInt();
			if(n == 0) {
				break;
			}
			int a[] = new int[n+1], dp[][] = new int[n+1][n+1];
			for(int i=1; i<=n; i++) {
				a[i] = readInt();
			}
			for(int len=2; len<n; len++) {
				for(int L=1; L+len<=n; L++) {
					int R = L + len;
					for(int m = L+1; m < R; m++) {
						dp[L][R] = Math.max(dp[L][R], a[L] + a[m] + a[R] + dp[L][m] + dp[m][R]);
					}
						
				}
			}
			for (int i[]: dp) {
				System.out.println(Arrays.toString(i));
			}
			System.out.println(dp[1][n]);
		}
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}