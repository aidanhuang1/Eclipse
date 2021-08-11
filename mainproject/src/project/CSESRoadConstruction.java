package project;
import java.util.*;
import java.io.*;
public class CSESRoadConstruction {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	public static int[] disjoint;
	public static int[] size;
	
	/*Disjoint Set Union */

	//Find the ancestor.
	public static int find(int v) {
		if (disjoint[v] < 0) {
			return v;
		}
		disjoint[v] = find(disjoint[v]);
		return disjoint[v];
	}

	public static int union(int u, int v) {
		//Find the ancestor of both nodes
		u = find(u);
		v = find(v);

		//They are in the same connected component.
		if (u == v) {
			return 0;
		}

		if (disjoint[u] < disjoint[v]) {
			int tempU = u;
			u = v;
			v = tempU;
		}
		disjoint[v] += disjoint[u]; //Append u's children to v.
		disjoint[u] = v; // Set v as u's parent.
		return -disjoint[v];
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int n = readInt(), m = readInt(), max = 1;
		disjoint = new int[n];
		while (m-->0) {
			int temp = union(readInt()-1, readInt()-1);
			if (temp!=0) { //in same component
				n--;
				max = Math.max(max, temp);
			}
			System.out.println(n+" "+max);
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
