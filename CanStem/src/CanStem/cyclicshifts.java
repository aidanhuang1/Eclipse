package CanStem;

import java.util.ArrayList;

public class cyclicshifts {
	ArrayList<String> shiftsarray = new ArrayList<String>();
	public cyclicshifts(String T) {
		shiftsarray.add(T);
		String S = T;
		for (int i=0; i<T.length()-1; i++) {
			S = S.substring(1) + S.charAt(0); 
			shiftsarray.add(S);
		}
	}
	public void checkcyclicshifts(String str, String T) {
		boolean cyclicshift = false;
		for (int i=0; i<T.length(); i++) {
			if (str.contains(T)) {
				cyclicshift = true;
			}
			else if (str.contains(shiftsarray.get(i))) {
				cyclicshift = true;
			}
		}
		if (cyclicshift) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	
	}

}
