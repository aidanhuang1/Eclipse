import java.util.*;
import java.io.*;
public class PeakElement {
	
	public static int peak(int[] arr) {
		if (arr.length==0) {
			return arr[0];
		} else if (arr[0]>arr[1]) {
			return arr[0];
		} else if (arr[arr.length-2]<arr[arr.length-1]) {
			return arr[arr.length-1];
		} else {
			for (int i=1; i<arr.length-1; i++) {
				if (arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
					return arr[i];
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {5, 10, 20, 60, 50};
		System.out.println(peak(arr));
	}

}
