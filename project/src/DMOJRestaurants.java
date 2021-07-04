import java.util.*;

import java.io.*;
public class DMOJRestaurants {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), t = readInt(), k = readInt(), v = readInt();
		boolean[] dp = new boolean[n+1];
		for (int i=0; i<v; i++) {
			dp[readInt()] = true;
		}
		int sa = n/t+1;
		System.out.println(sa);
		int[] subarrays = new int[sa];
		int buffer = n%t;
		for (int i=0; i<n/t; i++) {
			subarrays[i] = 1 + (i*t);
		}
		if (buffer != 0) {
			subarra
		}
		System.out.println(Arrays.toString(subarrays));
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
