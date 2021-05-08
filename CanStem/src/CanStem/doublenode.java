package CanStem;

class doubleNode<E> {
	private E data;
	private doubleNode<E> previous;
	private doubleNode<E> next;
	public doubleNode(E val) {
		this.data = val;
		this.previous = null;
		this.next = null;
	}
	
	public doubleNode(E data, doubleNode<E> next) {
		this.data = data;
		this.next = next;
	}

	//set next and get next and get previous
	public void setNext(doubleNode<E> next) {
		this.next = next;
	}

	public void setPrevious(doubleNode<E> prev) {
		this.previous = prev;
	}

	public doubleNode<E> getNext() {
		return this.next;
	}

	public doubleNode<E> getPrevious() {
		return this.previous;
	}

	//setValue
	public void setValue(E val) {
		this.data = val;
	}

	//getValue
	public E getValue() {
		return data;
	}
	
	//toString
	public String toString() {
		return "<Node: "+data+">";
	}
}