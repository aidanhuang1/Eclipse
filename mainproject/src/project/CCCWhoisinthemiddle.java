package project;
import java.util.Arrays;
import java.util.Scanner;
public class CCCWhoisinthemiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A[] = new int[3];
		for (int i=0; i<3; i++) {
			A[i] = sc.nextInt();
			
		}
		Arrays.sort(A);
		System.out.println(A[1]);
		
		

	}

}
