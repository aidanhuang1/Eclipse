package project;
import java.util.*;
import java.io.*;
public class DMOJTheTriangle {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
//	static int max()

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt();
		int[][] triangle = new int[N][N];
		int[] dp = new int[N];
		for (int i=0; i<N; i++) {
			Arrays.fill(triangle[i], -1);
			for (int j=0; j<i+1; j++) {
				triangle[i][j] = readInt();
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
