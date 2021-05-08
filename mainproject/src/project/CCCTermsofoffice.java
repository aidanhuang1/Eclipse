package project;
import java.util.*;
import java.io.*;
public class CCCTermsofoffice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine()), year = x;
		while (year<=y) {
			System.out.println("All positions change in year "+year);
			year+=60;
		}

	}

}
