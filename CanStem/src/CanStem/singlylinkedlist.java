package CanStem;

public class singlylinkedlist<E> {
	private node<E> head;
	private int size;

	public singlylinkedlist() {
		this.head = null;
		this.size = 0;

	}
	//return size
	public int size() {
		return this.size;
	}
	//isEmpty
	public Boolean isEmpty() {
		return this.size==0;  //if 0, return true  if not zero, return false
	}
	//add(value)
	public void add(E val) {
		if (this.head == null) {
			this.head = new node<E>(val);
		} else {
			node<E> temp = this.head;
			for (int i=0; i<size-1; i++) {
				temp = temp.getNext();
			}
			temp.setNext(new node<E>(val));
		}		
		this.size++;

	}

	//insert(index, value)
	public void insertvalue(int index, E val) {
		node<E> temp = this.head;
		for (int i=1; i<index; i++) {
			temp = temp.getNext();
		}
		node next = temp.getNext();
		temp.setNext(new node<E>(val, next));
		this.size++;
	}

	//delete() delete last node
	public void delete1() {
		if (this.size == 1) {
			this.head = null;
		} else {
			node temp = this.head;
			for (int i=0; i<this.size-2; i++) {
				temp = temp.getNext();
			}
			temp.setNext(null);
			this.size--;
		}
	}


	//delete(index) delete the node on that index

	public void delete2(int index) {
		if(index==0) {
			this.head = this.head.getNext();
		} else {

			node temp = this.head;
			for (int i=0; i<index; i++) {
				temp = temp.getNext();
			}
			node next = temp.getNext();
			next = next.getNext();
			temp.setNext(next);

			this.size--;
		}

	}

	//get(index) return the value at index

	public String get(int index) {
		if (index==0) {
			return this.head.toString();
		}
		node temp = this.head;
		for (int i=0; i<index; i++) {
			temp = temp.getNext();
		}
		return temp.toString();
	}

	//remove(value) remove the first appearance of the value

	public void remove(E val) {
		node temp = this.head;
		if (temp.getValue().equals(val)) {
			this.head = this.head.getNext();
		} else {
			for (int i=1; i<size; i++) {
				if (temp.getNext().equals(val)) {
					node next = temp.getNext();
					temp.setNext(next.getNext());
					this.size--;
					break;
				} else {	
					temp.getNext();
				}
			}

		}
	}

	//removeAll remove all items with value

	public void removeAll(E val) {
		node<E> temp = this.head; 
		if (temp.getValue().equals(val)) {
			this.head = this.head.getNext();
		} 
		for (int i=1; i<size; i++) {
			if (temp.getNext().equals(val)) {
				node<E> next = temp.getNext();
				temp.setNext(next.getNext());
				this.size--;
			} else {
				temp.getNext();
			}
		}
	}

	//reverse the list

	public void reverse() {
		node<E> rev = null;
		for (int j=0; j<this.size; j++) {
			node temp = this.head;
			for (int i=this.size-1; i>0; i--) {
				temp.getNext();
				if (i==0) {
					temp = this.head;
				} else {
					for (int k=0; k<this.size-k; k++) {
						temp = temp.getNext();
					}
				}
				temp.getNext();

			}

			rev.setNext(temp);
		}
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}






