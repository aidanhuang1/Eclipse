package main;
import java.util.*;
public class CCCVoroniVillages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] villages = new int[n];
		for (int i=0; i<n; i++) {
			villages[i] = sc.nextInt();
		}
		Arrays.sort(villages);
		ArrayList<Double> sizes = new ArrayList<Double>();
		double first = 0, second = 0;
		for (int i=0; i<n-2; i++) {
			first = (villages[i+1]-villages[i])/2.0;
			second = (villages[i+2]-villages[i+1])/2.0;
			sizes.add(first+second);
		}
		Collections.sort(sizes);
		System.out.printf("%.1f",sizes.get(0));

	}

}
