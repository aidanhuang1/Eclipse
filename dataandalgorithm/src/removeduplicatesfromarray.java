import java.util.*;
import java.io.*;
public class removeduplicatesfromarray {
	
	public static int removeduplicates (int[] A, int N){
		ArrayList<Integer> newarray = new ArrayList<Integer>();
		newarray.add(A[0]);
		for (int i=0; i<A.length-1; i++) {
			if (A[i]!=A[i+1]) {
				newarray.add(A[i+1]);
			}
		}
		for (int i : newarray) {
			System.out.print(i+" ");
		}
		System.out.println();
		return newarray.size();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] A = {1,1,2,3,4,5,5,6,6,6,28,28};
		System.out.println(removeduplicates(A, 7));
	}

}
