package project;
import java.util.*;
import java.io.*;
public class CCCChooseyourownpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer>[] paths = new ArrayList[N+1];
		for (int i=1; i<paths.length; i++) {
			paths[i] = new ArrayList<Integer>();
		}

		for (int i=1; i<=N; i++) {
			int M = sc.nextInt();
			if (M!=0) {
				for (int j=0; j<M; j++) {
					paths[i].add(sc.nextInt());
				}
			} else {
				paths[i].add(0);
			}
		}
		int find_shortest_length = 0;
		boolean finished = false;
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[N+1];
		queue.add(1);
		int pages_count = 0;
		int shortest_length = 0;
		while (!queue.isEmpty()) {
			pages_count++;
			find_shortest_length++;
			int temp = queue.poll();
			if (pages_count==N) {
				break;
			}
			for (int i: paths[temp]) {
				if (!visited[i]) {
					if (i==0 && shortest_length==0) {
						shortest_length = find_shortest_length;
					}
					queue.add(i);
					visited[i] = true;
				}

			}
		}
		if (pages_count==N) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		System.out.println(shortest_length);
	}
}