package project;
import java.util.*;
import java.io.*;
public class CCCMaze {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int r, c;
	static boolean found;
	static int[][] min = new int[1000][1000];

	public static int search(String[][] map) {
		found = false;
		for (int[] i: min) {
			Arrays.fill(i, Integer.MAX_VALUE);
		}

		bfs(map, 0, 0, 1);

		if (min[r-1][c-1]!=Integer.MAX_VALUE) {
			return min[r-1][c-1];
		}
		return -1;
	}


	public static void bfs(String[][] map, int x, int y, int count) {
		if (x<0 || x>=r || y<0 || y>=c) {
			return;
		}	


		String temp = map[x][y];

		if (!temp.equals("*")) {
			
			if (min[x][y]>count) {		
				
				
				min[x][y] = count;
				map[x][y] = "*";
				if (temp.equals("-")) {
					bfs(map, x, y-1, count+1);
					bfs(map, x, y+1, count+1);
				}	
				else if (temp.equals("|")) {
					bfs(map, x+1, y, count+1);	
					bfs(map, x-1, y, count+1);	
				}
				else if (temp.equals("+")) {
					bfs(map, x, y+1, count+1);
					bfs(map, x, y-1, count+1);
					bfs(map, x-1, y, count+1);
					bfs(map, x+1, y, count+1);
				}

			} else if (temp.equals("*")) {
				min[x][y] = Integer.MAX_VALUE;
			}
		}


	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int t = readInt();

		for (int i=0; i<t; i++) {

			r = readInt();
			c = readInt();
			String[][] map = new String[r][c];
			for (int j=0; j<r; j++) {
				String[] temp = readLine().split(""); //input
				for (int k=0; k<c; k++) {
					map[j][k] = temp[k];
				}
			}
			System.out.println(search(map));

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
