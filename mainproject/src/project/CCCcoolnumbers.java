package project;
import java.io.*;
public class CCCcoolnumbers {

	public static boolean whole(double i) {
		if (i%1==0) return true;
		else return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), count = 0;
		for (int i=a; i<=b; i++) {
			if (whole(Math.pow(i, 1.0/6.0))) {
				count++;
			}
		}
		System.out.println(count);

	}

}
