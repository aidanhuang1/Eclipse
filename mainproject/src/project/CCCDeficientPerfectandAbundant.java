package project;
import java.util.*;
import java.io.*;
public class CCCDeficientPerfectandAbundant {
	static ArrayList<Integer> divisors = new ArrayList<Integer>();
	public static void finddivisors(int n) {
		divisors.clear();
		for (int i=1; i<n; i++) {
			if (n%i==0)
				divisors.add(i);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			int integer = Integer.parseInt(br.readLine()), sum = 0;
			finddivisors(integer);
			for (int j=0; j<divisors.size(); j++) {
				sum += divisors.get(j);
			}
			if (sum==integer) 
				System.out.println(integer+" is a perfect number.");
			else if (sum>integer)
				System.out.println(integer+" is an abundant number.");
			else
				System.out.println(integer+" is a deficient number.");
		}
	}
}
