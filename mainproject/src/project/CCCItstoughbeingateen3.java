package project;
import java.util.*;
import java.io.*;
public class CCCItstoughbeingateen3 {

	static class Graph {
		private static int V;
		private static LinkedList<Integer> adj[];
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
		
		public static int[] topsort() {
			boolean[] discovered = new boolean[V];
			for (int i=0; i<V; i++) {
				if (!discovered[i]) {
					tim
				}
			}
		}

		public static int DFS() {
			visited
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
					adj[1].add(7);
					adj[1].add(4);
					adj[2].add(1);
					adj[3].add(4);
					adj[3].add(5);
					for (int i=0; i<x_add.size(); i++) {
						adj[x_add.poll()].add(y_add.poll());
					}
					System.out.println(topsort());
					break;
				}
				x_add.add(x);
				y_add.add(y);
			}

		}
	}
}
