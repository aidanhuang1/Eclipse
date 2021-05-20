import java.util.*;
import java.io.*;

public class LevelOrderTraversal {
	static Node root;
	public static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void LevelOrder(Node root) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
        
        System.out.println("Level order traversal of binary tree is - ");
        LevelOrderTraversal.LevelOrder(root);
	}

}
