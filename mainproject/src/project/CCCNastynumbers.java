package project;
import java.util.*;
public class CCCNastynumbers {

	public static void Nastyornot(int n) {
		int i = 1, count = 0;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		while (i <= n) {
			if(n % i == 0) 
				factors.add(i);
			i++;
			count++;
		}

		System.out.println(factors);
		for (int k=0; k<factors.size(); k++) {
			for (int j=0; j<factors.size(); j++) {
//				if (factors.get(k))
				System.out.println(n+" is nasty");
//			} else {
				System.out.println(n+" is not nasty");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int integer = sc.nextInt();
			Nastyornot(integer);
		}

	}

}
