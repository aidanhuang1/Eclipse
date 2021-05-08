package CanStem;

public class node<E> { //<E> stands for all the datatypes?
	private E data; //setValue
	private node<E> next; //setNext
	
	public node(E data) {
		this.data = data;
		next = null; 
	}
	
	public node(E data, node<E> next) {
		this.data = data;
		this.next = next;
	}
	//getValue
	public E getValue() { //E is a data type, maybe an integer, boolean, etc...
		return data;
	}
	
	
	//setValue
	public void setValue(E data) {
		this.data = data;
	}
	//setNext
	public void setNext(node<E> next) {
		this.next = next;
	}
	
	//getNext
	public node<E> getNext() {
		return this.next;
	}
	
	//toString     data = 4  <Node: 4>
	public String toString() {
		return "<Node: "+data+">";
		
	}
	
	
}



