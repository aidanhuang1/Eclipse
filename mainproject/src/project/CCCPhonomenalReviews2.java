package project;
import java.util.*;
import java.io.*;
public class CCCPhonomenalReviews2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, M, pho, node, tdist, longest;
	static boolean ispho[];
	static ArrayList<Integer>[] oldlist;
	static ArrayList<Integer>[] newlist;
	public static void main(String[]args) throws IOException {
		N = readInt(); 
		M = readInt(); 
		ispho = new boolean[N];
		oldlist = new ArrayList[N];
		newlist = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			oldlist[i] = new ArrayList<Integer>(); 
			newlist[i] = new ArrayList<Integer>(); 
		}
		for (int i = 0; i < M; i++) {
			pho = readInt();
			ispho[pho] = true;
		}
		for (int i = 0; i < N-1; i++) {
			int x = readInt(), y = readInt();
			oldlist[x].add(y); 
			oldlist[y].add(x);
		}

		prune(pho, -1);
		diameter(0, -1, pho);
		tdist = 0;
		diameter(0, -1, node);
		System.out.println(longest*2-tdist);
	}

	static void diameter(int distance, int previous, int current) {
		if (tdist < distance) {
			tdist = distance;
			node = current;
		}
		for (int i: newlist[current]) {
			if (i!=previous) {
				diameter(distance+1, current, i);
			}
		}
	}


	static void prune(int current, int previous) {
		for (int node: oldlist[current]) {
			if (node != previous) {	
				prune(node, current);
				if (newlist[node].size()!=0 || ispho[node]) {
					longest++;
					newlist[current].add(node); 
					newlist[node].add(current); 

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