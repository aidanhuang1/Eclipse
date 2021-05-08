package project;
import java.io.*;
import java.util.*;
public class CCCUnfriend {
	


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] network = new int[6][6];
		
		int N = sc.nextInt();
		friendlist.add(N);
		for (int i=1; i<N; i++) {	
			int J = sc.nextInt();
			if (!friendlist.contains(J)) { // new friend is added
				friendlist.add(J);
				newarraylist(J);
				ArrayList<Integer> friendlist = new ArrayList<Integer>();
			}
		}
		
	}

}
