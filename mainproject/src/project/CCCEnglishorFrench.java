package project;
import java.util.Scanner;
public class CCCEnglishorFrench {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int Tcount = 0;
		int Scount = 0;
		String text = "";
		for (int i=0; i<A; i++) {
			text += sc.nextLine();
		}
		text += sc.nextLine();
		
		text = text.toLowerCase();
		for (int i=0; i<text.length(); i++) {
			if (text.charAt(i)=='s') {
				Scount++;
			}
			else if (text.charAt(i)=='t') {
				Tcount++;
			}
		}

		System.out.println();
		if (Scount==Tcount) {
			System.out.println("French");
		}
		else if (Scount<Tcount) {
			System.out.println("English");
		}
		else if (Tcount<Scount) {
			System.out.println("French");
		}
	}

}
