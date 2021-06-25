package project;
import java.util.*;
import java.io.*;
public class CSESBookShop {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	//This is an 0/1 knapsack problem

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), max = readInt();
		long[] dp = new long[100001];
		for (int i=0; i<n; i++) {
			int cost = readInt(), pages = readInt();
			for (int )
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
