package project;
import java.util.Scanner;
public class CCCRotatingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String A = sc.next();

		if (A.contains("A") || A.contains("B") || A.contains("C") || A.contains("D") || A.contains("E") || A.contains("F") || A.contains("G") || A.contains("J") || A.contains("K") || A.contains("L") || A.contains("M") || A.contains("P") || A.contains("Q") || A.contains("R") || A.contains("T") || A.contains("U") || A.contains("V") || A.contains("W") || A.contains("Y")) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}
