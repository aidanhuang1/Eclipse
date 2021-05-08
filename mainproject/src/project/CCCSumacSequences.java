package project;
import java.util.Scanner;
public class CCCSumacSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int firstterm = sc.nextInt();
		int secondterm = sc.nextInt();
		int count = 2;
		int nextterm = firstterm - secondterm;
		while (firstterm >= secondterm) {
			firstterm = secondterm;
			secondterm = nextterm;
			nextterm = firstterm - secondterm;
			count++;
			if (firstterm < secondterm) {
				System.out.println(count);
				break;

			}
		}


	}

}
