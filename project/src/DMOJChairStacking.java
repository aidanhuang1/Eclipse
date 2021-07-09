import java.util.*;
import java.io.*;
public class DMOJChairStacking {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static int[][] dp;
	static int n, x_max, y_max;
	static boolean[][] visited;
	/*
	 * Maybe it is like we start off with putting chair locations on a 2d array
	 * Find distance to every grid for every chair and add the values for each chair at that grid.
	 *  At tthe end we find the grid with the lowest value
	 */
	
	public static int traverse(int i, int j, int value) {
		if (i<=0 || i>y_max || j<=0 || j>x_max || visited[i][j]) {
			return 0;
		}
		visited[i][j] = true;
		
		dp[i][j] += value;
		traverse(i-1, j, value+1);
		traverse(i+1, j, value+1);
		traverse(i, j-1, value+1);
		traverse(i, j+1, value+1);
		return 0;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		n = readInt();
		int[] x = new int[n+1], y = new int[n+1];
		x_max = 0;
		y_max = 0;
		for (int i=0; i<n; i++) {
			x[i] = readInt();
			y[i] = readInt();
			x_max = Math.max(x_max, x[i]);
			y_max = Math.max(y_max, y[i]);
		}
		dp = new int[y_max+1][x_max+1];
		for (int i=0; i<x.length; i++) {
			visited = new boolean[y_max+1][x_max+1];
			traverse(y[i], x[i], 0);
		}
//		for (int i[]: dp) {
//			System.out.println(Arrays.toString(i));
//		}
		int min = Integer.MAX_VALUE;
		for (int i=1; i<=y_max; i++) {
			for (int j=1; j<=x_max; j++) {
				min = Math.min(min, dp[i][j]);
			}
		}
		System.out.println(min);
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
