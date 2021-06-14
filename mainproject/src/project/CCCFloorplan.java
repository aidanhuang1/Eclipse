package project;
import java.util.*;
import java.io.*;
public class CCCFloorplan {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static char[][] floorplan;
	static int r, c, tiles, wood;
	static List<Integer> list = new ArrayList<>();
	
	public static void search() {
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				tiles = 0;
				path(i, j);
				if (tiles!=0)
				list.add(tiles);
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		int rooms = 0;
		while (!list.isEmpty()) {
			int temp = list.remove(0);
			if ((wood-temp)<0) {
				break;
			}
			wood-=temp;
			rooms++;
		}
		if (rooms==1) {
			System.out.printf("%d room, %d square metre(s) left over",rooms, wood);
		} else {
			System.out.printf("%d rooms, %d square metre(s) left over",rooms, wood);
		}
		
	}
	
	public static void path(int i, int j) {
		if (i<0 || i>=r || j<0 || j>=c || floorplan[i][j]=='I') {
			return;
		}
		if (floorplan[i][j]=='.') {
			tiles++;
		}
		floorplan[i][j] = 'I';
		path(i+1,j);
		path(i-1,j);
		path(i,j+1);
		path(i,j-1);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		wood = readInt();
		r = readInt();
		c = readInt();
		floorplan = new char[r][c];
		for (int i=0; i<r; i++) {
			String[] temp = readLine().split("");
			for (int j=0; j<c; j++) {
				floorplan[i][j] = temp[j].charAt(0);
			}
		}
		search();
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
