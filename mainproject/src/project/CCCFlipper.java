package project;
import java.util.Collections;
import java.util.Scanner;
public class CCCFlipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int A[][] = { {1, 2 } , {3, 4 } };
		A[0][0] = 1;
		A[0][1] = 2;
		A[1][0] = 3;
		A[1][1] = 4;
		int t = 0;
		int countH = N.length() - N.replace("H", "").length();
		int countV = N.length() - N.replace("V", "").length();

		// need to replace array with other array
		// add a third variable
		for (int i=0; i<countH; i++) {
			t = A[0][0];
			A[0][0] = A[1][0];
			A[1][0] = t;
			t = A[0][1];
			A[0][1] = A[1][1];
			A[1][1] = t;
		}

		for (int i=0; i<countV; i++) {
			t = A[0][0];
			A[0][0] = A[0][1];
			A[0][1] = t;
			t = A[1][0];
			A[1][0] = A[1][1];
			A[1][1] = t;

		}

		System.out.println(A[0][0]+" "+A[0][1]);
		System.out.println(A[1][0]+" "+A[1][1]);

	}

}
