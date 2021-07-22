import java.util.*;
import java.io.*;
public class DisjointSet2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	public static int[] disjoint;

	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
