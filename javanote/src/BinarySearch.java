import java.util.*;
import java.io.*;
public class BinarySearch {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//The original Binary Search method might overflow
	//This is a better solution that utilizes L+(R-L)/2
	
	public static int BS(int n, int target, int[] array) {
        int left = 1, right = n-1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid]==target) {
            	return mid;
            } else if (array[mid] < target) {
            	left = mid+1;
            } else if (array[mid] > target) {
            	right = mid-1;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println(BS(array.length, 6, array));

	}
}
