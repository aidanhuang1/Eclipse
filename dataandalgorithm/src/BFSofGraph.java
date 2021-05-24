import java.util.*;
import java.io.*;
public class BFSofGraph {
	
	class Node {
		private int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	//Function to return Breadth First Traversal of given graph.
	// Perform BFS on the graph starting from root node
	
	//This BFS algorithm takes in a source vertex and the adjacency list
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj) {
    	boolean[] visited = new boolean[V]; // create a queue for doing BFS
        Queue<Integer> queue = new LinkedList<>(); 
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(0); // mark the source vertex as discovered

        while(!queue.isEmpty()) {
        	int temp = queue.poll();
        	list.add(temp);
        	for (int i: adj.get(temp)) {
        		if (!visited[i]) {
        			visited[i] = true;
        			queue.add(i);
        		}
        	}
        	
        }
        return list;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	}

}
