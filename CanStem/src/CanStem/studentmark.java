 package CanStem;
import java.util.*;
public class studentmark {
	public static Object[] sort(Object[] keys) {
		Object[] sorted = new Object[keys.length];
		for (int i=0; i<keys.length; i++) {
			Object min = keys[0];
			for (int j=0; j<keys.length; j++) {
				min = Math.min((Integer) keys[j],(Integer)min);
			}
			sorted[i] = min;
			for(int j=0; j<keys.length; j++) {
				if (keys[j]==min) {
					keys[j] = 1000000;
					break;
				}
			}
		}
		return sorted;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> list = new HashMap<Integer, String>(); 
		while(true) {
			String name = sc.next();
			if (name.equals("enter"))	
				break;
			int grade = sc.nextInt();
			list.put(grade, name);
		}
		sc.close();
		Object[] keys = list.keySet().toArray();
		keys = sort(keys);
		for (int i=0; i<keys.length; i++) {
			System.out.printf("%s %d%n",list.get(keys[i]),keys[i]);
		}
	}
}
