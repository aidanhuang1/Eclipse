package project;
import java.util.Scanner;
public class CCCIconscaling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = ("*x*");
		String B = (" xx");
		String C = ("* *");
		for (int c=0; c<N; c++) {
			for (int i=0; i<3; i++) {
				for (int j=0; j<N; j++) {
					System.out.print(A.charAt(i));			
				}	
			}
			System.out.println("");
		}
		for (int c=0; c<N; c++) {
			for (int i=0; i<3; i++) {
				for (int j=0; j<N; j++) {
					System.out.print(B.charAt(i));
				}
			}
			System.out.println("");
		}
		for (int c=0; c<N; c++) {
			for (int i=0; i<3; i++) {
				for (int j=0; j<N; j++) {
					System.out.print(C.charAt(i));		
				}
			}
			System.out.println("");
		}
	}
}



