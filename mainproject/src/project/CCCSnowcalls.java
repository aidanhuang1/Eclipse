package project;
import java.util.*;
public class CCCSnowcalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++) {
			char[] numbers = new char[10];
			String old = sc.next();
			old = old.replaceAll("[^A-Z 0-9]", "");
			for (int a=0; a<10; a++) {
				numbers[a] = old.charAt(a);
			}
			for (int j=0; j<10; j++) {
				if ((int) numbers[j]>=65 && (int) numbers[j]<=90) {
					switch (numbers[j]) {
					case 'A':
					case 'B':
					case 'C':
						numbers[j] = '2';
						break;
					case 'D':
					case 'E':
					case 'F':
						numbers[j] = '3';
						break;
					case 'G':
					case 'H':
					case 'I':
						numbers[j] = '4';
						break;
					case 'J':
					case 'K':
					case 'L':
						numbers[j] = '5';
						break;
					case 'M':
					case 'N':
					case 'O':
						numbers[j] = '6';
						break;
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
						numbers[j] = '7';
						break;
					case 'T':
					case 'U':
					case 'V':
						numbers[j] = '8';
						break;
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
						numbers[j] = '9';
						break;
					}
				}	
			}
			for (int e=0; e<3; e++)
				System.out.print(numbers[e]);
			System.out.print("-");
			for (int e=3; e<6; e++) 
				System.out.print(numbers[e]);
			System.out.print("-");
			for (int e=6; e<10; e++)
				System.out.print(numbers[e]);
			System.out.println();
		}

	}
}
