import java.util.*;

import java.io.*;
public class BreadthFirstSearch {
 
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
	

	//BFS algorithm
	//This BFS algorithm returns a 2d List and has a node as a parameter
	public static List<List<Integer>> BFS(Node node) {
		Queue<Node> queue = new LinkedList<>(); 
		List<List<Integer>> list = new ArrayList<>();
		queue.add(node);

		while(!queue.isEmpty()) {
			List<Integer> l = new ArrayList<>();
			int size = queue.size();
			for (int i=0; i<size; i++) { //we loop through the size of the queue because that is
				node = queue.poll();	//the amount of nodes in that level
				l.add(node.data);		//once we are out of the for loop we start a new level by making a new list

				if (node.left!=null) {
					queue.add(node.left);
				}
				if (node.right!=null) {
					queue.add(node.right);
				}
			}
			list.add(l);
		}
		return list;

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Node node1 = new Node(0);
		Node node2 = new Node(1);
		Node node3 = new Node(2);
		Node node4 = new Node(3);
		Node node5 = new Node(4);
		Node node6 = new Node(5);

		node1.left = node2;
		node1.right = node3;	
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;	

		System.out.println(BreadthFirstSearch.BFS(node1));

	}

}
