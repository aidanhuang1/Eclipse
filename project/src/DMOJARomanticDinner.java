import java.util.*;
import java.io.*;
public class DMOJARomanticDinner {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int M = readInt(), U = readInt(), R = readInt();
		int[] V = new int[R+1], T = new int[R+1], F = new int[R+1];
		for (int i=1; i<=R; i++) {
			V[i] = readInt();
			T[i] = readInt();
			F[i] = readInt();
		}
		int[][][] dp = new int[R+1][M+1][U+1];
//		for (int[][] i: dp) {
//			for (int[] j: i) {
//				Arrays.fill(j, -1);
//			}
//		}
//		for (int[] i: dp[0]) {
//			Arrays.fill(i, 0);
//		}

		for (int i=1; i<=R; i++) { //row (restaurants)
			for (int j=1; j<=M; j++) { //col (minutes passed)
				for (int k=1; k<=U; k++) { //array (the size-1 is the number of units of food that can be consumed, where the maximum units is U)
					if (j-T[i]>=0 && k-F[i]>=0) { //if satisfies time and food 
						dp[i][j][k] = Math.max(dp[i][j][k], Math.max(dp[i-1][j][k], dp[i-1][j-T[i]][k-F[i]] +V[i])); //why does this relationship work?? why not dp[i][j-T[i]][k]] +V[i] ( dp[i-1] because we are looking at our previous results from last row if any)
						//Math.max(dp[i][j][k], Math.max(dp[i-1][j][k], dp[i-1][j-T[i]][k] +V[i])); could be used if it were unbounded knapsack, because k-F[i] depends on the previous result, and at index 0 of k, the value is 0 (meaning there is no impression value there)
					} else {
						dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][j][k]);
					}
				}
			}
		}
		
		
		for (int[][] i: dp) {
			for (int[] j: i) {
				System.out.print(Arrays.toString(j)+" ");
			}
			System.out.println();
		}
		
		System.out.println(dp[R][M][U]);

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
