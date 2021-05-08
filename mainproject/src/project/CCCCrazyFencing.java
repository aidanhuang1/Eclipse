package project;
import java.util.*;
public class CCCCrazyFencing {
	public static double totalarea = 0;
	
	public static void area(int l1, int l2, int w) {
		totalarea += ((l1+l2)/2.0)*w;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] heights = new int[n+1];
		for (int i=0; i<n+1; i++) {
			heights[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			area(heights[i], heights[i+1], sc.nextInt());
		}
		System.out.println((int)totalarea);
	}

}
	