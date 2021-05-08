package CanStem;
import java.util.*;

public class mergesort {

	//mergeSort
	static int n = 0;
	static ArrayList<Integer> sorted =  new ArrayList<Integer>();
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> l) { //use recursion
		
		if (sorted.size()==(l.size())) { //if it is complete
			return sorted;
		} else { // if not complete
			if (sorted.size()==0) { // if the new arraylist is empty
				sorted.add(l.get(0));
			} else {
				for (int i=0; i<sorted.size(); i++) {
					if (l.get(n+1)>=sorted.get(i)) {
						sorted.add(i, l.get(n+1)); //adds the next number to the sorted list
						n++;
						break;
					} else {
						sorted.add(0, l.get(n+1));
						n++;
						break;
					}
				}
			}
		}
		return mergeSort(l);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//merge sort
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l.add(19);
		l.add(78);
		l.add(36);
		l1.add(40);
		l1.add(90);
		l.addAll(l1);
		mergeSort(l);


	}

}
