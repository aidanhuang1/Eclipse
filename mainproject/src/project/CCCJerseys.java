package project;
import java.util.*;

public class CCCJerseys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int J = sc.nextInt(), A = sc.nextInt(), count = 0;
		int[] jerseys = new int [1000001];
		for (int i=1; i<=J; i++) {
			char size = sc.next().charAt(0);
			if (size=='S') {
				jerseys[i] = 1;
			} else if (size=='M') {
				jerseys[i] = 2;
			} else if (size=='L') {
				jerseys[i] = 3;
			}
		}
		for (int i=1; i<=A; i++) {
			char size = sc.next().charAt(0);
			int jerseysize = 0;
			int number = sc.nextInt(); 

			if (size=='S') {
				jerseysize = 1;
			} else if (size=='M') {
				jerseysize = 2;
			} else if (size=='L') {
				jerseysize = 3;
			}
			
			if (jerseys[number]!=0 && jerseysize<=jerseys[number]) {
				count++;
				jerseys[number] = 0;
			}

		}
		System.out.println(count);
	}
}
