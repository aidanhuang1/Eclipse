package project;
import java.util.Scanner;
public class CCCSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		double B = Math.sqrt(A);
		int C = (int) B;
		System.out.println("The largest square has side length "+(C)+".");
		
	}

}
