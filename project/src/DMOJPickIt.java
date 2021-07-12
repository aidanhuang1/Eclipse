import java.util.*;
import java.io.*;
public class DMOJPickIt {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	/*
	 * Create a 2d array
	 * dp[i][j] represents the current max score where i is the # of times a number is remove and j is the number location
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while (true) {
			int n = readInt(); //size of list
			if (n==0) break;
			int[] numbers = new int[n+1], neighboursums = new int[n+1];
			for (int i=1; i<=n; i++) {
				numbers[i] = readInt();
			}
//			neighboursums = numbers.clone(); //make a copy
			for (int i=2; i<n; i++) {
//				if (i+1<=n) {
					neighboursums[i] += numbers[i];
					neighboursums[i] += numbers[i+1];
//				}
//				if (i-1>=1) {
					neighboursums[i] += numbers[i-1];
//				}
			}
			System.out.println(Arrays.toString(neighboursums));
			//so now we have our numbers and the neighbouring sums
			int[][] dp = new int[n+1][n+1];
			for (int i=1; i<=n; i++) {
				int size = n;
				for (int j=1; j<=n; j++) {
					if (size>2) { //if it is within the size constraints
						dp[i][j] = Math.max(dp[i-1][j-1], dp[i][j-1]+neighboursums[j]);
						size++;
					}
				}
			}
			for (int i[]: dp) {
				System.out.println(Arrays.toString(i));
			}
			
			
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
