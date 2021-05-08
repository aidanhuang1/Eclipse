package project;
import java.util.Scanner;
public class CCCWhohasseenthewind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int t=0;
		while (t!=M) {
			t++;
			double altitude = (-6*Math.pow(t, 4) + H*Math.pow(t, 3) + 2*Math.pow(t, 2) + t);
			
			if (altitude<=0) {
				System.out.println("The balloon first touches ground at hour:"+"\n"+t);
				break;
			}
			
			if (t==M) {
				System.out.println("The balloon does not touch ground in the given time.");
				break;
			}

		}

	}

}
