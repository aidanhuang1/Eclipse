package main;
import java.util.Scanner;
public class DMOJTriplefatladies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int b = 0;
			long a = sc.nextLong();
			while (true) {
				if (Math.pow(a, 3)%1000==888) {
					break;
				} else {
					a++;
				}
			}
			System.out.println(a);
		}
	}

}
