import java.util.*;
import java.io.*;
public class DMOJDeque {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	 * dp[i][j] states that the maximum difference we can attain by considering only numbers 
	 * from index starting from i and terminating at j.
	 * 
	 * 
	 * links: https://codeforces.com/blog/entry/77272
	 * https://www.youtube.com/watch?v=-k4rwrXn8Ug&t=746s
	 * 
	 * HOW THE CODE WORKS:
	 * 
	 * Let's say that rows are player 1, and columns are player 2.
	 * If we starting from the top-left corner (which we aren't in this code but we do in https://www.youtube.com/watch?v=-k4rwrXn8Ug&t=746s) 
	 * we can see that at (0, 1), our neighbours to the left and to the bottom are 10 and 80
	 * these two numbers represent the starting two numbers in our sequence.
	 * If player 1 takes 10 and player 2 takes 80, the difference would be 70 (as shown on the 2d array)
	 * We are currently on the second layer, in this code, we are moving up and iterating every column from left to right
	 * We must look at the neighbouring numbers to the bottom and to the left of the grid that we are on
	 * 
	 * Our choices are either taking the number to the left or the number to the bottom. 
	 * At the start, our number at (2, 3) is 60 because 90 - 30 = 60 and this is also because if player 1 takes 30 first and player 2 takes 90, the difference would be 60
	 * 
	 * When the second layer is filled in, we then move on to doing the third layer, etc...
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		long[][] dp = new long[n][n];
		int[] seq = new int[n];
		for (int i=0; i<n; i++) {
			int temp = readInt();
			seq[i] = temp;
			dp[i][i] = temp;
		}
		
		
		for (int i=n-1; i>=0; i--) { //starting from the last row to the first
			for (int j=i+1; j<n; j++) {
				dp[i][j] = Math.max(seq[i]-dp[i+1][j], seq[j]-dp[i][j-1]); //we use math.max because the problem states both players want to maximize their differences so we take whatever's larger
				//seq[i] and seq[j] represent the two scores that the player can get because he has a choice of choosing the first or the last number
				//-dp[i+1][j] and -dp[i][j-1] represent the opponent's score and it is subtracted to seq to get the difference (we want max difference)
				
				
				
				for (long[] x: dp) {
					System.out.println(Arrays.toString(x));
				}
				System.out.println((seq[i]-dp[i+1][j])+" "+(seq[j]-dp[i][j-1]));
				System.out.println(seq[i]+" "+"-"+dp[i+1][j]+"     "+seq[j]+" "+"-"+dp[i][j-1]);
				System.out.println();
			}

		}

		System.out.println(dp[0][n-1]);

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
