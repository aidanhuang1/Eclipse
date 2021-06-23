import java.util.*;
import java.io.*;
public class findcombinations {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	/*
	 * This is the code for CSES Dice Combinations. It revolves around combinations using for loops
	 * and memoization. You can use this as a template for other problems.
	 * 
	 * In this code, you are looking at the highest possible combinations possible.
	 * You can consider this memoization because you are storing previous answers
	 * and adding to them
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int sum = readInt();
		long[] combinations = new long[sum+1];
		combinations[0] = 1; //set start to 1
		for (int i=1; i<=sum; i++) { //i is dice face
			for (int j=1; j<=6; j++) { //you are comparing to see if it possible to add another combination 
				System.out.println(Arrays.toString(combinations));
				if (i-j >= 0) {
					combinations[i] += combinations[i-j];
				}
			}
			combinations[i] %= 1000000007;
		}
		System.out.println(combinations[sum]);

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
