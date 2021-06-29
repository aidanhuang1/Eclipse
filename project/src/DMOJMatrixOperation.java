import java.util.*;
import java.io.*;
public class DMOJMatrixOperation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	public static int n;
	public static long[][] store, matrix;
	public static int[] moveR = {-1, 0, 1, 0}, moveC = {0, -1, 0, 1};

	public static long search(int row, int col) {
		if (store[row][col] != -1) {
			return store[row][col];
		}

		long value = 0;
		for (int i=0; i<moveR.length; i++) {
			int newrow = row+moveR[i], newcol = col+moveC[i];
			if (newrow >= 0 && newrow <n && newcol>=0 && newcol<n && matrix[newrow][newcol] > matrix[row][col]) {
				value = Math.max(value, search(newrow, newcol)+1);
			}
		}
		store[row][col] = Math.max(store[row][col], value);
		return value;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		n = readInt();
		long max = 0;
		matrix = new long[n][n];
		store = new long[n][n];
		for (long[] i: store) {
			Arrays.fill(i, -1);
		}

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				matrix[i][j] = readLong();
			}
		}	

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {	
				max = Math.max(search(i, j), max);
			}
		}
		System.out.println(max);

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
