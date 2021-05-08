package project;
import java.util.*;
import java.io.*;
public class CCC2021J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //number of bids
		int highestbid = 0;
		String highestbidder = "";
		for (int i=0; i<N; i++) {
			String name = sc.next();
			int bid = sc.nextInt();
			if (bid>highestbid) {
				highestbid = bid;
				highestbidder = name;
			}
		}
		System.out.println(highestbidder);
	}

}
