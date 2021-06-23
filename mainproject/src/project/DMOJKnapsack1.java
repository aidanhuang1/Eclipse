package project;
import java.util.*;
import java.io.*;
public class DMOJKnapsack1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), W = readInt();
		long[] knapsack = new long[100001];
		for (int i=1; i<=N; i++) {
			int w = readInt(), v = readInt();
			for (int j=W; j>=w; j--) {
				knapsack[j] = Math.max(knapsack[(j-w)] + v, knapsack[j]);
			}
		}
		
		Arrays.sort(knapsack);
		System.out.println(knapsack[100000]);

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
