import java.util.*;
import java.io.*;
public class subsets {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] weights;
	static int N;

	//Example solution for CSES Apple Division using subsets
	/*
	 * Below is just an example that depicts how recursive subsets work in the form of a binary tree 
	 *
search(0); 
-> search(1); // with 0 in
->-> search(2); // with 0 in AND 1 in
->->-> search (3); // with 0 in AND 1 in AND 2 in. terminates with (0,1,2)
->->-> search (3); // with 0 in AND 1 in AND 2 not in. terminates with (0,1)
->-> search(2); // with 0 in AND 1 not in
->->-> search (3); // with 0 in AND 1 not in AND 2 in. terminates with  (0,2)
->->-> search (3); // with 0 in AND 1 not in AND 2 not in. terminates with  (0)
-> search(1); // with 0 not in
->-> search(2); // with 0 not in AND 1 in
->->-> search (3); // with 0 not in AND 1 in AND 2 in. terminates with  (1,2)
->->-> search (3); // with 0 not in AND 1 in AND 2 not in. terminates with  (1)
->-> search(2); // with 0 not in AND 1 not in
->->-> search (3); // with 0 not in AND 1 not in AND 2 in. terminates with  (2)
->->-> search (3); // with 0 not in AND 1 not in AND 2 not in. terminates with  ()
	 */

	static int solve(int i, int s1, int s2) {
		System.out.println(s1+"   "+s2);
		if (i==N) { //if we have finished looking for subsets
			return Math.abs(s1-s2);
		}
		//Math.min gives us the smallest difference between the two groups (which is the correct method 
		//in terms of the problem)
		//Math.max would give us the largest difference between the two groups
		return Math.min(solve(i+1, s1+weights[i], s2), solve(i+1, s1, s2+weights[i]));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		weights = new int[N];
		for (int i=0; i<N; i++) {
			weights[i] = sc.nextInt();
		}
		System.out.println(solve(0, 0, 0)); //we start off at index 0, with groups of sizes 0
	}
}
