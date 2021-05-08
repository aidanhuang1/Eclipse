import java.util.*;
public class BinarySearch {

	public static boolean searchrecursive(int array[], int l, int r, int x) { //recursive
		if (l<=r) {
			int mid = (l+r)/2; //gets the middle
			if (array[mid]==x) {
				return true;
			} else if (x<array[mid]) { // focus on the left side
				return searchrecursive(array, l, mid-1, x);
			} else if (x>array[mid]) { //focus on the right side
				return searchrecursive(array, mid+1, r, x);
			}
		}
		return false;
	}

	public static boolean searchiterative(int array[], int x) {
		int left = 0;
		int right = array.length-1;
		while (left<=right) {
			int mid = (left+right)/2; //gets the middle
			if (array[mid]==x) {
				return true;
			} else if (x<array[mid]) { // focus on the left side
				right = mid - 1;
			} else if (x>array[mid]) { //focus on the right side
				left = mid + 1;
			}

		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 2, 3, 4, 5, 21, 22, 32, 41, 123};
		System.out.println(searchiterative(array, 6));

	}

}
