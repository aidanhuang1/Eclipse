import java.util.*;
import java.io.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		boolean [][] map = new boolean [V][V];
		boolean[] isEnding = new boolean[V];
		for (int i=0; i<V; i++) {
			int count = sc.nextInt();
			if (count==0) {
				isEnding[i] = true;
			}
			for (int j=0; j<count; j++) {
				int nextPage = sc.nextInt()-1;
				map[i][nextPage] = true;
			}
		}
		

		int[] step = new int [V];
		Arrays.fill(step, Integer.MAX_VALUE);
		step[0] = 1;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(0);

		while(!queue.isEmpty()) {
			int cur = queue.poll();

			for (int col=0; col<V; col++) {
				if (map[cur][col]==true && step[col]>step[cur]+1) {

					queue.add(col);
					step[col] = step[cur]+1;
				}
			}
		}

		int min = Integer.MAX_VALUE;
		boolean reached = true;
		for (int i=0; i<V; i++) {
			if (step[i]==Integer.MAX_VALUE) {
				reached = false;
			}	
			if (isEnding[i]==true && min>step[i]) {
				min = step[i];
			}
		}
		if (reached == true) { 
			System.out.println("Y");
		} else {
			System.out.println("N");

		}
		System.out.println(min);




	}



}