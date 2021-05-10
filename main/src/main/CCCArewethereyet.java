package main;
import java.util.Scanner;
public class CCCArewethereyet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] cities = new int[5];
		cities[0] = 0;
		for (int i=1; i<5; i++) {
			cities[i] = sc.nextInt();
		}
		for (int i=0; i<cities.length; i++) {
			if (i!=0) {
				cities[i] += cities[i - 1];
			}
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(Math.abs(cities[i]-cities[j])+" ");
			}
			System.out.println();
		}
	}

}
