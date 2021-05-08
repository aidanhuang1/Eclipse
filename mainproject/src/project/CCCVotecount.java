package project;
import java.util.Scanner;
public class CCCVotecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int Acount = 0;
		int Bcount = 0;
		String B = sc.next();
		for (int i=0; i<A; i++) {
			if (B.charAt(i)=='A') {
				Acount++;
			}
			if (B.charAt(i)=='B') {
				Bcount++;
			}
		}
		if (Bcount==Acount) {
			System.out.println("Tie");
		}
		if (Bcount>Acount) {
			System.out.println("B");
		}
		if (Bcount<Acount) {
			System.out.println("A");
		}
	}

}
