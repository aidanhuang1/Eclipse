import java.util.*;
import java.io.*;



public class LinkedList<E> {
	
	private Node<E> head = null;
	private int size = 0;
	
	public class Node<E> {
		private E data;	
		private Node<E> next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
		
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	
	//return size
	public int size() {
		return this.size;
	}
	
	//check if empty
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> List = new LinkedList<Integer>();
	
		
		
	}
}
