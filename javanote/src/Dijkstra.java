import java.util.*;
import java.io.*;
public class Dijkstra {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static ArrayList<Edge>[] list;
	static int n;
	//Incomplete implementation
	
	static class Edge implements Comparable<Edge>{
		int to;
		int weight;
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
	
	static void dijkstra(int s, int e) {
		boolean[] visited = new boolean[n+1];
		int[] dist = new int[n+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[1] = 0;
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(s,0));
		while (!pq.isEmpty()) {
			Edge temp = pq.poll();
			visited[temp.to] = true;
			for (Edge i: list[temp.to]) {
				if (!visited[i.to]) {
					int newdist = dist[temp.to] + i.weight;
					if (newdist < dist[i.to]) {
						dist[i.to] = newdist;
						pq.add(new Edge(i.to, newdist));
					}
				}
			}
		}
		System.out.println(Arrays.toString(dist));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = 4;
		list = new ArrayList[n+1];
		for (int i=1; i<list.length; i++) {
			list[i] = new ArrayList<Edge>();
		}
		list[1].add(new Edge(2,3));
		list[2].add(new Edge(3,3));
		list[3].add(new Edge(1,3));
		dijkstra(1, 2);
	}
}
