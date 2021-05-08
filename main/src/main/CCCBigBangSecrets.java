package main;
import java.util.Scanner;

public class CCCBigBangSecrets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		String c = ""; // changed text
		for (int i=0; i<b.length(); i++) {
			int S = 3*(i+1) + a;
			char character = b.charAt(i);
			int ASCIInumber = (int) character;
			ASCIInumber = ASCIInumber-S;
			
			if (ASCIInumber < 65) {
				int difference = 64-ASCIInumber;
				ASCIInumber = 90-difference;
			}
			c = c+(char) ASCIInumber;
		
		}
		System.out.println(c);
		

	}

}
