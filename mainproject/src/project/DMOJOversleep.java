package project;
import java.util.*;
import java.io.*;
public class DMOJOversleep {
	public static int time = 0;
	public static boolean found = false;
	public static int[] s_pos = new int[2]; //starting

	public static int search(char[][] map, int n, int m) {		
		Queue<Integer> queuei = new LinkedList<Integer>();
		Queue<Integer> queuej = new LinkedList<Integer>();
		queuei.add(s_pos[0]);
		queuej.add(s_pos[1]);
		int count = 0;
		
		while (!queuei.isEmpty()) {
			int size = queuei.size();
			for (int i=0; i<size; i++) {
				int tempi = queuei.poll();
				int tempj = queuej.poll();
				if (tempi>=n||tempi<0||tempj>=m||tempj<0||map[tempi][tempj]=='X') {
					continue;
				}
				if (map[tempi][tempj]=='e') {
					return count;
				}
				map[tempi][tempj] = 'X';
				queuei.add(tempi+1);
				queuej.add(tempj);
				queuei.add(tempi-1);
				queuej.add(tempj);
				queuei.add(tempi);
				queuej.add(tempj-1);
				queuei.add(tempi);
				queuej.add(tempj+1);
			}
			count++;
		}
		return 0;
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
			}
		}
		System.out.println(search(map, n, m)-1);

	}

}
