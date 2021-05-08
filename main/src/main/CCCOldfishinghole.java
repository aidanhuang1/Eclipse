package main;
import java.util.Scanner;
public class CCCOldfishinghole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int troutp = sc.nextInt(), pikep = sc.nextInt(), pickerelp = sc.nextInt(), maxp = sc.nextInt(), count = 0;
		for (int i=0; i<=maxp+1; i++) {
			for (int j=0; j<=maxp+1; j++) {
				for (int k=0; k<=maxp+1; k++) {
					if ((troutp*i)+(pikep*j)+(pickerelp*k)<=maxp && i+j+k>0) {
						count++;
						System.out.println(i + " Brown Trout, " + j + " Northern Pike, " + k + " Yellow Pickerel");
					}
				}
			}
		}
		System.out.println("Number of ways to count fish: "+count);

	}

}
