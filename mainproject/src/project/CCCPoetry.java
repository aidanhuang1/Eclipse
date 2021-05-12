package project;
import java.util.*;
import java.io.*;
public class CCCPoetry {
	
	public static String getlast(String a) {
		for (int i=a.length()-1; i>=0; i--) {
			char x = a.charAt(i);
			if (x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
				return a.substring(i,a.length()-1);
			}
		}
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<N; i++) {
			String[] array = new String[4];
			for (int j=0; j<4; j++) {
				String line = sc.nextLine().toLowerCase();
				String temp[] = line.split(" ");
				array[j] = temp[temp.length-1];
			}
			String line1 = getlast(array[0]);
			String line2 = getlast(array[1]);
			String line3 = getlast(array[2]);
			String line4 = getlast(array[3]);
			if (line1.equals(line2) && line2.equals(line3) && line3.equals(line4) && line1.equals(line4)) {
				System.out.println("perfect");
			} 
			else if (line1.equals(line2) && line3.equals(line4)) {
				System.out.println("even");
			}
			else if (line1.equals(line3) && line2.equals(line4)) {
				System.out.println("cross");
			}
			else if (line1.equals(line4) && line2.equals(line3)) {
				System.out.println("shell");
			} else {
				System.out.println("free");
			}
		}
	}

}
