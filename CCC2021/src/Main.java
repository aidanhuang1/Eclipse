import java.util.*;
import java.io.*;
public class Main {

	public static class Grid {
		int row;
		int column;
		public Grid(int row, int column) {
			this.row = row;
			this.column = column;
		}
	}

	public static String BFS(ArrayList<Grid>[] grids, int m, int n, int[][] rooms) {
		boolean[][] visited = new boolean[m+1][n+1];
		Queue<Grid> queue = new LinkedList<>();
		queue.add(new Grid(1,1));
		visited[1][1] = true;	

		while (!queue.isEmpty()) {
			Grid temp = queue.poll();
			if (temp.row==m && temp.column==n) {
				return "yes";
			}
			for (Grid grid: grids[rooms[temp.row][temp.column]]) {
				int r = grid.row;
				int c = grid.column;
				if (!visited[r][c]) {
					queue.add(new Grid(r, c));
					visited[r][c] = true;
				}
			}

		}
		return "no";
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine()); 
		int n = Integer.parseInt(br.readLine()); 
		ArrayList<Grid>[] grids = new ArrayList[1000010];
		int[][] rooms = new int[m+1][n+1];
		for (int i = 1; i <= 1000010; i++) { //initalize
			grids[i-1] = new ArrayList<Grid>();
		}

		for (int i=1; i<=m; i++) {
			String[] temp = br.readLine().split(" ");
			for (int j=1; j<=n; j++) {
				grids[i*j].add(new Grid(i, j));
				rooms[i][j] = Integer.parseInt(temp[j-1]);
			}
		}

		System.out.println(BFS(grids, m, n, rooms));

	}
}