package main;
import java.util.*;
public class CCCFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			String a = sc.next(), b = sc.next(), c = sc.next();
			boolean fixfree = true;
			if ((a.charAt(0))==(b.charAt(0)) && (b.charAt(0))==(c.charAt(0))) {
				fixfree = false;
			}
			if (fixfree) {
				System.out.println("Yes");
			} else {

				if ((a.charAt(a.length()-1))==(b.charAt(b.length()-1)) && (b.charAt(b.length()-1))==(c.charAt(c.length()-1))) {
					fixfree = false;
				}
				if (fixfree) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}

		}

	}

}
