package CanStem;

public class doublylinkedlist<E> {
	private node<E> head;
	private int size;

	public doublylinkedlist() {
		this.head = null;
		this.size = 0;
	}
	//add(value)
	public void add(E val) {
		if (this.head == null) {
			this.head = new node<E>(val);
		} else {
			node<E> temp = this.head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(new node<E>(val));
			this.size++;
		}
	}
	
	//getHead
	public node<E> getHead() {
		return this.head;
	}
	
	//get(index) return the value at index

	public String get(int index) {
		if (index==0) {
			return this.head.toString();
		}
		node<E> temp = this.head;
		for (int i=0; i<index; i++) {
			temp = temp.getNext();
		}
		return temp.toString();
	}

	
	//merge two doublylinkedlist
	public doublylinkedlist<E> mergeDLL(doublylinkedlist<E> l) {
		doublylinkedlist<E> answerDDL = this;
		node<E> temp = this.head;
		while(temp.getNext()!=null) {
			temp = temp.getNext();
			
		}
		temp.setNext(l.getHead());
		return answerDDL;


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublylinkedlist<Integer> DLL1 = new doublylinkedlist<Integer>();
		DLL1.add(52);
		DLL1.add(23);
		DLL1.add(15);
		DLL1.add(52);
		DLL1.add(78);
		DLL1.add(53);
		doublylinkedlist<Integer> DLL2 = new doublylinkedlist<Integer>();
		DLL2.add(19);
		DLL2.add(78);
		DLL2.add(36);
		DLL2.add(40);
		DLL2.add(90);
		doublylinkedlist<Integer> DLL3 = DLL1.mergeDLL(DLL2);
		for (int i=0; i<11; i++) {
			System.out.println(DLL3.get(i));
		}
	}
}

