package CanStem;

public class BSTnode {
	int data;
	BSTnode left = null;
	BSTnode right = null; 
	
	public BSTnode(int data) {
		this.data = data;
	}
	
	//get (left or right)
	public BSTnode getleft() {
		return this.left;
	}
	public BSTnode getright() {
		return this.right;
	}
	
	//set (left or right)
	public void setleft(BSTnode val) {
		this.left = val;
	}
	public void setright(BSTnode val) {
		this.right = val;
	}
	
	//getData
	public int value() {
		return this.data;
	}
}
