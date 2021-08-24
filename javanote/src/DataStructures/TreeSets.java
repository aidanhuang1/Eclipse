package DataStructures;
import java.util.*;
import java.io.*;
public class TreeSets {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//TreeSets are like hashsets but the elements are sorted

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new TreeSet<Integer>();
		set.add(1); set.add(3); set.add(0); set.add(-2);
		Iterator it = set.iterator();
		while(it.hasNext()){
			Integer i = (Integer)it.next();
			System.out.print(i + " "); // returns -2 0 1 3
		}
		
		
		//Treesets also allow for additional operations:
//		first(): returns the lowest element in the set
//		last(): returns the greatest element in the set
//		lower(E v): returns the greatest element strictly less than v
//		floor(E v): returns the greatest element less than or equal to v
//		higher(E v): returns the least element strictly greater than v
//		ceiling(E v): returns the least element greater than or equal to v
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(1); // [1]
		set2.add(14); // [1, 14]
		set2.add(9); // [1, 9, 14]
		set2.add(2); // [1, 2, 9, 14]
		System.out.println(set2.higher(7)); // 9
		System.out.println(set2.higher(9)); // 14
		System.out.println(set2.lower(5)); // 2
		System.out.println(set2.first()); // 1
		System.out.println(set2.last()); // 14
		set2.remove(set2.higher(6)); // [1, 2, 14]
		System.out.println(set2.higher(23)); // ERROR, no such element exists
		
		
		//Ordered Maps
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(3, 5); // [(3, 5)]
		map.put(11, 4); // [(3, 5); (11, 4)]
		map.put(10, 491); // [(3, 5); (10, 491); (11, 4)]
		System.out.println(map.firstKey()); // 3
		System.out.println(map.firstEntry()); // (3, 5)
		System.out.println(map.lastEntry()); // (11, 4)
		System.out.println(map.higherEntry(4)); // (10, 491)
		map.remove(11); // [(3, 5); (10, 491)]
		System.out.println(map.lowerKey(4)); // 3
		System.out.println(map.lowerKey(3)); // ERROR

	}
}
