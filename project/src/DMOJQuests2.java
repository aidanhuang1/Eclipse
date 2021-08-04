import java.util.*;
import java.io.*;
public class DMOJQuests2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int NPCs = readInt(), hours = readInt();
		long[][] dp = new long[hours+1][2];
		for (int i=1; i<=NPCs; i++) {
			int g = readInt(), h = readInt(), q = readInt(), t = readInt();
			for (int j=0; j<=hours; j++) {
				if (j-h>=0) {
					dp[j][0] = Math.max(dp[j][0], dp[j-h][1]+g);
				}
				if (j-t>=0) {
					dp[j][1] = Math.max(dp[j][0], dp[j-t][1]+q);
				}
			}	
		}
		System.out.println(dp[hours][1]);

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
