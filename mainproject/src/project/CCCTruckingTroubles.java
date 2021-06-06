package project;
import java.util.*;
import java.io.*;

public class CCCTruckingTroubles { 
	static class Edge implements Comparable<Edge> { 
		public int to;
		public int weight;
		public Edge(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return o.weight-weight;
		}
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static int c, r, d;

	public static void Prims(int n, ArrayList<Edge>[] list, int[] dest) {
		boolean[] visited = new boolean[n]; 
		int[] MSTedges = new int[r];

		PriorityQueue<Edge> routes = new PriorityQueue<Edge>();

		visited[0] = true;
		for (Edge e : list[0]) { 
			if (!visited[e.to]) {
				routes.add(new Edge(e.to, e.weight));
			} 
		}
		while (!routes.isEmpty()) {
			Edge edge = routes.poll();
			int next = edge.to;

			if (visited[next]) {
				continue;
			}

			MSTedges[edge.to] = edge.weight;

			for (Edge e : list[next]) {				
				visited[next] = true;
				if (!visited[e.to]) {
					routes.add(new Edge(e.to, e.weight));
				} 
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i=0; i<d; i++) {
			if (MSTedges[dest[i]]<min) {
				min = MSTedges[dest[i]];
			}
		}

		System.out.println(min);
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		c = readInt();
		r = readInt();
		d = readInt();
		ArrayList<Edge>[] list = new ArrayList[c];
		int[] dest = new int[d];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Edge>();
		}

		for (int i=0; i<r; i++) {
			int x = readInt()-1, y = readInt()-1, w = readInt();
			list[x].add(new Edge(y, w));
			list[y].add(new Edge(x, w));
		}
		for (int i=0; i<d; i++) {
			dest[i] = readInt()-1;
		}
		Prims(c, list, dest);
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
