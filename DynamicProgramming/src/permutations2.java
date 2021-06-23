import java.util.*;
import java.io.*;
public class permutations2 {
	
	/*
	 * A permutation is a reordering of a list of elements.
	 * Permutations are all possible set of numbers, letters, or other values that can be arranged in
	 * different orders
	 * 
	 * Note: C / C++ has a built-in permutations method that Java doesn't have :(
	 * 
	 * This is the permutation method with letters
	 * 
	 *This does not create unique values, maybe find a way to do so?
	 */
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Character> list = new ArrayList<>();
	static int n;
	static int[] count;
	static int[] current;
	static void search() {
		if (list.size()==n) {
			System.out.println(list);
			return;
		} else {
			for (int i=0; i<n; i++) {
				
				if (current[i] >= count[i]) continue;
				current[i]++;	
				list.add(Character.valueOf((char) (i+'a')));
				search();
				current[i]--;
				list.remove(0);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		n = a.length();
		count = new int[26];
		current = new int[26];
		for (int i=0; i<n; i++) {
			count[a.charAt(i) - 'a']++;
		}
		
		search();
	}
}
