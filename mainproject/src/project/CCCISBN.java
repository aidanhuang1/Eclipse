package project;
import java.util.Scanner;
public class CCCISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum = 91+(A)+(B*3)+(C);
		System.out.println("The 1-3-sum is "+sum);
	}

}
