package CanStem;
import java.util.Scanner;

public class CCCEscaperoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int rooms [][] = new int [m+1][n+1];
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				rooms[i][j] = sc.nextInt();
			}

		}
		System.out.println("ok");
		int current = rooms[0][0];
		boolean end = false;
		while (!end) {
			for (int i=0; i<m; i++) {
				for (int j=0; j<n; j++) {
					if (i+1 == m && j+1 == n) {
						//when you reach the end
						end = true;
						break;
					} else if ((i+1)*(j+1)==current) {
						current = rooms[i][j];
						rooms[i][j] = 0; // when you reach that new number, make it turn to null so that you won't come back to it again
					}
				}

			}

		}	
		if (end) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}




