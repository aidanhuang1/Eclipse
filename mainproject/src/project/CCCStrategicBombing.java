package project;
import java.util.*;
import java.io.*;
public class CCCStrategicBombing {

	public static ArrayList<Integer> find(int n, ArrayList<Integer>[] adj) {
		int id = 0;
		int[] low = new int[n]; 
		int[] ids = new int[n]; 
		boolean[] visited = new boolean[n+1];

		ArrayList<Integer> bridges = new ArrayList<>();

		for (int i = 65; i < n; i++) {
			if (!visited[i]) {
				DFS(i, -1, bridges, low, ids, id, adj, visited);
			}
		}
		return bridges;
	}

	private static void DFS(int current, int parent, List<Integer> bridges, int[] low, int[] ids, int id, ArrayList<Integer>[] adj, boolean[] visited) {
		visited[current] = true;
		low[current] = ids[current] = ++id;

		for (int to: adj[current]) {
			if (to == parent) {
				continue;
			}
			if (!visited[to]) {
				DFS(to, current, bridges, low, ids, id, adj, visited);
				low[current] = Math.min(low[current], low[to]);
				if (ids[current] < low[to]) {
					bridges.add(current);
					bridges.add(to);
				}
			} else {
				low[current] = Math.min(low[current], ids[to]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 91;
		ArrayList<Integer>[] adj = new ArrayList[n];
		for (int i=0; i<adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		while (true) {
			String input = sc.next();
			String[] road = input.split("");
			if (road[0].equals("*") && road[1].equals("*")) {
				break;
			}
			adj[(int)road[0].charAt(0)].add((int)road[1].charAt(0));
			adj[(int)road[1].charAt(0)].add((int)road[0].charAt(0));
		}
		ArrayList<Integer> temp = find(n, adj);
		int size = temp.size();
		for (int i=0; i<size/2; i++) {
			int temp1 = temp.remove(0);
			int temp2 = temp.remove(0);
			System.out.println((char)temp1+""+(char)temp2);
		}
		System.out.println("There are "+size/2+" disconnecting roads.");
	}


}
