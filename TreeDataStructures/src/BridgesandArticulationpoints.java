import java.util.ArrayList;
import java.util.List;

//Provided by William Fiset
public class BridgesandArticulationpoints { //Bridges version

	private int n, id;
	private int[] low, ids;
	private boolean solved; 
	private boolean[] visited;
	private List<List<Integer>> graph;
	private List<Integer> bridges;

	public BridgesandArticulationpoints(List<List<Integer>> graph, int n) {
		if (graph == null || n <= 0 || graph.size() != n) {
			throw new IllegalArgumentException();
		}
		this.graph = graph;
		this.n = n;
	}

	// Initialize graph with 'n' nodes.
	public static List<List<Integer>> createGraph(int n) {
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
		return graph;
	}

	// Add undirected edge to graph.
	public static void addEdge(List<List<Integer>> graph, int from, int to) {
		graph.get(from).add(to);
		graph.get(to).add(from);
	}

	// Returns a list of pairs of nodes indicating which nodes form bridges.
	// The returned list is always of even length and indexes (2*i, 2*i+1) form a
	// pair. For example, nodes at indexes (0, 1) are a pair, (2, 3) are another
	// pair, etc...
	public List<Integer> findBridges() {
		if (solved) {
			return bridges;
		}

		id = 0;
		low = new int[n]; // Low link values
		ids = new int[n]; // Nodes ids
		visited = new boolean[n];

		bridges = new ArrayList<>();

		// Finds all bridges in the graph across various connected components.
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				dfs(i, -1, bridges); //-1 because there is no previous node
			}
		}

		solved = true;
		return bridges;
	}

	private void dfs(int at, int parent, List<Integer> bridges) {

		visited[at] = true; //we have visited this node
		id++;
		low[at] = ids[at] = id; //increment as the low value becomes the id of the node

		for (int to: graph.get(at)) { //looking for nodes that we can go to 
			if (to == parent) {
				continue;
			}
			if (!visited[to]) {
				dfs(to, at, bridges); //if a node we can go to has not been visited, we recursively call DFS
				low[at] = Math.min(low[at], low[to]); //if the to node is smaller, then we make our at node the same
				if (ids[at] < low[to]) { //if the current id is smaller than the low-link value of the node we are going to, then we have a bridge
					bridges.add(at);
					bridges.add(to);
				}
			} else { //if we find a node we already went to 
				low[at] = Math.min(low[at], ids[to]); //we make the low-link value equal to our parent node
			}
		}
	}

	/* Example usage: */

	public static void main(String[] args) {

		int n = 9;
		List<List<Integer>> graph = createGraph(n);

		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 2);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		addEdge(graph, 2, 5);
		addEdge(graph, 5, 6);
		addEdge(graph, 6, 7);
		addEdge(graph, 7, 8);
		addEdge(graph, 8, 5);

		BridgesandArticulationpoints solver = new BridgesandArticulationpoints(graph, n);
		List<Integer> bridges = solver.findBridges();

		// Prints:
		// Bridge between nodes: 3 and 4
		// Bridge between nodes: 2 and 3
		// Bridge between nodes: 2 and 5
//		[3, 4, 2, 3, 2, 5]
		for (int i = 0; i < bridges.size() / 2; i++) {
			int node1 = bridges.get(2 * i);
			int node2 = bridges.get(2 * i + 1);
			System.out.printf("Bridge between nodes: %d and %d\n", node1, node2);
		}
	}
}