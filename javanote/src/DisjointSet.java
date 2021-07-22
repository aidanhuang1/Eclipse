import java.util.*;
import java.io.*;
public class DisjointSet {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	static int[] parents;  // 0-indexed
	static int[] sizes;
	public DisjointSet (int size) {
		sizes = new int[size];
		parents = new int[size];
		Arrays.fill(sizes, 1);
		Arrays.fill(parents, -1);
	}

	// finds the "representative" node in a's component
	public int find(int x) {
		return parents[x] == -1 ? x : (parents[x] = find(parents[x]));
	}

	// returns whether the merge changed connectivity
	public boolean union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		if (xRoot == yRoot) {
			return false;
		}
		if (sizes[xRoot] < sizes[yRoot]) {
			parents[xRoot] = yRoot;
			sizes[yRoot] += sizes[xRoot];
		} else {
			parents[yRoot] = xRoot;
			sizes[xRoot] += sizes[yRoot];
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisjointSet ds = new DisjointSet(5);
		ds.union(0, 1);
		System.out.println(Arrays.toString(parents));

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
