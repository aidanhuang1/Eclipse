package project;
import java.util.Scanner;
public class CCCWhichalien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int antenna = sc.nextInt();
		int eyes = sc.nextInt();
		boolean TroyMartian = false;
		boolean VladSaturnian = false;
		boolean GraemeMercurian = false;
		if (antenna>=3 && eyes<=4) {
			TroyMartian = true;
		}
		if (antenna<=6 && eyes>=2) {
			VladSaturnian = true;
		}
		if (antenna<=2 && eyes<=3) {
			GraemeMercurian = true;
		}
		if (TroyMartian) {
			System.out.println("TroyMartian");
		}
		if (VladSaturnian) System.out.println("VladSaturnian");
		if (GraemeMercurian) System.out.println("GraemeMercurian");

	}

}
