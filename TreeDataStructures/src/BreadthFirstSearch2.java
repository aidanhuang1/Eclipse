import java.util.*;
import java.io.*;
public class BreadthFirstSearch2 { //INCOMPLETE

	public static class Node {
		int data;
		Node left;
		Node right;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		
		public Node (int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public static boolean BFS(Node source, Node destination) { //INCOMPLETE
		Queue<Node> nexttovisit = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		nexttovisit.add(source);
		while(!nexttovisit.isEmpty()) {
			Node node = nexttovisit.remove();
			if (node == destination) {
				return true;
			}
			if (visited.contains(node.data)) {
				continue;
			}
			visited.add(node.data);
			for (Node child : node.adjacent) {
				nexttovisit.add(child);
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)	;

		Node node1 = new Node(0);
		Node node2 = new Node(1);
		node1.left = node2;
		System.out.println(BFS(node1, node2));
	}

}
