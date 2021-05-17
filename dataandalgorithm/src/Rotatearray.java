import java.util.*;
import java.io.*;
public class Rotatearray {
	
	public static void leftRotate(int[] arr, int n, int d) {
		int[] temp = new int[d%arr.length];
		int[] newarray = new int[n];
		for (int i = 0; i<d%arr.length; i++) {
			temp[i] = arr[i];
		}
		int index = 0;
		for (int i=d%arr.length; i<arr.length; i++) {
			newarray[index] = arr[i];
			index++;
		}
		for (int i=0; i<temp.length; i++) {
			newarray[index] = temp[i];
			index++;
		}
		System.out.println(Arrays.toString(newarray));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		leftRotate(arr, 7, 12);
	}

}
