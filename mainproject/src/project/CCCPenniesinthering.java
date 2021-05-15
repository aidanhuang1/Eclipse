package project;
import java.util.*;
import java.io.*;
public class CCCPenniesinthering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (true) {	
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			int count = 0;
			for (int i=0; i<n-1; i++) {
				if ((i*i)+(i*i)<=(n*n)) {
					count++;
				}
			}
			System.out.println((count*4)+(n*4)+1);
			
		}
	}

}
