import java.util.*;
import java.io.*;
public class BreadthFirstSearch3 { //This is basically BreadthFirstSearch2 but without the Graph class
	
	public static ArrayList<Integer> adj[];
	public static boolean[] visited;
	
	public static boolean BFS(int A, int B) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(A);
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			if (B==temp) {
				return true;
			}
			for (int i: adj[temp]) {
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
 		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		adj = new ArrayList[N+1];
		visited = new boolean[N+1];
		for (int i=0; i<N+1; i++) {
			adj[i] = new ArrayList<>();
		}
		for (int i=0; i<M; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			adj[source].add(destination);
			adj[destination].add(source);
		}
		if (BFS(A, B)) {
			System.out.println("GO SHAHIR!");
		} else {
			System.out.println("NO SHAHIR!");
		}
	}

}
