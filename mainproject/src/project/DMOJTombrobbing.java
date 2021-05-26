package project;
import java.util.*;
import java.io.*;
public class DMOJTombrobbing {
	
	public static int r;
	public static int c;
	
	public static int search(int r, int c, char[][] grid) {
		int count = 0;
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (grid[i][j]=='.') {
					count++;
					BFS(i, j, grid);
				}
			}
		}
		return count;
	}
	
	public static void BFS(int i, int j, char[][] grid) {
		if (i<0 || i>=r || j<0 || j>=c || grid[i][j]!='.') {
			return;
		}
		grid[i][j] = 'X';
		BFS(i+1, j, grid);
		BFS(i, j+1, grid);
		BFS(i-1, j, grid); 
		BFS(i, j-1, grid);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		char[][] grid = new char[r][c];
		for (int i=0; i<r; i++) {
			String[] temp = sc.next().split("");
			for (int j=0; j<c; j++) {
				grid[i][j] = temp[j].charAt(0);
			}
		}
		System.out.println(search(r, c, grid));

	}

}
