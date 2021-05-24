import java.util.*;
import java.io.*;


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

	public Graph(int n) {
		adj = new LinkedList[n];
		for (int i=0; i<n; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source); //this second line is for undirect graphs
	}

	@Override
	public String toString() {
		String result = "";
		for (int i=0; i<adj.length; i++) {
			result+=i+"==>"+adj[i]+"\n";
		}
		return result;
	}
}


public class AdjacencyLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Graph adj = new Graph(4);
		adj.addEdge(0, 1);	
		adj.addEdge(0, 2);
		adj.addEdge(0, 3);
		adj.addEdge(1, 2);

		System.out.println(adj);
	}	
}

