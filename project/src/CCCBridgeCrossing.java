import java.util.*;
import java.io.*;
public class CCCBridgeCrossing {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	/*dp[i] is the earliest possible time that person i is about to cross
	 *
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int m = readInt(), q = readInt(); //m is the size of the group that can be on the bridge, q is the length of the queue waiting to cross
		String[] queueperson = new String[101];
		int[] queuetime = new int[101], path = new int[101];
		int[][] dp = new int[101][21];
		
		for (int i=1; i<=q; i++) {
			queueperson[i] = readLine();
			queuetime[i] = readInt();
		}
		
		for (int i = 1; i <= q; i++)
		{
			for (int j = 1; j <= m; j++)
			{
				if (j == 1)
				{
					dp[i][j] = dp[i - 1][1] + queuetime[i];
					path[i] = 1;
				}
				else
				{
					int slowest = queuetime[i];
					int best = Integer.MAX_VALUE;
					for (int k = 1; k <= j && i-k+1 >=1; k++) //travers all k possible group mates
					{
						slowest = Math.max(slowest, queuetime[i - k + 1]);
						if (best > dp[i - k][j] + slowest)
						{
							best = dp[i - k][j] + slowest;
							path[i] = k;

						}
					}
					dp[i][j] = best;
				}

			}
		}

		Stack <String> s = new Stack<>();
		int num = path[q];
		int person = q;

		while (person > 0) {
			String tmp = queueperson[person];
			for (int i = 1; i < num; i++)
			{
				tmp = queueperson[person - i] + " " + tmp;
			}
			s.push(tmp);

			person -= num;
			if (person <= 0)
				continue;
			num = path[person];
		}

		System.out.println("Total Time: "+dp[q][m]+"\n");
		while (!s.empty())
		{
			System.out.println(s.pop()+ "\n");
		}
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
