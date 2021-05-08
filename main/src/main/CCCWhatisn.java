package main;
import java.util.Scanner;
public class CCCWhatisn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ways = 0;
		int a = sc.nextInt();
		int left = a;
		int right = 0;
		while (!(right>left)) {
			if (left<=5 && right<=5) {
				ways++;
				left--;
				right++;
			} else {
				left--;
				right++;
			}
		}
		System.out.println(ways);
	}
}
