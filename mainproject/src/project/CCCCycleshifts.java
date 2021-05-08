package project;
import java.util.Scanner;
public class CCCCycleshifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		String S = sc.next();
		boolean cycle = false;

		for (int i=0; i<S.length(); i++) {
			if (T.contains(S)) {
				cycle = true;
			}
			if (!T.contains(S)) {
				// Move first character to the last character
				S = S.substring(1) + S.charAt(0);
				
			}
		}
		// Make sure when using boolean, you use double equal marks "==" instead of one "="
		if (cycle == true) {
			System.out.print("yes");
		} else {
			System.out.print("no");

		}
	}
}


