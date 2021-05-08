
public class review<E> {
	private node<E> head;
	private int size;

	public review() {
		this.head = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public Boolean isEmpty() {
		if (this.size==0)
			return true;
		else 
			return false;
	}
	public void add(E val) {
		if (this.head==null) {
			this.head = new node<E>(val);
		} else {
			node<E> temp = this.head;
			for (int i=0; i<this.size-1; i++) {
				temp = temp.getNext();
			}
			temp.setNext(new node<E>(val));
		}
		this.size++;
	}
	//insert(index, value)
	public void insert(int index, E val) {
		node<E> temp = this.head;
		for (int i=1; i<index; i++) {
			temp = temp.getNext();
		}
		node<E> next = temp.getNext();
		temp.setNext(new node<E>(val, next));
	}
	
	public void delete1() {
		if (this.size==1 || this.size==0) {
			this.head = null;
		} else {
			node<E> temp = this.head;
			for (int i=0; i<this.size-2; i++) {
				temp = temp.getNext();
			}
			temp.setNext(null);
			this.size--;
		}
	}
	

	}
}

