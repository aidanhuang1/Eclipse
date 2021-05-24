package project;
import java.util.*;
import java.io.*;

public class DMOJcanshahirevengetthere {
	static class Graph {
		private static int V;
		private static LinkedList<Integer> adj[];

		public Graph(int n) {
			V = n;
			adj = new LinkedList[n];
			for (int i=1; i<n; i++) {
				adj[i] = new LinkedList();
			}
		}
		public void addEdge(int source, int destination) {
			adj[source].add(destination);
			adj[destination].add(source);
		}
		

		public static boolean BFS(int A, int B) {
			Queue<Integer> queue = new LinkedList<>();
			ArrayList<Integer> list = new ArrayList<>();
			boolean[] visited = new boolean[V];
			queue.add(A);
			while(!queue.isEmpty()) {
				int temp = queue.poll();
				list.add(temp);
				if (temp==B) {
					return true;
				}
				Iterator<Integer> i = adj[temp].listIterator();
				while (i.hasNext()) {
					int n = i.next();
					if (!visited[n]) {
						visited[n] = true;
						queue.add(n);
					}
				}
			}
			return false;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();

		Graph g = new Graph(N+1);

		for (int i=0; i<M; i++) {
			g.addEdge(sc.nextInt(), sc.nextInt());
		}

		if (Graph.BFS(A, B)) {
			System.out.println("GO SHAHIR!");
		} else {
			System.out.println("NO SHAHIR!");
		}
	}

}
