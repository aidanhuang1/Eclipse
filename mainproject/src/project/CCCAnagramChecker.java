package project;
import java.util.Arrays;
import java.util.Scanner;
public class CCCAnagramChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean anagram = false;
		String A = sc.nextLine();
		String B = sc.nextLine();
		A = A.replaceAll(" ", "");
		B = B.replaceAll(" ", "");
		A = A.toLowerCase();
		B = B.toLowerCase();
		char one[] = A.toCharArray();
		char two[] = B.toCharArray();
		Arrays.sort(one);
		Arrays.sort(two);
		anagram = Arrays.equals(one, two);
		if (anagram) {
			System.out.println("Is an anagram.");
		} else {
			System.out.println("Is not an anagram.");
		}
	
	}



}
