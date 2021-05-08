package practice;

public class sort {
	
	//This is an alternative way to sort
	//This example uses Object but you can change it to integer, String, etc...
	//Plus, if you use something other than Object, you wouldn't need to use (Integer) casting.
	
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
}
