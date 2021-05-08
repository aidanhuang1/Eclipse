package main;
import java.util.Scanner;
public class CCCFrom1987to2013 {

	public static int nextyear(int y) {
		int orig = y;
		while (true) {
			boolean distinct = true;
			String y1 = Integer.toString(y);
			check:
				for (int i=0; i<y1.length(); i++) {
					char x = y1.charAt(i);
					for (int j=0; j<y1.length(); j++) {
						if (y1.charAt(j)==x && i!=j) {
							y++;
							distinct = false;
							break check;
						}
					}
				}
			if (y==orig) return y;
			else if (distinct) return y;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.println(nextyear(y+1));
	}
}
