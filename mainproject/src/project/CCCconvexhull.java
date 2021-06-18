package project;
import java.util.*;
import java.io.*;
public class CCCconvexhull {

	static class Edge implements Comparable<Edge>{
		int to;
		int weight;
		int damage;
		public Edge (int to, int weight, int damage) {
			this.to = to;
			this.weight = weight;
			this.damage = damage;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return weight-o.weight;
		}
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;	
	static ArrayList<Edge>[] list;
	static int K, N, M, start, end;

	public static void dijkstra() {
		int[][] dist = new int[N+1][201];
		boolean[] visited = new boolean[N+1];
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		for (int[] i: dist) {
			Arrays.fill(i, Integer.MAX_VALUE);
		}

		dist[start][0] = 0;
		pq.add(new Edge(start, 0, 0));

		while (!pq.isEmpty()) {
			Edge temp = pq.poll();
			visited[temp.to] = true;
			for (Edge i: list[temp.to]) {
				if (temp.damage+i.damage < K) { 
					if (temp.weight+i.weight < dist[i.to][temp.damage+i.damage]) { 
						dist[i.to][temp.damage+i.damage] = temp.weight+i.weight; 
						pq.add(new Edge(i.to, temp.weight+i.weight, temp.damage+i.damage));
					}
				}
			}
		}
		//Basically, we looked added the old node's time and damage with the new node and see if we can get
		//something better than what we had before
		//if so, we also add it to the pq
		//we don't use a visited boolean array because we would have to change adjacent nodes of adjacent nodes, etc...
		//we just look at a node, see if the total damage is less than the health of the hull
		//https://www.youtube.com/watch?v=TNPGfQ5LSTU

		int min = Integer.MAX_VALUE;
		for (int i=end; i<=end; i++) {
			for (int j=0; j<dist[i].length; j++) {
				if (j<K) {
					min = Math.min(min, dist[i][j]);
				}
			}
		}

		if (min==Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		K = readInt();
		N = readInt();
		M = readInt();
		list = new ArrayList[N+1];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Edge>();
		}
		for (int i=0; i<M; i++) {
			int a = readInt(), b = readInt(), t = readInt(), h = readInt();
			list[a].add(new Edge(b, t, h));
			list[b].add(new Edge(a, t, h));
		}
		start = readInt();
		end = readInt();

		dijkstra();
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
