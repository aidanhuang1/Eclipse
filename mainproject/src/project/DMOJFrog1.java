package project;
import java.util.*;
import java.io.*;
public class DMOJFrog1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt();
		int[] stones = new int[N];
		for (int i=0; i<N; i++) {
			stones[i] = readInt();
		}
		long[] dp = new long[N];
		Arrays.fill(dp, Integer.MAX_VALUE/10);
		dp[0] = 0; //dist to 1st stone is 0
		for (int i=0; i<N-2; i++) {
//			if (N-i>=2) {
				dp[i] = Math.abs(Math.min(stones[i+1]-stones[i], stones[i+2]-stones[i]));
//			}
		}
		System.out.println(Arrays.toString(dp));


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
