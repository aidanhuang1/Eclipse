import java.util.*;
import java.io.*;
public class CSESMinimizingCoins {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] coins;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), x = readInt(); //n is number of coins, x is the sum that we want
		coins = new int[n]; //array that holds all the coins we can use
		for (int i=0; i<n; i++) {
			coins[i] = readInt();
		}

		int[] dp = new int[x+1];
		Arrays.fill(dp, Integer.MAX_VALUE/10); //Max_Value because we are looking for the smallest (minimum) number of coins needed
		dp[0] = 0; //to get a sum of 0 we don't need any coins

		for (int i=1; i<=x; i++) {
			for (int j: coins) {
				if (i-j >= 0) { //to make sure that i-j is not out of bounds
					dp[i] = Math.min(dp[i], dp[i-j]+1);
					
				}
				
			}
			System.out.println(Arrays.toString(dp));
		}
		if (dp[x] == Integer.MAX_VALUE/10) { //dp at index x will be the minimum number of coins
			System.out.println(-1);
			System.exit(0);
		}

		System.out.println(dp[x]);



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
