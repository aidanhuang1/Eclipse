package project;
import java.util.Scanner;
public class CCCSoundsfishy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (a<b && b<c && c<d) {
			System.out.print("Fish Rising");
		}
		else if (c>d && b>c && a>b) {
			System.out.print("Fish Diving");
		}
		else if (a==b && b==c && c==d) {
			System.out.print("Fish At Constant Depth");
			
		} else {
			System.out.print("No Fish");
		}

	}

}
