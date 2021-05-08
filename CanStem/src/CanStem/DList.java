package CanStem;

public class DList<E> {
	private doubleNode<E> head;
	private doubleNode<E> previous;
	private doubleNode<E> tail;
	private int size;

	public DList() {
		this.head = null;
		this.previous = null;
		this.tail = null;
		this.size = 0;
	}

	//return size
	public int size() {
		return this.size;
	}

	//isEmpty
	public boolean isEmpty() {
		if (this.size==0) {
			return true;
		} else {
			return false;
		}
	}

	//add(value)
	public void add(E val) {
		if (this.head==null) {
			this.head = new doubleNode<E>(val);
			this.tail = this.head;
		} else {
			doubleNode<E> temp = this.head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(new doubleNode<E>(val));
			doubleNode<E> secondlast = temp;
			temp.getNext();
			temp.setPrevious(secondlast);
			this.tail = temp;
		}

		this.size++;
	}

	//insert(index, value)
	public void insert(int index, E val) {
		if (index>this.size || index<0) {
			System.out.println("index out of range");
		} else if (index==0) {
			doubleNode<E> newnode = new doubleNode<E>(val);
			newnode.setNext(this.head);
			newnode.setPrevious(null);
			if (this.head!=null) {
				this.head.setPrevious(newnode);
			}
			this.head = newnode;

			this.size++;
		} else { 
			doubleNode<E> temp = this.head;
			for (int i=0; i<index-1; i++) {
				temp = temp.getNext();
			}
			doubleNode<E> next = temp.getNext();
			temp.setNext(new doubleNode<E>(val, next));
			temp.getNext();
			temp.setPrevious(new doubleNode<E>(val, next));
			if (index==this.size) {
				this.tail = temp;
			}
			this.size++;
		}
	}

	//delete()
	public void delete() {
		if (this.size==1 || this.size==0) {
			this.head = null;
		} else {
			doubleNode<E> temp = this.head;
			for (int i=0; i<this.size-1; i++) {
				temp = temp.getNext();
			}
			temp.setNext(null);
			this.tail = temp;
			this.size--;
		}
	}

	//delete(index)
	public void deleteindex(int index) {
		if (this.size!=0) {
			if (index==0) {
				this.head = this.head.getNext();
				this.head.setPrevious(null);
			} else {
				doubleNode<E> temp = this.head;
				for (int i=0; i<index-1; i++) {
				temp = temp.getNext();
				}
				doubleNode<E> next = temp.getNext();
				next = next.getNext();
				temp.setNext(next);
				doubleNode<E> prev = temp;
				temp.getNext();
				temp.setPrevious(prev);
				if (index==this.size) {
					this.tail = temp;
				}
			}
			this.size--;
			
		}
		
	}

	//get(index)
	public String get(int index) {
		if (index==0) {
			return this.head.toString();
		}
		doubleNode<E> temp = this.head;
		for (int i=0; i<index; i++) {
			temp = temp.getNext();
		}
		return temp.toString();

	}

	//remove(val)
	public void remove(E val) {
		doubleNode<E> temp = this.head;
		for (int i=0; i<this.size; i++) {
			if (temp.getValue()==val) {
				deleteindex(i);
				break;
			}
			temp = temp.getNext();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DList<Integer> l = new DList<Integer>();

		l.add(3);
		l.add(5);
		l.add(7);
		l.add(7);
		l.add(7);
		l.add(1);
		l.insert(0, 9);
		l.delete();
		l.deleteindex(0);
		l.remove(7);
		for (int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

}
