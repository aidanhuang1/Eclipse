import java.util.*;
import java.io.*;
public class Comparators {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	/*
	 * What a Comparator does is compare two objects as follows, based on our
comparison criteria:
If object x is less than object y, return a negative integer.
If object x is greater than object y, return a positive integer.
If object x is equal to object y, return 0.

In Java there is: Comparable, and Comparator. They essentially serve the same purpose, but Comparable is generally easier and shorter to code.
 Comparable is a function implemented within the class containing the custom object, while Comparator is its own class.
	 */
	
	//Using comparable
	static class Edge implements Comparable<Edge> {
		int a,b,w;
		public Edge(int _a, int _b, int _w) { a = _a; b = _b; w = _w; }
		public int compareTo(Edge y) { return Integer.compare(w,y.w); }
	}
	
	
	//Using comparator
	static class Edge2 {
		int a,b,w;
		public Edge2(int _a, int _b, int _w) { a = _a; b = _b; w = _w; }
	}
	static class Comp implements Comparator<Edge2> {
		public int compare(Edge2 a, Edge2 b) {
			return Integer.compare(a.w, b.w);
		}
	}
	
	//Try to use COMPARABLE
	
	//Refer to Computer Notes google doc for sorting by edge weights, etc...
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
