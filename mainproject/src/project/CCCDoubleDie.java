package project;
import java.util.Scanner;

public class CCCDoubleDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Antonia = 100;
		int David = 100;
		for (int i=0; i<N; i++) {
			int Anto = sc.nextInt();
			int Dav = sc.nextInt();
			if (Anto < Dav) {
				Antonia = Antonia - Dav;
			}
			if (Dav < Anto) {	
				David = David - Anto;
			}
			else {
			}
		}

		System.out.println(Antonia);
		System.out.println(David);


	}

}
