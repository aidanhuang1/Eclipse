package project;
import java.util.Scanner;
public class CCCShiftySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		int a = N;
		for (int i=0; i<k; i++) {
			N = (N*10);
			sum = sum + N;
			
		}
		System.out.print(sum+a);

	}

}
