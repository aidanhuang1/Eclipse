package project;
import java.util.*;
import java.io.*;
public class DMOJAlexandAnimalrights {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static boolean found = false;
	public static int count = 0;

	public static void search (char[][] floor, int r, int c) {
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				BFS(floor, r, c, i, j);
			}
		}
		System.out.println(count);
		return;
	}

	public static void BFS(char[][] floor, int r, int c, int i, int j) {
		if (i<0 || i>=r || j<0 || j>=c || floor[i][j]=='#') {
			return;
		}
		if (floor[i][j] == 'M') {
			if (!found) {
				found = true;
				count++;
			}
		}

		floor[i][j] = '#';
		BFS(floor, r, c, i-1, j);
		BFS(floor, r, c, i+1, j);
		BFS(floor, r, c, i, j-1);
		BFS(floor, r, c, i, j+1);
		found = false;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = readInt(), c = readInt();
		char[][] floor = new char[r][c];
		for (int i=0; i<r; i++) {
			String[] temp = readLine().split("");
			for (int j=0; j<c; j++) {
				floor[i][j] = temp[j].charAt(0);
			}
		}
		search(floor, r, c);

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
