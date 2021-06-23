import java.util.*;
import java.io.*;
public class primefactorization {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	/* 
	 * This algorithm works by taking in a number that we want to find prime factors for
	 */
	
	static ArrayList<Integer> factor(int n) {
		ArrayList<Integer> factors = new ArrayList<>();
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factor(10));
	}
}
