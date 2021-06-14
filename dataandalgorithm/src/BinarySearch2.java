import java.util.*;
import java.io.*;
public class BinarySearch2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 5, 3, 4, 9, 6, 7};
		Arrays.sort(a);
		int b = Arrays.binarySearch(a, 7);
		System.out.println(b);
	}
}
