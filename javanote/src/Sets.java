import java.util.*;
import java.io.*;
public class Sets {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<>();
		set.add(1); // [1]
		set.add(4); // [1, 4]
		set.add(2); // [1, 2, 4]
		set.add(1); // [1, 2, 4]
		// the add method did nothing because 1 was already in the set
		System.out.println(set.contains(1)); // true
		set.remove(1); // [2, 4]
		System.out.println(set.contains(5)); // false
		set.remove(0); // [2, 4]
		// if the element to be removed does not exist, nothing happens

		for (int element : set) {
			System.out.println(element);
		}
		// You can iterate through an set in sorted order
	}
}
