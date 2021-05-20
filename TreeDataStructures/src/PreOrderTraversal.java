import java.util.*;
import java.io.*;
public class PreOrderTraversal {
	
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
	
	
	static List<Integer> list = new ArrayList<>();
	public static List<Integer> Preorder(Node root) {
		if (root!=null) {
			list.add(root.data);
			Preorder(root.left);
			Preorder(root.right);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PreOrderTraversal tree = new PreOrderTraversal();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Pre-Order Tree Traversal");
        System.out.println(PreOrderTraversal.Preorder(root));
	}

}
