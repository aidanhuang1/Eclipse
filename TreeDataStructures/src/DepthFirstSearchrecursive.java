import java.util.*;
import java.io.*;
public class DepthFirstSearchrecursive {
	public static boolean visited[];
	private static LinkedList<Integer> adj[];
	static class Graph {

		// Graph creation
		Graph(int v) { //v is the # of vertices
			adj = new LinkedList[v];
			visited = new boolean[v];

			for (int i = 0; i < v; i++)
				adj[i] = new LinkedList<Integer>();
		}

		// Add edges
		void addEdge(int src, int dest) {
			adj[src].add(dest);
		}		

		public void DFS(int source) {
			visited[source] = true;
			System.out.println(source+" ");
			for (int i: adj[source]) {
				if (!visited[i]) {
					DFS(i);
				}
			}
		}



	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Graph g = new Graph(4);

		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

	    System.out.println("Following is Depth First Traversal");

	    g.DFS(0);
	}
}
