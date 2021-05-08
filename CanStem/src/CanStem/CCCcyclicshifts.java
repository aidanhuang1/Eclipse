package CanStem;
import java.util.*; // java.util.* imports everything from util (including scanner, arraylist, etc...)
public class CCCcyclicshifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for (int i=0; i<str.length(); i++) {
			String T = sc.next();
			cyclicshifts shifts = new cyclicshifts(T);
			shifts.checkcyclicshifts(str, T);
		}
		
		
	}

}
