import java.util.*;
import java.io.*;
public class MonkandRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int shift = K%N;
			for (int j=0; j<N; j++) {
				list.add(sc.nextInt());
			}
			for (int j=0; j<shift; j++) {
				int cycle = list.get(N-1);
				list.remove(N-1);
				list.add(0, cycle);
			}
		}
		for (int i : list) {
			System.out.print(i+" ");
		}

	}
}
