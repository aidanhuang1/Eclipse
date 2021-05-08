package main;
import java.util.Scanner;
public class CCCUpandDown {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), Nikky = 0, Byron = 0;
		int Nikkya = 0, Nikkyb = 0, Byronc = 0, Byrond = 0;
		int cases = 0;
		while(e<=12) {
			switch(cases) {
			case 0:
				if (Nikkya==a) {
					Nikkyb = 0;
					Nikky++;
				} else {
					Nikky++;
				}
				if (Byronc==c) {
					Byrond = 0;
					Byron++;
				} else {
					Byron++;
				}
			case 1:
				if (Nikkyb==b) {
					Nikkya = 0;
					Nikky--;
				} else {
					Nikky--;
				}
				if (Byrond==d) {
					Byrond = 0;
					Byron--;
				} else {
					Byron--;
				}
			}
		}
		if (Nikky>Byron) {
			System.out.println("Nikky");
		} else if (Byron>Nikky) {
			System.out.println("Bryon");
		} else if (Byron==Nikky) {
			System.out.println("Tied");
		}

		System.out.println(Nikky);
		System.out.println(Byron);

	}

}
