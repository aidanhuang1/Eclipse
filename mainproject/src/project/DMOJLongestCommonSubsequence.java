package project;
import java.util.*;
import java.io.*;
public class DMOJLongestCommonSubsequence {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), m = readInt();
		int[] a1 = new int[n], a2 = new int[m];
		for (int i=0; i<n; i++) {
			a1[i] = readInt();
		}
		for (int i=0; i<m; i++) {
			a2[i] = readInt();
		}
		int[][] grid = new int[n+1][m+1];
		for (int i=1; i<=n; i++) {
			for (int j=1; j<m; j++) {
				
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
