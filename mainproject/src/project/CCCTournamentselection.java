package project;
import java.util.Scanner;
public class CCCTournamentselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int wins = 0;
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String d = sc.next();
		String e = sc.next();
		String f = sc.next();
		if (a.equals("W")) {
			wins++;
		}
		if (b.equals("W")) {
			wins++;
		}
		if (c.equals("W")) {
			wins++;
		}
		if (d.equals("W")) {
			wins++;
		}
		if (e.equals("W")) {
			wins++;
		}
		if (f.equals("W")) {
			wins++;
		}
		if (wins==1 || wins==2) {
			System.out.println("3");
		}
		if (wins==3 || wins==4) {
			System.out.println("2");
		}
		if (wins==5 || wins==6) {
			System.out.println("1");
		}
		if (wins==0) {
			System.out.println("-1");
		}


	}

}
