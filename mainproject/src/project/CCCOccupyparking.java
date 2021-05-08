package project;
import java.util.Arrays;
import java.util.Scanner;
public class CCCOccupyparking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = 0;
		String A = sc.next();
		String B = sc.next();

		for (int i=0; i<A.length(); i++) {
			Character Ai = A.charAt(i);
			Character Bi = B.charAt(i);
			// Use '' and not "" 
			if (Ai.equals('C')&&(Bi.equals('C'))) {
				X++;


			}

		}
		System.out.print(X);
		
		// You can close scanner here
		sc.close();
	}
}

