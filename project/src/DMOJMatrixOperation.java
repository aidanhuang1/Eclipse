import java.util.*;
import java.io.*;
public class DMOJMatrixOperation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	public static int n, previous = 0, size = 0;
	public static boolean[][] visited;
	
	//Code is complete, rewrite parts of it and submit

	public static int search(int[][] matrix, int row, int col, int prev) {
		if (row <= 0 || row >= n+1 || col <= 0 || col>=n+1) {
			return 0;
		}
		int ret = 0;
		if (prev <= matrix[row][col]) { //as you are iterating through every grid in the matrix, you are also using dfs to find and traverse paths that are increasing
			ret = Math.max(ret, search(matrix, row-1, col, matrix[row][col])+1);
			ret = Math.max(ret, search(matrix, row+1, col, matrix[row][col])+1);
			ret = Math.max(ret, search(matrix, row, col-1, matrix[row][col])+1);
			ret = Math.max(ret, search(matrix, row, col+1, matrix[row][col])+1);
		}
		return ret;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		n = readInt();

		int[][] matrix = new int[n+1][n+1];
		visited = new boolean[n+1][n+1];
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				int x = readInt();
				matrix[i][j] = x;
			}
		}
		int best = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				best = Math.max(best, search(matrix, i, j, 0));
				System.out.println(best+"   "+i+" "+j);
			}
		}
		System.out.println(best-1);



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
