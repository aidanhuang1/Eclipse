
import java.util.*;
import java.io.*;

public class HashMap {
	
	//HashMaps have a (key, value)


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		// put (key, value)
		//we use the key to retrieve the value
		map.put(1, 5); // [(1, 5)]
		map.put(3, 14); // [(1, 5); (3, 14)]
		map.put(2, 7); // [(1, 5); (2, 7); (3, 14)]
		map.remove(2); // [(1, 5); (3, 14)]
		System.out.println(map.get(1)); // 5
		System.out.println(map.containsKey(7)); // false
		System.out.println(map.containsKey(1)); // true
		
		//Iterating over maps, use a for loop over the keys to retrieve the values
		for (int k : map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}
		
		
//		Inserting / Deleting Keys While Iterating
//		While you are free to change the values in a map when iterating over it (as demonstrated above), be careful about inserting and deleting keys while iterating.

//		Modifying a Collection (Set, Map, etc.) in the middle of a for-each loop is unlikely to work, as it will probably cause a ConcurrentModificationException. See the following snippet for an example:
//		
//		void iterateRemoveBad() {
//			Set<Integer> s = new TreeSet<>();
//			// s starts as {0, 1, 2}
//			s.add(0); s.add(1); s.add(2);
//			for (Integer a : s) {
//				s.remove(a); // ConcurrentModificationException thrown!!
//			}
//		}
		
		
		/*
		 * a work around is to use iterator and remove method to remove elements while looping over them
		 * HOWEVER, iterator is not commonly used, so so the best option (in most cases) if you want 
		 * to remove/insert mutiple elements at once is to use your Container's .addAll(c) or .removeAll(c) methods.
		 */
		
			Set<Integer> s = new TreeSet<>();
			// s starts as {0, 1, 2}
			s.add(0); s.add(1); s.add(2);

			Set<Integer> toRemove = new TreeSet<>();
			for (Integer a : s) {
				if (a == 0 || a == 2) {
					toRemove.add(a);
				}
			}

			s.removeAll(toRemove);

			// s ends as {1}
			System.out.println("ENTRIES:");
			for (Integer a : s) {
				System.out.println(a);
			}	
			
		/*
		 * Here, as we iterate through the set, we are adding to the remove set all the element that we want to remove from set s
		 * and once we are finished iterating, we then use .removeAll to remove from set s the elements that we kept in toRemove
		 */
	
	}


}


