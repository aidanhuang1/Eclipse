package project;
import java.util.*;
import java.io.*;

public class CCCItstoughbeingateen3 {
	static class Graph {
		private static LinkedList<Integer> adj[];
		private static int rootnode = 0;
		private static boolean isCycle = false;
		private static int[] ordering;
		
		public Graph(int n) {
			adj = new LinkedList[n+1];
			for (int i=1; i<=n; i++) {
				adj[i] = new LinkedList();
			}
		}
		public void addEdge(int source, int destination) {
			adj[source].add(destination);
		}

		private static int DFS(int i, int at, boolean[] visited, int[] ordering) {			
			visited[at] = true;
			for (int newat: adj[at]) {
				if (newat==rootnode) {
					isCycle = true;
				}
				if (!visited[newat]) {
					i = DFS(i, newat, visited, ordering);
				}
			}
			ordering[i] = at;
			return i - 1;
		}

		public static boolean topsort() {

			int numNodes = 7;
			ordering = new int[numNodes];
			boolean[] visited = new boolean[numNodes+1];

			int i = numNodes - 1;
			for (int at = 7; at >= 1; at--) {
				if (!visited[at]) { 
					rootnode = at;
					i = DFS(i, at, visited, ordering);
				}
			}
			if (isCycle) {
				return false;
			}
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> x_add = new LinkedList<>();
		Queue<Integer> y_add = new LinkedList<>();

		while (true) {
			int x = sc.nextInt(), y = sc.nextInt();
			if (x==0 && y==0) {
				Graph g = new Graph(7);
				g.addEdge(1, 7);
				g.addEdge(1, 4);
				g.addEdge(2, 1);
				g.addEdge(3, 4);
				g.addEdge(3, 5);
				for (int i=0; i<x_add.size(); i++) {
					g.addEdge(x_add.poll(), y_add.poll());
				}
				if (!Graph.topsort()) {
					System.out.println("Cannot complete these tasks. Going to bed.");
				} else {
					for (int i=0; i<Graph.ordering.length; i++) {
						System.out.print(Graph.ordering[i]+" ");
					}
				}
				break;
			}
			x_add.add(x);
			y_add.add(y);
		}

	}
}

