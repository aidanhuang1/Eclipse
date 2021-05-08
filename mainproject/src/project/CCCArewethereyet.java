package project;

import java.util.Scanner;

public class CCCArewethereyet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] A = new int [5];
		for (int i=0; i<A.length; i++) {
			if (i==0) {
				A[0] = 0;
			} else {
				A[i] = sc.nextInt();
			}

		}
		for (int i=0; i<A.length; i++) {
			if (i!=0) {
				A[i] += A[i - 1];
			}
		}
		for (int i=0; i<5; i++) {
			System.out.print(Math.abs(A[i] - A[0]) + " ");
			System.out.print(Math.abs(A[i] - A[1]) + " ");
			System.out.print(Math.abs(A[i] - A[2]) + " ");
			System.out.print(Math.abs(A[i] - A[3]) + " ");
			System.out.print(Math.abs(A[i] - A[4]) + " \n");
		}

	}



}