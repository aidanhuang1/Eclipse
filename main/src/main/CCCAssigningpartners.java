package main;
import java.util.*;
public class CCCAssigningpartners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] list1 = new String[n];
		String[] list2 = new String[n];
		for (int i=0; i<n; i++) {
			list1[i] = sc.next();
		}
		for (int i=0; i<n; i++) {
			list2[i] = sc.next();
		}
		boolean pair = false;
		for (int i=0; i<n; i++) {
			pair = false;
			String studenta = list1[i];
			String studentb = list2[i];
			for (int j=0; j<n; j++) {
				if (studenta.equals(list2[j]) && studentb.equals(list1[j]) && i!=j) {
					pair = true;
					break;
				}
			}
			//if pair not found
			if (!pair) {
				System.out.println("bad");
				break;
			}
		}
		if (pair) {
			System.out.println("good");
		}
	}
}
