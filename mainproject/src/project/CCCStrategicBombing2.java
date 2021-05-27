package project;
import java.util.*;
import java.io.*;
public class CCCStrategicBombing2 {
	
	private int n, id;
	private int[] low, ids;
	private boolean solved; 
	private boolean[] visited;
	private List<List<Integer>> graph;
	private List<Integer> bridges;

	public CCCStrategicBombing2(List<List<Integer>> graph, int n) {
		if (graph == null || n <= 0 || graph.size() != n) {
			throw new IllegalArgumentException();
		}
		this.graph = graph;
		this.n = n;
	}

	public static List<List<Integer>> createGraph(int n) {
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}
		return graph;
	}

	public static void addEdge(List<List<Integer>> graph, int from, int to) {
		graph.get(from).add(to);
		graph.get(to).add(from);
	}

	public List<Integer> findBridges() {
		if (solved) {
			return bridges;
		}

		id = 0;
		low = new int[n]; 
		ids = new int[n]; 
		visited = new boolean[n];

		bridges = new ArrayList<>();

		for (int i = 65; i < n; i++) {
			if (!visited[i]) {
				dfs(i, -1, bridges);
			}
		}

		solved = true;
		return bridges;
	}

	private void dfs(int at, int parent, List<Integer> bridges) {

		visited[at] = true;
		low[at] = ids[at] = ++id;

		for (int to : graph.get(at)) {
			if (to == parent) continue;
			if (!visited[to]) {
				dfs(to, at, bridges);
				low[at] = Math.min(low[at], low[to]);
				if (ids[at] < low[to]) {
					bridges.add(at); //from
					bridges.add(to); //to
				}
			} else {
				low[at] = Math.min(low[at], ids[to]);
			}
		}
	}

	/* Example usage: */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 91;
		List<List<Integer>> graph = createGraph(n);
		
		while (true) {
			String input = sc.next();
			if (input.equals("**")) {
				break;
			}
			String[] road = input.split("");
			addEdge(graph, (int)road[0].charAt(0), (int)road[1].charAt(0));
		}
		

		CCCStrategicBombing2 solver = new CCCStrategicBombing2(graph, n);
		List<Integer> bridges = solver.findBridges();


		for (int i = 0; i < bridges.size() / 2; i++) {
			int node1 = bridges.get(2 * i);
			int node2 = bridges.get(2 * i + 1);
			
			System.out.println((char)node1+""+(char)node2);
		}
		System.out.println("There are "+bridges.size()/2+" disconnecting roads.");
	}
}