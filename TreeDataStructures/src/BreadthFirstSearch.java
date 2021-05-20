import java.util.*;

import java.io.*;
public class BreadthFirstSearch {
//	static Node root;
//	public static class Node {
//		int data;
//		Node left;
//		Node right;
//		
//		public Node (int data) {
//			this.data = data;
//			left = null;
//			right = null;
//		}
//	}
//	
	private static int V; //Number of vertices
	private static LinkedList<Integer> adj[]; //Adjacency Lists
	
	//Create a graph
	BreadthFirstSearch(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	//Add edges to the graph
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	//BFS algorithm
	public static void BFS(int s) {
		boolean visited[] = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		visited[s] = true;
		
		
		while (!queue.isEmpty()) {
			s = queue.poll();
			System.out.println(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BreadthFirstSearch g = new BreadthFirstSearch(4);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	    g.addEdge(2, 3);
	    g.addEdge(3, 3);

	    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

	    g.BFS(2);

	}

}
