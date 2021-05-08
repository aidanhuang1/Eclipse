package CanStem;
import java.util.Scanner;
public class CCCSunflowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] A = new int[N][N];
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				A[i][j] = sc.nextInt();

			}
		}
		int a = 0;
		int b = 0;
		if (A[0][0] < A[0][N-1]) {
			b = 0;
		} else {
			b = N-1;
		}
		if (A[0][b] < A[N-1][b]) {
			a = 0;
		} else {
			a = N-1;
		}

		//if it is top left
		if (a==0 && b==0) {
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					System.out.print(A[i][j]+" ");
				}
				System.out.println();
			}
		}
		//if it is top right
		else if (a==0 && b>0) {
			for (int i=N-1; i >=0; i--) {
				for (int j=0; j<N; j++) {
					System.out.print(A[j][i]+" ");
				}
				System.out.println();
			}
	
		}

		//if it is bottom right	
		else if (a>0 && b>0) {
			for (int i=N-1; i>=0; i--) {
				for (int j=N-1; j>=0; j--) {
					System.out.print(A[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		//if it is bottom left
		else {
			for (int j=0; j<N; j++) {
				for (int i=N-1; i>=0; i--) {
					System.out.print(A[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}



