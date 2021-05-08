import java.util.*;
public class removeduplicatesfromunsortedarray {

	public static LinkedHashSet<Integer> remove(int[] array, int x) {

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i=0; i<array.length; i++) {
			set.add(array[i]);
		}			
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//use LinkedHashSet because Hashsets cannot have duplicate values
		int[] a = {2, 0, 2, 1, 2, 3};
		System.out.println(remove(a, 2));

	}

}
