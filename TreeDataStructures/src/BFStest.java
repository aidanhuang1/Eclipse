import java.util.*;
import java.io.*;


class Node {
	private int data;
	Node left;
	Node right;
	public Node (int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class Edge {
	int source;
	int destination;
	public Edge(int source, int destination) {
		this.source = source;
		this.destination = destination;
	}

}
class Graph {
	private int V; //Number of vertices
	private LinkedList<Integer> adj[]; //Adjacency List

	List<Edge> G[];
	public Graph(int n) {
		G = new LinkedList[n];
		for (int i=0; i<G.length; i++) {
			G[i] = new LinkedList<Edge>();
		}
	}

	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
}


public static void BFS(int v, Graph graph) {
	Queue<Integer> queue = new LinkedList<>();
	LinkedList<Integer> list = new LinkedList<>();
	queue.add(0);
	while(!queue.isEmpty()) {
		int temp = queue.poll();
		list.add(temp);
		for (int i: graph.adj.)
	}
}
public class BFStest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Graph adj = new Graph(4);
		adj.addEdge(0, 1);	
		adj.addEdge(0, 2);
		adj.addEdge(1, 2);
		adj.addEdge(2, 0);
		adj.addEdge(2, 3);
		adj.addEdge(3, 3);
		System.out.println(adj);
	}

}
