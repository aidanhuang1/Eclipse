import java.util.*;
import java.io.*;
public class PrimsSpanningTree {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	// Computes the minimum spanning tree and minimum spanning tree cost.
	  private void solve() {
	    if (solved) return;
	    solved = true;

	    int m = n - 1, edgeCount = 0;
	    pq = new PriorityQueue<>();
	    visited = new boolean[n];
	    mstEdges = new Edge[m];

	    // Add initial set of edges to the priority queue starting at node 0.
	    addEdges(0);

	    // Loop while the MST is not complete.
	    while (!pq.isEmpty() && edgeCount != m) {
	      Edge edge = pq.poll();
	      int nodeIndex = edge.to;

	      // Skip any edge pointing to an already visited node.
	      if (visited[nodeIndex]) continue;

	      mstEdges[edgeCount++] = edge;
	      minCostSum += edge.cost;

	      addEdges(nodeIndex);
	    }

	    // Check if MST spans entire graph.
	    mstExists = (edgeCount == m);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	}
}
