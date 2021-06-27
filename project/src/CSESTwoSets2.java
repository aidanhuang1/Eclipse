import java.util.*;
import java.io.*;
public class CSESTwoSets2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt();
		int sum = N*(N+1)/2;
		if (sum%2==1) { //if odd, there are no solutions
			System.out.println(0);
			return;
		}
		int max = sum/2; //max is value of each group
		long[] dp = new long[max+1];
		dp[0] = 1; //base case
		for (int i = 1; i<=N; i++) { //N is 1,2,3,4,...N
			for (int j = max-i; j>=0; j--) { //j = max-i, j will be where you start from since it is the most that is remaining after max-i.

				dp[i+j]=(dp[i+j]+dp[j]); //i+j will decrement inside the inner for loop, dp[j] will keep going down
				dp[i+j]%=2000000014;
			}
		}
		System.out.println(dp[max]/2);
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