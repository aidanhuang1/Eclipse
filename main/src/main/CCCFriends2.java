package main;
import java.util.*;
import java.io.*;
class node {
	String value;
	node next;

	public node(String value) {
		this.value = value;
	} 
	public void setNext(node next) {
		this.next = next;
	}
	public String getVal() {
		return value;
	}
	public node getNext() {
		return next;
	}
}

class clist{
	node head;
	int size = 0;

	public clist() {}
	public void add(node n) {
		if (this.head==null) {
			this.head = n;
		} else {
			
		}
	}
	public boolean has(String value) { //see if value is in linkedlist

	}

	public int separation(String v1, String v2) { //if they both in linkedlist, find separation between two

	}
}

class CCCFriends2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt();
			if (a==0 && b==0) {
				break;
			} else {
				int distance = 0;
				for (int i=0; i<friends1.size(); i++) {
					//					if (friends1.get(i))
				}
			}
		}
	}
}