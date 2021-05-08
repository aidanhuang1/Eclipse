package main;
import java.io.*;
public class CCChiddenpalindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int largest = 0;
		for (int i=0; i<a.length(); i++) {
			String newstring = "";
			for (int j=i; j<a.length(); j++) {
				newstring+=a.charAt(j);
				String reverse = "";
				for (int k=newstring.length()-1; k>=0; k--) {
					reverse+=newstring.charAt(k);
				}
				if (newstring.equals(reverse)) {
					largest = Math.max(largest, newstring.length());
				}
			}

		}
		System.out.println(largest);
	}
}
