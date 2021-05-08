package project;
import java.util.Scanner;
public class CCCFederalVotingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		for (int i=0; i<A; i++) {
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			boolean eligible = false;
			if (y<1989) {
				eligible = true;
			} 
			if (y==1989 && m<2) {
				eligible = true;
			}
			if (y==1989 && m==2 && d<=27) {
				eligible = true;

			}
			if (eligible) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}

}
