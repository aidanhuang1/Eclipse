package main;
import java.util.Scanner;
public class DMOJCompositebag {

	public static boolean prime(int a) {
		if (a <= 1) 
			return false; 

		
		for (int i = 2; i < a; i++) 
			if (a % i == 0) 
				return false; 

		return true; 

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(!(prime(a))) {
				count++;
			}
		}
		System.out.println(count);

	}

}
