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
		
		dp[0] = 0;
		for (int i=0; i<N; i++) { //the stone that we are on currently
			for (int j=i+1; j<=i+2; j++) { //this loop is because we can jump to the next stone, or the stone after it (so i+1 or i+2 but we can't go any farther than at most 2 jumps)
				if (j<N) { //to make sure that the stone we want to jump to is not out of bounds
					dp[j] = Math.min(dp[j], dp[i]+Math.abs(stones[i]-stones[j]));
					//the stone that we are jumping to will be the distance cost to get to the stone we are currently on
					//plus the cost of the stone that we will be jumping to.
				}
			}
		}
		System.out.println(dp[N-1]); //dp[N-1] will contain the minimum total cost to get to the last stone.
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
