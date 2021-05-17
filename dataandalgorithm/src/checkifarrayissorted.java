import java.util.*;
import java.io.*;
public class checkifarrayissorted {
	
	public static boolean arraysortedornot(int[] arr, int n) {
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,5};
		System.out.println(arraysortedornot(arr, 5));
	}

}
