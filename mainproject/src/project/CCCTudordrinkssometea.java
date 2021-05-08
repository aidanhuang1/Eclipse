package project;
import java.util.Scanner;
public class CCCTudordrinkssometea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i=0; i<5; i++) {
			String A = sc.next();
			if (A.equals("P")) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
