/*
 * CURRENT PROBLEM:
 * If it finds a cell that does not have any other cells to go to, it needs to delete that cell
 * and go back to find a new cell to attempt
 */

package project;
import java.io.*;
public class CCCEscapeRoom {
	public static int[][] room;
	public static int current;
	public static boolean k = false;
	public static boolean firsttimechangecurrent = true;
	public static boolean changecurrent = false;
	static int currentrow = -1;
	static int currentcol = -1;
	
	public static boolean check(int r, int c) {
		if (r==1 && c==1) {
			k = true;
			return true;
		} else {
			if (firsttimechangecurrent) {
				current = room[0][0];
				firsttimechangecurrent = false;
			}
			if (changecurrent) {
				current = room[0][0];
				changecurrent = false;
			}
			boolean foundnewcell = false;
			for (int i=0; i<r; i++) {
				for (int j=0; j<c; j++) {
					System.out.println(room[i][j]);
					if ((i+1)*(j+1)==current && currentrow!=i && currentcol!=j && room[i][j]!=-1) { //if it finds a new cell
						
						current = room[i][j];
						currentrow = i;
						currentcol = j;
						foundnewcell = true;
						System.out.println("found a new cell   "+current+"      "+(i+1)+" "+(j+1));
						if (i+1==r && j+1==c) { //if it reaches the end (and found a new cell)
							System.out.println("finish     "+current+"     "+r+" "+c+"    "+i+" "+j);
							k = true;
							return true;
						}
						
					}

				}
			}
			for (int i=0; i<r; i++) {
					for (int j=0; j<c; j++) {
						System.out.print(room[i][j]+" ");
					}
					System.out.println();
			}
			if (!foundnewcell && room[0][0] == -1) {
				//it isn't possible to escape the room
				System.out.println("can't do it");
				return false;
			} else if (!foundnewcell) { //do not use the current cell since it has no other cells to go to
				System.out.println("going back");
				room[currentrow][currentcol] = -1;
				currentrow = 0;
				currentcol = 0;
				changecurrent = true;
//				currentrow = 0;
//				currentcol = 0;
				check(r,c);
			} else if (foundnewcell) { //found a new cell but currently does not find further cells in its path
				System.out.println("found something");
//				changecurrent = true;
//				current = room[0][0];
				check(r,c);
				
			}
		}
		System.out.println("second can't do it");
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		room = new int [r][c];
		for (int i=0; i<r; i++) {
			String[] reader = br.readLine().split(" ");	
			for (int j=0; j<c; j++) {
				room[i][j] = Integer.parseInt(reader[j]);
			}
		}

		if (check(r,c)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
