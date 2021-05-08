package project;
import java.util.*;
public class CCCKeepingScore {
	static int totalall = 0;
	public static int points(String suit) {
		int total = 0;
		if (suit.length()==0) {
			total+=3;
			totalall+=3;
			return total;
		} else if (suit.length()==1) {
			total+=2;
		} else if (suit.length()==2) {
			total+=1;
		}
		String[] newsuit = suit.split("");
		for (int i=0; i<newsuit.length; i++) {
			if (newsuit[i].charAt(0)=='A') {
				total+=4;
			} else if (newsuit[i].charAt(0)=='K') {
				total+=3;
			} else if (newsuit[i].charAt(0)=='Q') {
				total+=2;
			} else if (newsuit[i].charAt(0)=='J') {
				total+=1;
			}
		}
		totalall+=total;
		return total;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cards = sc.next();
		String[] newcards = cards.split("C|D|H|S");
		System.out.println("Cards Dealt			Points");
		for (int i=1; i<newcards.length; i++) {
			switch (i) {
			case 1: 
				System.out.print("Clubs ");
				break;
			case 2:
				System.out.print("Diamonds ");
				break;
			case 3:
				System.out.print("Hearts ");
				break;
			case 4:
				System.out.print("Spades ");
				break;
			}
			String[] suit = newcards[i].split("");
			for (int j=0; j<suit.length; j++) {
				System.out.printf(suit[j]+" ");
			}
			System.out.print("              "+points(newcards[i]));
			System.out.println();
		}
		System.out.println("                     Total "+totalall);
	}

}
