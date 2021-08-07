import java.util.*;
import java.io.*;
public class Iterators {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//In Java, iterators are helpful for looping through sets.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1); set.add(3); set.add(0); set.add(-2);
		Iterator it = set.iterator();
		while(it.hasNext()){
			Integer i = (Integer)it.next();
			System.out.print(i + " "); // returns 0 1 -2 3
		}

	}
}
