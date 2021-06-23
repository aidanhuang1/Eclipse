import java.util.*;
import java.io.*;
public class countingdivisors {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	/*
	 * For example, 
	 * input:
	 * 1
	 * 10
	 * 
	 * would give us 4
	 * because 10 has divisors {1, 2, 5, 10}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int queryNum = sc.nextInt();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int q = 0; q < queryNum; q++) {
			int n = sc.nextInt();
			int divisors = 0;
			for (int i = 1; i * i <= n; i++) {
				if (n % i == 0) {
					divisors += i * i == n ? 1 : 2;
				}
			}
			ans.add(divisors);
		}
		System.out.print(ans);

	}
}
