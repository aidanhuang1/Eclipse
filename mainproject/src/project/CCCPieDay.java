package project;
import java.util.*;
import java.io.*;
public class CCCPieDay {
	public static int count = 0;
	
	public static int pie(int n, int k, int[] peoplepie) { //n is pieces of pie, k is people lined up
		if ((n+k)%2==0) { //even
			if (peoplepie[0]==peoplepie[k-1])
				return count;
		} else if ((n+k)%2!=0) { //odd
			if (peoplepie[0]==peoplepie[k-1]+1) 
				return count;
		} else {
//			for (int i=k-1; i>0; i--) { Look for a way to go from end to beginning in the array
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		if (n==k) {
			System.out.println(1);
		} else if (k==1) {
			System.out.println(1);
		} else {
			int[] peoplepie = new int[k];
			for (int i=0; i<k-1; i++) {
				peoplepie[i] = 1;
			}
			peoplepie[k-1] = n-k+1;
			System.out.println(pie(n,k,peoplepie));
		}

	}

}
