package project;
import java.util.*;
public class CCCHightidelowtide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] T = new int [N];
		for (int i=0; i<N; i++) {
			T[i] = sc.nextInt();
		}
		Arrays.sort(T);
		int[] newarray = new int[T.length];
		int index = (T.length/2);
		if (T.length%2==0) {
			index--;
		}
		boolean low = true;
		int lowcount = 0;
		int highcount = 1;
		for (int i=0; i<T.length; i++) {
			if (low) {
				newarray[i] = T[index-lowcount];
				lowcount++;
				low = false;
			} else if (!low) {
				newarray[i] = T[index+highcount];
				highcount++;
				low = true;
			}

		}
		for (int i : newarray) {
			System.out.print(i+" ");
		}
	}

}
