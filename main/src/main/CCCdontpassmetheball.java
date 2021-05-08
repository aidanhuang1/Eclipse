package main;
import java.util.Scanner;

public class CCCdontpassmetheball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int e = A, combinations = 0;
		for (int b=1; b<e-3; b++) {
			for (int c=b+1; c<e-2; c++) {
				for (int d=c+1; d<e-1; d++) {
					combinations++;
					System.out.println(b+" "+c+" "+d+" "+e);
				}
			}
		}
		System.out.println(combinations);
	}

}


