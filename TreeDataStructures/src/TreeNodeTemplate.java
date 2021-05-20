import java.util.*;
import java.io.*;

public class TreeNodeTemplate {
	static Node root;
	public static class Node {
		int data;
		Node left;
		Node right;
		
		public Node (int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	/* And then your tree traversal... Level-Order, for example
	 * 
	 * public static void LevelOrder(Node root) {
		if (root==null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.data+" ");
				if (current.left!=null) {
					queue.add(current.left);
				}
				if (current.right!=null) {	
					queue.add(current.right);
			}
		}
	}
	*/
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	}

}
