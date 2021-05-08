package main;
import java.util.*;
public class CCCFlipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int hcount = 0, vcount = 0;
		for (int i=0; i<n.length(); i++) {
			if (n.charAt(i)=='H') {
				hcount++;
			} else if (n.charAt(i)=='V') {
				vcount++;
			}
		}
		int[][] grid = new int [2][2];
		grid[0][0] = 1;
		grid[0][1] = 2;
		grid[1][0] = 3;
		grid[1][1] = 4;
		
		if (hcount%2!=0) {
			int temp = grid[0][0];
			grid[0][0] = grid[1][0];
			grid[1][0] = temp;
			temp = grid[0][1];
			grid[0][1] = grid[1][1];
			grid[1][1] = temp;
		}
		if (vcount%2!=0) {
			int temp = grid[0][0];
			grid[0][0] = grid[0][1];
			grid[0][1] = temp;
			temp = grid[1][0];
			grid[1][0] = grid[1][1];
			grid[1][1] = temp;
		}
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}

}
