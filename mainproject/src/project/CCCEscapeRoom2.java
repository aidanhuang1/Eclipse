package project;

import java.io.*;
import java.util.*;
public class CCCEscapeRoom2 {
	public static int[][] room;
	public static ArrayList<Integer> rqueue=new ArrayList<Integer>();  
	public static ArrayList<Integer> cqueue=new ArrayList<Integer>();  

	public static boolean check() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if (r==1 && c==1) {
			return true;
		}
		rqueue.add(0);
		cqueue.add(0);

		room = new int [r][c];
		for (int i=0; i<r; i++) {
			String[] reader = br.readLine().split(" ");	
			for (int j=0; j<c; j++) {
				room[i][j] = Integer.parseInt(reader[j]);
				if ((i+1)*(j+1)==room[rqueue.get(0)][cqueue.get(0)] && (i+j)>0) {
					rqueue.add(i);
					cqueue.add(j);
					if ((i==r-1) && (j==c-1)) {
						return true;
					}
				}
			}
		}
		while(rqueue.size()>0 && cqueue.size()>0) {
			for (int i=0; i<r; i++) {
				for (int j=0; j<c; j++) {
					if ((i+1)*(j+1)==room[rqueue.get(0)][cqueue.get(0)] && (i+j)>0) {
						rqueue.add(i);
						cqueue.add(j);
						if ((i==r-1) && (j==c-1)) {
							return true;
						}
					}
				}
			}
			rqueue.remove(0);
			cqueue.remove(0);
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		if (check()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
