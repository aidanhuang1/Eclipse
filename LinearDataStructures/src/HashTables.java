import java.util.*;
import java.io.*;
public class HashTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>(); 
		ht.put(123, 456);
		ht.put(12, 2345);
		ht.put(15, 5643); 
		ht.put(3, 321);
		System.out.println(ht.get(3));
		ht.remove(3);
		System.out.println(ht.get(3));
		
		
		
	}

}
