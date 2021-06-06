package project;
import java.util.*;
import java.io.*;

public class CCCShopandShip { //This is the adjacency list method, TLEs for the last two test cases
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Edge>[] list;
	static int[] cost;
	static int[] store;
	static int N, T, K;

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
			return weight-o.weight;
		}
		
	}

	public static void Dijkstra(int start) {
		boolean[] visited = new boolean[N+1];
		int[] dist = new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		pq.add(new Edge(start, 0));

		while(!pq.isEmpty()) {
			Edge temp = pq.poll();
			System.out.println(temp.weight);
			visited[temp.to] = true;
			if (dist[temp.to] < temp.weight) {
				continue;	
			}
			for (Edge i: list[temp.to]) {
				if (!visited[i.to]) {
					int newDist = dist[temp.to] + i.weight;
					if (dist[i.to] > newDist) {
						dist[i.to] = newDist;
						pq.add(new Edge(i.to, newDist));
					}
				}
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i=0; i<K; i++) {
			min = Math.min(min, cost[i] + dist[store[i]]);
		}
		System.out.println(min);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		N = readInt();
		T = readInt();
		list = new ArrayList[N+1];
		for (int i=0; i<list.length; i++) {	
			list[i] = new ArrayList<Edge>();
		}
		for (int i=0; i<T; i++) {
			int x = readInt(), y = readInt(), weight = readInt();
			if (x >= 1 && x <= N && y >= 1 && y <= N) {
				list[x].add(new Edge(y, weight));
				list[y].add(new Edge(x, weight));
			}
		}
		K = readInt();
		cost = new int[N+1];
		store = new int[N+1];
		for (int i=0; i<K; i++) {
			store[i] = readInt();
			cost[i] = readInt();


		}
		int destination = readInt();
		Dijkstra(destination);
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
