package project;
import java.util.Scanner;

public class CCCEpidemiology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt(); // people
		int N = sc.nextInt(); // people who have disease day 1
		int R = sc.nextInt(); // r-naught
		int D = 0; // The number of days
		int totalday = N; // the total people infected
		while (totalday <= P) {
			N = (N * R);
			totalday = (N + totalday);
			D = D + 1;
			if (totalday > P) {
				System.out.print(D);
			}
		}

	}

}



