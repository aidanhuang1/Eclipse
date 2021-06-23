import java.util.*;
import java.io.*;
public class permutations {
	
	/*
	 * A permutation is a reordering of a list of elements.
	 * Permutations are all possible set of numbers, letters, or other values that can be arranged in
	 * different orders
	 * 
	 * Note: C / C++ has a built-in permutations method that Java doesn't have :(
	 * 
	 * This is the permutation method with numbers
	 * 
	 * This does not create unique values, maybe find a way to do so?
	 */
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Integer> list = new ArrayList<>();
	static int n;
	static boolean[] chosen;
	static void search() {
		if (list.size()==n) {
			System.out.println(list);
			return;
		} else {
			for (int i=0; i<n; i++) {
				if (chosen[i]) continue;
				chosen[i] = true;
				list.add(i);
				search();
				chosen[i] = false;
				list.remove(0);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = 3;
		chosen = new boolean[n];
		search();
	}
}
