
import java.util.Collections;
import java.util.HashMap;

public class HashMaps {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap <Integer, String>();
		map.put(9, "ok");
		map.put(10, "no");
		System.out.println(map.get(9)); /* we can use the key to find the integer value that is connected to the key, 
		we can use this in CCCItsColdHere after sorting the integer values, find the city that it is connected to */
		
		// we can swap (Integer, String) or (String, Integer) but you can only use the key to find the other value
		
	}


}


