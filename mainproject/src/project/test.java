package project;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>[] list = new ArrayList[5];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Integer>();
		}
		ArrayList<Integer> a = list[0];
		System.out.println(a);
	}

}
