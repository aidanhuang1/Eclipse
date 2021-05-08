package CanStem;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int m = 4;
		int rooms [][] = new int [m+1][n+1];
		for (int i=1; i<m+1; i++) {
			for (int j=1; j<n+1; j++) {
				rooms[i][j] = sc.nextInt();
			}

		}
		for (int i=1; i<m+1; i++) {
			for (int j=1; j<n+1; j++) {
				System.out.print(rooms[i][j]+" ");
			}
			System.out.println();

		}
	}
}