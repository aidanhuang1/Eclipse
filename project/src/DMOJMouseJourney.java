import java.util.*;
import java.io.*;
public class DMOJMouseJourney {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int r = readInt(), c = readInt(), k = readInt();
		int[][] cages = new int[r+1][c+1];
		for (int i=0; i<k; i++) {
			int row = readInt(), col = readInt();
			cages[row][col] = -1;
		}
		cages[1][1] = 1;
		for (int i=1; i<=r; i++) {
			for (int j=1; j<=c; j++) {
				if (cages[i][j]!=-1) {
					if (cages[i-1][j]>=0) cages[i][j]+=cages[i-1][j];
					if (cages[i][j-1]>=0) cages[i][j]+=cages[i][j-1];
				}
			}
		}
		System.out.println(cages[r][c]);

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
