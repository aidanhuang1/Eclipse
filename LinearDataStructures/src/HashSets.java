import java.util.*;
import java.io.*;
public class HashSets {
	
	//HashSets are like HashMaps but without values

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> lightBulbs = new HashSet<>();

		lightBulbs.add("incandescent");
		lightBulbs.add("compact fluorescent");
		lightBulbs.add("LED");

		System.out.println(lightBulbs.contains("LED"));  // true
		System.out.println(lightBulbs.contains("halogen"));  // false
		
		
	}

}
