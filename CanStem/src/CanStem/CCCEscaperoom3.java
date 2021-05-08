package CanStem;
import java.util.*;
public class CCCEscaperoom3 {

	public static int[][] room;
	public static boolean k = false;
	public static void check(int r, int c) {
		if(r==1 && c==1) {
			k = true;
		} else {
			room[r-1][c-1] = 0;
			for (int i=0; i<r; i++) {
				for (int j=0; j<c; j++) {
					if (room[i][j] == (r*c)) {
						check(i+1, j+1);
					}
				}
			}

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		room = new int [r][c];
		for (int i=0; i<r; i++) {
			String row = sc.nextLine();
			String[] temp = row.split(" ");
			for (int j=0; j<c; j++) {
				room[i][j] = Integer.parseInt(temp[j]);
			}

		}
		check(r, c);
		if (k) {
			System.out.println("yes");
		} else {
			System.out.println("false");
		}

	}

}
