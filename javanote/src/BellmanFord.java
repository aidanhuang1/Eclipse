import java.util.*;
import java.io.*;
public class BellmanFord {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static ArrayList<Edge>[] adj;
	static class Edge {
		int to;
		int from;
		int cost;
		public Edge(int to, int from, int cost) {
			this.to = to;
			this.from = from;
			this.cost = cost;
		}
	}
	public static double[] bellmanFord(List<Edge>[] graph, int V, int start) {

		// Initialize the distance to all nodes to be infinity
		// except for the start node which is zero.
		double[] dist = new double[V];
		java.util.Arrays.fill(dist, Double.POSITIVE_INFINITY);
		dist[start] = 0;

		// For each vertex, apply relaxation for all the edges
		for (int i = 0; i < V - 1; i++)
			for (List<Edge> edges : graph)
				for (Edge edge : edges)
					if (dist[edge.from] + edge.cost < dist[edge.to])
						dist[edge.to] = dist[edge.from] + edge.cost;

		// Run algorithm a second time to detect which nodes are part
		// of a negative cycle. A negative cycle has occurred if we
		// can find a better path beyond the optimal solution.
		for (int i = 0; i < V - 1; i++)
			for (List<Edge> edges : graph)
				for (Edge edge : edges)
					if (dist[edge.from] + edge.cost < dist[edge.to]) dist[edge.to] = Double.NEGATIVE_INFINITY;

		// Return the array containing the shortest distance to every node
		return dist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		adj = new ArrayList[n];
		for (int i=0; i<adj.length; i++) {
			adj[i] = new ArrayList<Edge>();
		}
		
	}
}
