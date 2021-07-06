import java.util.*;
import java.io.*;
public class DMOJKeepontruckin {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a = readInt(), b = readInt(), n = readInt();

		boolean[] motels = new boolean[7001];
		for (int i=0; i<n; i++) {
			motels[readInt()] = true;
		}
		motels [0] = true;
		motels [990] = true;
		motels [1010] = true;
		motels [1970] = true;
		motels [2030] = true;
		motels [2940] = true;
		motels [3060] = true;
		motels [3930] = true;
		motels [4060] = true;
		motels [4970] = true;
		motels [5030] = true;
		motels [5990] = true;
		motels [6010] = true;
		motels [7000] = true;
		
		long[] dp = new long[7001];
		dp[0] = 1;
		for (int i=0; i<=7000; i++) {
			if (motels[i]) {
				for (int j=a; j<=b; j++) {
					if (i+j <= 7000 && motels[i+j]) {
						dp[i+j] += dp[i];
					}
				}
			}
		}
		System.out.println(dp[7000]);
		

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
