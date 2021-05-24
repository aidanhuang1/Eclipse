package project;
import java.util.*;
import java.io.*;
public class CCCItstoughbeingateen3 {

	static class Graph {
		private static int V;
		private static LinkedList<Integer> adj[];
		private static List<Integer> noindegrees = new ArrayList<>();
		public Graph(int n) {
			V = n;
			adj = new LinkedList[n+1];
			for (int i=1; i<=n; i++) {
				adj[i] = new LinkedList();
			}
		}
		public void addEdge(int source, int destination) {
			adj[source].add(destination);
		}
		@Override
		public String toString() {
			String result = "";
			for (int i=0; i<adj.length; i++) {
				result+=i+"==>"+adj[i]+"\n";
			}
			return result;
		}

		private static int DFS(int i, int at, boolean[] visited, int[] ordering) {

			visited[at] = true;

			System.out.println(at);
			for (int edge : adj[at]) {
				if (!visited[edge]) {
					i = DFS(i, edge, visited, ordering);
				}
			}

			ordering[i] = at;
			return i - 1;
		}

		public static int[] topsort() {
			//we have to find nodes with no indegrees and sort them
			//we can look at the 

			int numNodes = 7;
			int[] ordering = new int[numNodes];
			boolean[] visited = new boolean[numNodes+1];

			int i = numNodes - 1;
			for (int at = 7; at >= 1; at--) {
				if (!visited[at]) { 
					i = DFS(i, at, visited, ordering);
				}
			}
			return ordering;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			Queue<Integer> x_add = new LinkedList<>();
			Queue<Integer> y_add = new LinkedList<>();
			List<Integer> indegrees = new ArrayList<>();
			indegrees.add(7);
			indegrees.add(4);
			indegrees.add(1);
			indegrees.add(5);
			
			while (true) {
				int x = sc.nextInt(), y = sc.nextInt();
				if (x==0 && y==0) {
					Graph g = new Graph(7);
					adj[1].add(7);
					adj[1].add(4);
					adj[2].add(1);
					adj[3].add(4);
					adj[3].add(5);
					for (int i=0; i<x_add.size(); i++) {
						int temp = y_add.poll();
						adj[x_add.poll()].add(temp);
						indegrees.add(temp);
					}
					
					System.out.println(Arrays.toString(topsort()));
					break;
				}
				x_add.add(x);
				y_add.add(y);
			}

		}
	}
}
