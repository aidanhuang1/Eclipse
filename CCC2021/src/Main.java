import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, M, pho, node, tdist, count;
	static boolean ispho[];
	static ArrayList<ArrayList<Integer>> oldlist = new ArrayList<ArrayList<Integer>>();
	static ArrayList<ArrayList<Integer>> newlist = new ArrayList<ArrayList<Integer>>();

	public static void main(String[]args) throws IOException {
		N = readInt(); 
		M = readInt(); 
		ispho = new boolean[N];
		for (int i = 0; i < N; i++) {
			oldlist.add(new ArrayList<Integer>()); 
			newlist.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < M; i++) {
			pho = readInt();
			ispho[pho] = true;
		}
		for (int i = 0; i < N-1; i++) {
			int x = readInt(), y = readInt();
			oldlist.get(x).add(y); 
			oldlist.get(y).add(x);
		}

		prune(pho, -1);
		dfs(0, -1, pho);
		tdist = 0;
		dfs(0, -1, node);
		System.out.println(count*2-tdist);
	}

	static void dfs(int distance, int prev, int current) {
		if (tdist < distance) {
			tdist = distance;
			node = current;
		}
		for (int i: newlist.get(current)) {
			if (i!=prev) {
				dfs(distance+1, current, i);
			}
		}
	}


	static void prune(int cur, int prev) {
		for (int node: oldlist.get(cur)) {
			if (node != prev) {	
				prune(node, cur);
				if (!newlist.get(node).isEmpty() || ispho[node]) {
					newlist.get(cur).add(node); 
					newlist.get(node).add(cur); 
					count++;
				}
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