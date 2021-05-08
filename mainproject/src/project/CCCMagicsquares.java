package project;
import java.util.Scanner;
public class CCCMagicsquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean magicsquare = true;
		int square [][] = new int [4][4];
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				square[i][j] = sc.nextInt();
			}
		}
		
		int row1 = square[0][0] + square[0][1] + square[0][2] + square[0][3];
		int col1 = square[0][0] + square[1][0] + square[2][0] + square[3][0];
		
		for (int i=1; i<4; i++) {
			int rowsum = 0;
			for (int j=0; j<4; j++) {
				rowsum = rowsum + square[i][j];		
			}
			if (rowsum==row1 && col1==rowsum) {
				magicsquare = true;
			} else {
				magicsquare = false;
				break;
			}

		}
		for (int i=1; i<4; i++) {
			int colsum = 0;
			for (int j=0; j<4; j++) {
				colsum = colsum + square[j][i];		
			}
			if (colsum==col1 && row1==colsum && magicsquare==true) {
				magicsquare = true;
			} else {
				magicsquare = false;
				break;
			}
		}
		
		if (magicsquare) {
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}
		//use .toString for 1D array, use .deepToString for 2D array

	}

}
