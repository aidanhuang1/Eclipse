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
		Deque<Integer> dq = new LinkedList<>();
		int count = 0, same_segment = 0;
		for (int i=1; i<=n; i++) {
			if (dp[i]) {
				same_segment++;
			} else if (!dp[i]) {
				dq.add(i);
			}
			if (i%t==0 && same_segment >= k) {
				same_segment = 0;
			}
			else if (i%t==0 && same_segment < k) {
				while (same_segment < k) {
					dp[dq.removeLast()] = true;
					same_segment++;
					count++;
				}
				same_segment = 0;
			}System.out.println(Arrays.toString(dp)+" "+same_segment);
		}
		
		System.out.println(count);
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
