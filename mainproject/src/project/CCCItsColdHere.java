package project;
import java.util.*;
import java.io.*;
public class CCCItsColdHere {
	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		while (true) {
			String city = sc.next();
			int temp = sc.nextInt();
			map.put(temp, city);
			if (city.equals("Waterloo")) {
				break;
			}
		}
		ArrayList<Integer> temperature = new ArrayList<Integer>(map.keySet());
		Collections.sort(temperature);
		System.out.println(map.get(temperature.get(0)));
	}

}
