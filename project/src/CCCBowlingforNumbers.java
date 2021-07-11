import java.util.*;
import java.io.*;
public class CCCBowlingforNumbers {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	 * Comments assume that we are using the sample input
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int t = readInt();
		
		while(t-->0) {
			int n = readInt(), k = readInt(), w = readInt(); //n = number of test cases, k = number of bowling balls, w = width of bowling balls
			long[][] dp = new long[k+1][n]; 
			int[] pins = new int[n+1], sums = new int[n];
			for (int i=0; i<n; i++) {
				pins[i] = readInt();
				for (int j=0; j<w; j++){ 
					if (i-j>=0) {
						sums[i] += pins[i-j]; //sums[i] will contain the sum of the pins for the previous 3 pins, except for the first and second pins.
					}
				}
			}
			
//			System.out.println(Arrays.toString(sums));
			for (int i=1; i<=k; i++) {
				dp[i][0] = pins[0]; //we make the first column of everyone row the value (sum) of the first pin
			}
			
			for (int i=1; i<=k; i++) {
				for (int j=0; j<n; j++) {
					if (j-w < 0) { //if we are currently at pin 1, or pin 2 then...
						dp[i][j] = sums[j]; //we only take the sums because j-w would go out of bounds and there isn't any other way regardless
					} else {
						/*
						otherwise the algorithm is the maximum of either the sum + the maximum score with one less ball (previous row),
                      	w width places to the left OR the previous result in the same row one to the left.
                      	
                      	
                      	dp[i-1][j-w] is sensible because we are taking the total sum from that last row
                      	with a distance spacing of w (because of the width) and adding to it
                      	the sum[j], which is the knockable value with its neighbouring pins
                      	
			         	*/

						dp[i][j] = Math.max(dp[i-1][j-w]+sums[j], dp[i][j-1]);
					}
				}
			}

			System.out.println(dp[k][n-1]);	
			
//			for (long[] i: dp) {
//				System.out.println(Arrays.toString(i));
//			}

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
