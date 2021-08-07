package DisjointUnionSets;
import java.util.*;
import java.io.*;
public class DisjointSet2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	public static int[] disjoint;
	public static int[] size;
	public static int num;
	/*
	 * Find operation:
	 * find which component a particular element belongs to, find the root of the component
	 * by continously following the parent nodes until a self loop is found,
	 * which means that we have reached the root node
	 * 
	 * Union operation:
	 * Find the root nodes of both components, and if the root nodes are different,
	 * make one root node the parent of the other (connect one component to another)
	 * 
	 * If the root nodes are the same, we do not have to do anything
	 */

	
	public static int find(int p) {
		int root = p;
		
		while (root!=disjoint[root]) {
			root = disjoint[root];
		}

		while (p!=root) {
			int next = disjoint[p];
			disjoint[p] = root;
			p = next;
		}
		return root;
	}

	public static void union(int p, int q) {
		//Find the ancestor of both nodes
		int root1 = find(p);
		int root2 = find(q);
		
		//They are in the same connected component.
		if (root1 == root2) {
			return;
		}

		if (size[root1] < size[root2]) {
			size[root2] += size[root1];
			disjoint[root1] = root2;
		} else {
			size[root1] += size[root2];
			disjoint[root2] = root1;
		}
		num--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
