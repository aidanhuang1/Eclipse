import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt();
		int sum = N*(N+1)/2;
		if (sum%2==1) {
			System.out.println(0);
			return;
		}
		int max = sum/2;
		long[] dp = new long[max+1];
		dp[0] = 1;
		for (int i = 1; i<=N; i++) {
			for (int j = max-i; j>=0; j--) {
				dp[i+j]=(dp[i+j]+dp[j])%1000000007;
			}
		}
		System.out.println((dp[max]/2));
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
