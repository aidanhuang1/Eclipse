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
			neighboursums = numbers.clone(); //make a copy
			for (int i=1; i<=n; i++) {
				if (i+1<=n) {
					neighboursums[i] += numbers[i+1];
				}
				if (i-1>=1) {
					neighboursums[i] += numbers[i-1];
				}
			}
			//so now we have our numbers and the neighbouring sums
			
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=n; j++) {
					
				}
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
