import java.util.*;
import java.io.*;
public class DMOJPickIt {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static int[] nums, sums;
	static int[][] dp;
	
	/*
	 * Interval DP
	 */
	
	public static int search(int l, int r) {
		int temp = 0;
		if (l==r) {
			return 0;
		}
		else if (dp[l][r]!=-1) {
			return dp[l][r];
		}
		for (int i=l+1; i<=r-1; i++) {
			int sum = nums[i]+nums[l]+nums[r];
			temp = Math.max(temp, sum+search(l,i)+search(i,r));
		}
		return dp[l][r] = temp;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while (true) {
			int n = readInt();
			if (n==0) break;
			nums = new int[n];
			sums = new int[n];
			for (int i=0; i<n; i++) {
				nums[i] = readInt();
			}
			for (int i=1; i<n-1; i++) {
				sums[i] = nums[i]+nums[i-1]+nums[i+1];
			}
			dp = new int[n][n];
			for (int i[]: dp) {
				Arrays.fill(i, -1);
			}
			System.out.println(search(0, n-1));
			
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
