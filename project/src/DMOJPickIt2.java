import java.util.*;
import java.io.*;
public class DMOJPickIt2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static int[][] dp;
	static int[] ary;
	public static int recur (int left, int right) { //left and right are the ranges
	    if (left==right) {
	    	return 0;
	    }
	    if (dp[left][right]!=-1) {
	    	return dp[left][right];
	    }
	    int ans = 0;
	    for (int i = left + 1; i <= right-1; i++) { //i=left+1 because we are now going one more to the right, and i<=right-1 because we not going further than that
	    	ans = Math.max(ans, ary[left]+ary[right]+ary[i] + recur(left,i) + recur(i,right) ); 
	    }
	    return dp[left][right] = ans;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while (true) {
			int n = readInt(); //size of list
			ary = new int[n];
			dp = new int[n][n];
			if (n==0) break;
			for (int i=0; i<n; i++) {
				ary[i] = readInt();
			}
			
			for (int i[]: dp) {
				Arrays.fill(i, -1);
			}
			System.out.println(recur(0, n-1));
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
