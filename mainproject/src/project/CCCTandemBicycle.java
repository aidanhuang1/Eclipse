package project;
import java.util.*;
import java.io.*;
public class CCCTandemBicycle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int question = sc.nextInt(), n = sc.nextInt(), total = 0;
		int[] Dmoj = new int[n], Peg = new int[n];
		for (int i=0; i<n; i++) {
			Dmoj[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			Peg[i] = sc.nextInt();
		}
		Arrays.sort(Dmoj);
		Arrays.sort(Peg);

		if (question==1) { //min
			for (int i=0; i<n; i++) {
				total+=Math.max(Peg[i], Dmoj[i]);
			}
		} else if (question==2) { //max
			int[] newpeg = new int[n];
			int j = n;
			for (int i=0; i<n; i++) {
				newpeg[j-1] = Peg[i];
				j = j - 1;
			}
			for (int i=0; i<n; i++) {
				total+=Math.max(newpeg[i], Dmoj[i]);
			}
		}
		System.out.println(total);
	}
}
