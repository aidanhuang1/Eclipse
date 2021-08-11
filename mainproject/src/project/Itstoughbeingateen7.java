package project;
import java.util.*;
import java.io.*;
public class Itstoughbeingateen7 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static ArrayList<Edge>[] list;
	static int[] ind;
	static class Edge {
		int to;
		public Edge(int to) {
			this.to = to;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		list = new ArrayList[8];
		ind = new int[]{0, 1, 0, 0, 2, 1, 0, 1};
		for (int i=1; i<=7; i++) {
			list[i] = new ArrayList<Edge>();
		}
		list[1].add(new Edge(7));
		list[1].add(new Edge(4));
		list[2].add(new Edge(1));
		list[3].add(new Edge(4));
		list[3].add(new Edge(5));

		while (true) {
			int a = readInt(), b = readInt();
			if (a==0 && b==0) break;
			list[a].add(new Edge(b));
			ind[b]++;
		}
		ArrayList<Integer> order = new ArrayList<>();
		for (int p=0; p<7; p++) {
			for (int i=1; i<=7; i++) {
				if (ind[i]==0) {//has no indegrees
					order.add(i);
					ind[i]--;
					for (Edge e: list[i]) {
						ind[e.to]--;
					}
					break;
				}
			}
		}
		if (order.size()==7) for (int i: order) System.out.print(i+" ");
		else System.out.println("Cannot complete these tasks. Going to bed.");
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
