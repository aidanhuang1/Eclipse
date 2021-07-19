import java.util.*;
import java.io.*;
public class CCCBridgeCrossing {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//dp[i][j] is the shortest time it takes for all i people to cross with bridge size of j

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int m = readInt(), q = readInt(); //m is the size of the group that can be on the bridge, q is the length of the queue waiting to cross
		String[] queueperson = new String[101];
		int[] queuetime = new int[101];
		for (int i=1; i<=q; i++) {
			queueperson[i] = readLine();
			queuetime[i] = readInt();
		}
		for (int i=1; i<=q; i++) { //5
			for (int j=1; j<=m; j++) { //2 
				
			}
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
