package CanStem;

public class BST {
	BSTnode head = null;
	int size = 0;

	public BST(int value) {
		this.head = new BSTnode(value);
		this.size++;
	}

	public void add(int n) {
		if (this.head==null) {
			this.head = new BSTnode(n);
		} else {
			BSTnode temp = this.head;
			while (true) {
				if (n>temp.value()) {
					if (temp.getright()==null) {
						temp.setright(new BSTnode(n));
						break;
					}
					temp = temp.getright();
				} else {
					if (temp.getleft()==null) {
						temp.setleft(new BSTnode(n));
						break;
					}
					temp = temp.getleft();
				}
			}

		}
		this.size++;
	}

	public void remove(int n) {
		if (this.head.value()==n) {
			this.head = null;
		} else {
			BSTnode temp = this.head;
			//go to the node that needs to be removed
			while(true) {
				if (n>temp.value()) {
					if (temp.value()==n) break;
					temp = temp.getright();
				} else {
					if (temp.value()==n) break;
					temp = temp.getleft();
				}
			}
			if (temp.getright()==null && temp.getleft()==null) { //if the node is a leaf
				temp = null;
			} else if (temp.getleft() == null) {// has a right child 
				//use a while loop to get to the previous node, then set the next right node to the node after the next
				temp = this.head;
				while(true) {
					if (n>temp.value()) {
						if (temp.getright().value()==n) break;
						temp = temp.getright();
					} else {
						if (temp.getleft().value()==n) break;
						temp = temp.getleft();
					}
				}
				temp.setright(temp.getright().getright());

			} else if (temp.getright() == null) {// has a left child 
				//use a while loop to get to the previous node, then set the next left node to the node after the next
				temp = this.head;
				while(true) {
					if (n>temp.value()) {
						if (temp.getright().value()==n) break;
						temp = temp.getright();
					} else {
						if (temp.getleft().value()==n) break;
						temp = temp.getleft();
					}
				}
				temp.setleft(temp.getleft().getleft());
			} else { //has two children
				//keep going throughout the right subtree until the first left subtree node is found. keep going until the leftmost subtree node, 
				//then use that node for the original node. Set the previous node of the original node to the next right subtree of the original node.
				BSTnode node = temp.getright();
				//node = temp.getright();
				while(true) {
					if (node.getleft()!=null) {
						node = node.getleft();
						if (node.getleft()==null) { //we have found the node
							break;
						}
					} else {
						node = node.getright();
					}
				}
				temp = node;
				//use a while loop to get to the previous node of the current node
				temp = this.head;
				while(true) {
					if (n>temp.value()) {
						if (temp.getright()==node) break;
						temp = temp.getright();
					} else {
						if (temp.getleft()==node) break;
						temp = temp.getleft();
					}
				}
				//removes the node
				if (temp.getright()==null && temp.getleft()==null) { //if the node is a leaf
					temp = null;
				} else if (temp.getleft() == null) {// has a right child 
					//use a while loop to get to the previous node, then set the next right node to the node after the next
					temp = this.head;
					while(true) {
						if (n>temp.value()) {
							if (temp.getright().value()==n) break;
							temp = temp.getright();
						} else {
							if (temp.getleft().value()==n) break;
							temp = temp.getleft();
						}
					}
					temp.setright(temp.getright().getright());

				} else if (temp.getright() == null) {// has a left child 
					//use a while loop to get to the previous node, then set the next left node to the node after the next
					temp = this.head;
					while(true) {
						if (n>temp.value()) {
							if (temp.getright().value()==n) break;
							temp = temp.getright();
						} else {
							if (temp.getleft().value()==n) break;
							temp = temp.getleft();
						}
					}
					temp.setleft(temp.getleft().getleft());
				}
			}
		}
		this.size--;
	}
}
