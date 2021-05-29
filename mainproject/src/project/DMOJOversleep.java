package project;
import java.util.*;
import java.io.*;
public class DMOJOversleep {
	public static int time = 0;
	public static boolean found = false;
	public static int[] s_pos = new int[2]; //starting
	public static int[] e_pos = new int[2]; //destination
	public static int i =s_pos[0];
	public static int j =s_pos[1];
	public static int search(char[][] map, int n, int m) {		

		
//		for (int xy=0; xy<n*m; xy++) {
		BFS(map, i, j, n, m);


//			if (found) {
//				return time;
//			}
//		}
		return time;
	}

	public static void BFS(char[][] map, int i, int j, int n, int m) {
		if (i>=n||i<0||j>=m||j<0||map[i][j]=='X') {
			return;
		}
		if (map[i][j]=='e' || found==true) {
			found = true;
			return;
		}
		

		BFS(map, i+1, j, n, m);
		BFS(map, i, j+1, n, m);
		BFS(map, i-1, j, n, m);
		BFS(map, i, j-1, n, m);
		time++;
//		return true;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		char[][] map = new char[n][m];
		for (int i=0; i<n; i++) {
			String[] temp = sc.next().split("");
			for (int j=0; j<m; j++) {
				map[i][j] = temp[j].charAt(0);
				if (temp[j].charAt(0)=='s') {
					s_pos[0] = i;
					s_pos[1] = j;
				}
				if (temp[j].charAt(0)=='e') {
					e_pos[0] = i;
					e_pos[1] = j;
				}
			}
		}
		System.out.println(search(map, n, m)-1);

	}

}
