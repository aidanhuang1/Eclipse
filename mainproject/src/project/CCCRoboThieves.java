package project;
import java.util.*;
import java.io.*;
public class CCCRoboThieves {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	/*We use a 2d array using BFS
	 * Create a boolean 2d array for unaccessible
	 * At the beginning we look at all the grids with C (camera), if there is a camera
	 * on that grid we look left right up and down.
	 * If we find a . we go there and mark it as unaccessible
	 * if we find a conveyor we go there but we do not mark it unaccessible, but we call
	 * recursively and look at its neighbours 
	 * 
	 * Once we are done, we move on to the main method
	 * 
	 * 
	 * 
	 * We create a dist array, making all values max value
	 * as we start from S and look for . and when we get there we update dist if dist is greater than the steps
	 * if we find a C in the same room (we look at unaccessible), we cannot go there
	 * 
	 * if we find a C in the same room but we are currently on a conveyor (we look at unaccesible), we can keep going
	 * it is if we are on a . and we see a camera that we cannot keep going
	 * 
	 * if we are on a conveyor we do not add to distance
	 * 
	 * 
	 * and once we visit a grid, we make it W
	 * 
	 * 
	 * 
	 * At the end, after we have all our distances for every .
	 * We iterate from top left to bottom right outputting distances
	 * 
	 */

	static class rcgrid {
		int row;
		int col;
		public rcgrid (int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static boolean[][] noaccess;
	static int N, M, startrow, startcol;
	static char[][] grid;
	static Queue<rcgrid> q = new LinkedList<>();
	static int[][] dist;
	static char[][] copy;



	public static void bfscamup(int row, int col) {
		if (row < 0 || row >= N || col < 0 || col >= M || grid[row][col]=='W') {
			return;
		}
		noaccess[row][col] = true;
		if (grid[row][col]=='L' || grid[row][col]=='R' || grid[row][col]=='U' || grid[row][col]=='D') {
			noaccess[row][col] = false;
		}

		bfscamup(row-1, col);
	}

	public static void bfscamright(int row, int col) {
		if (row < 0 || row >= N || col < 0 || col >= M || grid[row][col]=='W') {
			return;
		}
		noaccess[row][col] = true;
		if (grid[row][col]=='L' || grid[row][col]=='R' || grid[row][col]=='U' || grid[row][col]=='D') {
			noaccess[row][col] = false;
		}

		bfscamright(row, col+1);
	}

	public static void bfscamdown(int row, int col) {
		if (row < 0 || row >= N || col < 0 || col >= M || grid[row][col]=='W') {
			return;
		}
		noaccess[row][col] = true;
		if (grid[row][col]=='L' || grid[row][col]=='R' || grid[row][col]=='U' || grid[row][col]=='D') {
			noaccess[row][col] = false;
		}

		bfscamdown(row+1, col);
	}

	public static void bfscamleft(int row, int col) {
		if (row < 0 || row >= N || col < 0 || col >= M || grid[row][col]=='W') {
			return;
		}
		noaccess[row][col] = true;
		if (grid[row][col]=='L' || grid[row][col]=='R' || grid[row][col]=='U' || grid[row][col]=='D') {
			noaccess[row][col] = false;
		}

		bfscamleft(row, col-1);
	}


	public static void cameras() {
		for (rcgrid i: q) {
			noaccess[i.row][i.col] = true;
			bfscamup(i.row-1, i.col);
			bfscamright(i.row, i.col+1);
			bfscamdown(i.row+1, i.col);
			bfscamleft(i.row, i.col-1);
		}
	}

	public static void bfs(int count, int row, int col, boolean[][]newarray) {

		if (row < 0 || row >= N || col < 0 || col >= M ) return; 

		if (count<dist[row][col]) { 
			dist[row][col] = count;
			if (newarray[row][col]==true) {
				newarray[row][col] = false;
			}
		}

		if (grid[row][col]=='W' || newarray[row][col]==true || grid[row][col]=='C') {
			newarray[row][col] = true;
			return;
		}


		if (grid[row][col]=='L'  && noaccess[row][col-1]==false) {
			newarray[row][col] = true;
			bfs(count, row, col-1, newarray);
		}
		else if (grid[row][col]=='U' && noaccess[row-1][col]==false) {
			newarray[row][col] = true;
			bfs(count, row-1, col, newarray);
		}
		else if (grid[row][col]=='R' && noaccess[row][col+1]==false) {
			newarray[row][col] = true;
			bfs(count, row, col+1, newarray);
		}
		else if (grid[row][col]=='D' && noaccess[row+1][col]==false) {
			newarray[row][col] = true;
			bfs(count, row+1, col, newarray);
		}
		else if (grid[row][col]=='.' || grid[row][col]=='S') {
			newarray[row][col] = true;
			if (noaccess[row-1][col]==false) {  

				bfs(count+1, row-1, col, newarray);
			}
			if (noaccess[row][col+1]==false) {
				bfs(count+1, row, col+1, newarray);
			}
			if (noaccess[row+1][col]==false) {
				bfs(count+1, row+1, col, newarray);
			}
			if (noaccess[row][col-1]==false) { 

				bfs(count+1, row, col-1, newarray);
			}
		}
	}

	public static void search() {
		dist = new int[N][M];
		for (int[] i: dist) {
			Arrays.fill(i, Integer.MAX_VALUE);
		}
		dist[startrow][startcol] = 0;
		boolean[][] newarray = new boolean[N][M];
		if (noaccess[startrow][startcol]) {
			dist[startrow][startcol] = Integer.MAX_VALUE;
		} else {
			bfs(0, startrow, startcol, newarray);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = readInt();
		M = readInt();
		Queue<rcgrid> clone = new LinkedList<rcgrid>();
		grid = new char[N][M];
		noaccess = new boolean[N][M];
		for (int i=0; i<N; i++) {
			String[] temp = readLine().split("");
			for (int j=0; j<M; j++) {
				grid[i][j] = temp[j].charAt(0);
				if (grid[i][j]=='.') {
					clone.add(new rcgrid(i, j));
				}
				else if (grid[i][j]=='C') {
					q.add(new rcgrid(i, j));
				}
				else if (grid[i][j]=='S') {
					startrow = i;
					startcol = j;
				}

			}
		}

		cameras();

		search();
		while (!clone.isEmpty()) {
			rcgrid temp = clone.poll();
			if (dist[temp.row][temp.col]==Integer.MAX_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(dist[temp.row][temp.col]);
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
