package project;
import java.util.*;
import java.io.*;
public class CCC2021J3 {
	public static String lastturn = "";
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n==99999) {
				break;
			}	
			String number = String.valueOf(n);
			String[] newnumber = number.split("");
			int sum = Integer.valueOf(newnumber[0]);
			if (newnumber.length==5) {
				sum+=Integer.valueOf(newnumber[1]);
			}

			String last3 = newnumber[newnumber.length-3]+newnumber[newnumber.length-2]+newnumber[newnumber.length-1];
			if (newnumber.length<=3) {
				System.out.println(lastturn+" "+last3);
			}
			else if (sum%2==0 && sum!=0) { //even 
				System.out.println("right "+last3); // 09123
				lastturn = "right";
			} else if (sum%2!=0) {
				System.out.println("left "+last3);
				lastturn = "left";
			} 
		}
	}

}
