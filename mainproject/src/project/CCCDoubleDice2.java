package project;
import java.util.*;

public class CCCDoubleDice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int David = 100, Antonio = 100;
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			if (a>b) {
				David -= a;
			} else if (a<b) {
				Antonio -= b;
			}
		}
		System.out.printf("%d%n%d",Antonio,David);

	}

}
