package CanStem;

public class singlylinkedimplement<E> {
	private node<E> head;
	private int size;

	public singlylinkedimplement() {
		this.head = null;
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public int elementCount(E a) {
		int count = 0;
		node temp = this.head;
		for (int i=1; i<size; i++) {
			if (temp.getNext() != null && temp.getNext() == a) {
				count++;
			}
			temp = temp.getNext();
		}
		if (count > 0) return count;
		else return -1;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
