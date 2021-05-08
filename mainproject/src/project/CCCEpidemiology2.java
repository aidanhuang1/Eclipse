package project;
import java.util.*;
public class CCCEpidemiology2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt(), N = sc.nextInt(), R = sc.nextInt();
		int multiply = N, totalall = N, count = 0;
		while (P>=totalall) {
			multiply *= R;
			totalall+=multiply;
			count++;
		}
		System.out.println(count);
	}

}
