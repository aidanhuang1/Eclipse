package project;
import java.util.Scanner;

public class CCCFrom1987to2013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		while (true) {
			boolean duplicate = false;
			A++;
			for (int i=0; i<Integer.toString(A).length()-1; i++) {
				char digit = Integer.toString(A).charAt(i);
				System.out.println(A);
				for (int j=0; j<Integer.toString(A).length()-1; j++) {
					if (digit==(Integer.toString(A).charAt(i)) && i!=j) {
						duplicate = true;
					}
				}
			}
			if (!duplicate) {
				System.out.println(A);
				break;
			}
		}
	}

}
