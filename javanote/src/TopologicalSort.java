import java.util.*;
import java.io.*;
public class TopologicalSort {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static ArrayList<Edge>[] list;
	static class Edge {
		int to;
		int weight;
		public Edge(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
	}
	
	public static int dfs(int i, int at, boolean[] visited, int[] ordering) {
		visited[at] = true;
		for (Edge e: list[at]) {
			if (!visited[e.to]) {
				i = dfs(i, e.to, visited, ordering);
			}
			ordering[i] = at;
		}
		return i-1;
	}
	
	public static int[] topologicalsort(int n) {
		boolean[] visited = new boolean[n+1];
		int[] ordering = new int[n+1];
		int i = n-1;
		
		for (int at=1; at<=n; at++) {
			if (!visited[at]) {
				i = dfs(i, at, visited, ordering);
			}
		}
		return ordering;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		list = new ArrayList[n+1];
		for (int i=1; i<=n; i++) {
			list[i] = new ArrayList<Edge>();
		}
		
		list[1].add(new Edge(3, 2));
		list[1].add(new Edge(2, 2));
		list[4].add(new Edge(3, 2));
		list[4].add(new Edge(5, 2));
		list[2].add(new Edge(5, 2));
		list[2].add(new Edge(3, 2));
		System.out.println(Arrays.toString(topologicalsort(n)));
	}
}
