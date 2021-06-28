import java.util.*;
import java.io.*;
public class DMOJMatrixOperation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	public static int n, previous = 0, size = 0;
	public static boolean[][] visited;
	public static boolean search(int[][] matrix, int row, int col, int prev) {
		if (row <= 0 || row >= n+1 || col <= 0 || col>=n+1 || visited[row][col] == true) {
			return false;
		}
		System.out.println(row+" "+col);
		if (prev <= matrix[row][col]) {
			visited[row][col] = true;
			size++;
			int direction = 0; //0 = left, 1 = down, 2 = right, 3 = up
			if (matrix[row+1][col]>=matrix[row][col]) {
				direction = 1;
			}
			if (matrix[row][col+1]>=matrix[row][col]) {
				direction = 2;
			}
			if (matrix[row-1][col]>=matrix[row][col]) {
				direction = 3;
			}

			switch (direction) {
			case 0:
				search(matrix, row, col-1, matrix[row][col]);
			case 1:
				search(matrix, row+1, col, matrix[row][col]);
			case 2:
				search(matrix, row, col+1, matrix[row][col]);
			case 3:
				search(matrix, row-1, col, matrix[row][col]);
			}


		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		n = readInt();
		int startrow = 0, startcol = 0, start = Integer.MAX_VALUE;
		int[][] matrix = new int[n+2][n+2];
		visited = new boolean[n+1][n+1];
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				int x = readInt();
				matrix[i][j] = x;
				if (x<start) {
					start = x;
					startrow = i;
					startcol = j;
				}
			}
		}
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				search(matrix, i, j, 0);//change it to i, j
			}
		}
		System.out.println(size);



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
