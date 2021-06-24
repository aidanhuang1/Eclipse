package project;
import java.util.*;
import java.io.*;
public class CSESAppleDivision {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] weights;
	static int N;
	
	/*
	 * We are finding the smallest difference by putting apples into two groups
	 * Recursion helps us looks through all subsets of groups, and finding the smallest difference, as denoted by Math.min
	 * The Math.min will store only the smallest value (difference)
	 */

	static int solve(int i, int s1, int s2) {
		System.out.println(s1+"   "+s2+"   "+i);
		if (i==N) { //if we have finished looking for subsets
			return Math.abs(s1-s2);
		}
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
		System.out.println(solve(0, 0, 0)); //we start off at index 0, with groups of sizes 0 (s1, s2)
	}
}