package project;
import java.util.*;
public class CCCReturninghome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> street = new ArrayList<String>();
		ArrayList<Character> direction = new ArrayList<Character>();
		while (true) {
			char a = sc.next().charAt(0);
			String b = sc.next();
			
			direction.add(a);
			if (b.equals("SCHOOL")) {
				break;
			}
			street.add(b);
		}
		for (int i=direction.size()-1; i>0; i--) {
			if (direction.get(i)=='R')
				System.out.printf("Turn LEFT onto ");
			else if (direction.get(i)=='L')
				System.out.printf("Turn RIGHT onto ");
			System.out.printf("%S street.\n", street.get(i-1));
		}
		if (direction.get(0)=='R') {
			System.out.printf("Turn LEFT into your HOME.");
		} else if (direction.get(0)=='L') {
			System.out.printf("Turn RIGHT into your HOME.");
		}

	}

}
