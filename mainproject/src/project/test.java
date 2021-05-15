package project;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {1,2,3,4};
		int[] test2 = test1;
		for (int i=0; i<test1.length; i++) {
			test1[i]++;
		}
		System.out.println(Arrays.toString(test2));

	}

}
