import java.util.*;
import java.io.*;
public class MergeKsortedarrays {
	
	public static ArrayList<Integer> mergeKarrays(int[][] arr, int K) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i=0; i<K; i++) {
			for (int j=0; j<arr[i].length; j++) {
				array.add(arr[i][j]);
			}
		}
		Collections.sort(array);
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = {{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}};
		System.out.println(mergeKarrays(arr, 4));
	}

}
