package practice;

import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[] Peg = new int[] {1, 2, 3, 4};
		int[] newpeg = new int[n];
		int j = n;
		for (int i=0; i<n; i++) {
			newpeg[j-1] = Peg[i];
			j--;
		}
		System.out.println(Arrays.toString(Peg)+"\n"+Arrays.toString(newpeg));

	}

}
