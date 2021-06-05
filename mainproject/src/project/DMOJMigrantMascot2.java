package project;
import java.util.*;
import java.io.*;



public class DMOJMigrantMascot  {
	static class Edge implements Comparable<Edge>{
		int to;
		int weight;
		public Edge (int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	//Molly will only know a path by its lowest weight. But Molly will choose the path with the greatest weight at the end.

	public static void search(ArrayList<Edge>[] list, int N, int M) {
		boolean[] visited = new boolean[N]; // all paths we have found for a node

		for (int i=0; i<N; i++) {
			int min = Integer.MAX_VALUE;
			boolean[] tempvisited = new boolean[N];	
			if (i==0) {
				System.out.println(0);
			} else {
				PriorityQueue<Edge> queue = new PriorityQueue<Edge>();
				tempvisited[0] = true;
				for (Edge j: list[0]) {
					if (!tempvisited[j.to]) {
						queue.add(new Edge(j.to, j.weight));
						min = Math.min(j.weight, min);
					} 
				}
				while (!queue.isEmpty()) {
					Edge edge = queue.poll();
					tempvisited[edge.to] = true;
					min = Math.min(edge.weight, min);
					for (Edge k: list[edge.to]) {
						if (!tempvisited[k.to]) {
							queue.add(new Edge(k.to, k.weight));
						}
					}
				}

			}
			visited[i] = true;
			System.out.println(min);

		}
	}





	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static ArrayList<Edge>[] list;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), M = readInt();
		list = new ArrayList[N];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Edge>();
		}
		for (int i=0; i<N; i++) {
			int a = readInt()-1, b = readInt()-1, p = readInt();
			list[a].add(new Edge(b, p));
		}
		search(list, N, M);

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
