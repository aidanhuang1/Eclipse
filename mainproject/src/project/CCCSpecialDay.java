package project;
import java.util.Scanner;
public class CCCSpecialDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A==2 && B==18) {
			System.out.println("Special");
		}
		if (A<2) {
			System.out.println("Before");
		}
		if (A>2) {
			System.out.println("After");
		}
		if (A==2 && B>18) {
			System.out.println("After");
		}
		if (A==2 && B<18) {
			System.out.println("Before");
		}

	}

}
