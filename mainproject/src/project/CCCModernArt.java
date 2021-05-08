package project;
import java.util.*;
public class CCCModernArt {
	
	public static int totalgold = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt(), K = sc.nextInt();
		boolean[] row = new boolean[M];
		boolean[] col = new boolean[N];
		int totalgoldrows = 0;
		
		for (int i=0; i<K; i++) {
			String roworcol = sc.next();
			int position = sc.nextInt() - 1;
			if (roworcol.equals("R")) {
				if (row[position] == false) {
					row[position] = true;
				} else if (row[position] == true) {
					row[position] = false;
				}
			} else if (roworcol.equals("C")) {
				if (col[position] == false) {
					col[position] = true;
				} else if (col[position] == true) {
					col[position] = false;
				}
			}
		}
		for (int i=0; i<M; i++) {
			if (row[i]==true) {
				totalgoldrows++;
				totalgold += N;
				
			}
		}
	
		for (int i=0; i<N; i++) {
			if (col[i]==true) {
				totalgold += ((-totalgoldrows)+(M-totalgoldrows));
			}
		}
		System.out.println(totalgold);

	}

}
