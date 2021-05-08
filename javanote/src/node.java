
public class node<E> {
	private E data;
	private node<E> next;
	
	public node(E data) {
		this.data = null;
		next = null;
	}
	
	public node(E data, node<E> next) {
		this.data = data;
		this.next = next;
	}
	
	public E getValue() {
		return data;
	}
	
	public void setValue(E data) {
		this.data = data;
	}
	
	public void setNext(node<E> next) {
		this.next = next;
	}
	
	public node<E> getNext() {
		return this.next;
	}
	
	public String toString() {
		return "<Node: "+data+">";
	}
	
}
