package project;
import java.util.*;
import java.io.*;



public class CCCTruckingTroubles {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static boolean solved;
	
	static class Edge implements Comparable<Edge> { //what does this implement thing do?
		public int to;
		public int weight;
		public Edge(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	private static boolean Prims(int n, ArrayList<Edge>[] list) {
		int minCostSum = 0;
		if (solved) {
			return true;
		}
		solved = true;

		int m = n - 1; //number of edges in MST to be expected
		int edgeCount = 0; //number of edges we current have in the MST
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		
		
		boolean[] visited = new boolean[n];
		Edge[] mstEdges = new Edge[m]; 

		visited[0] = true;
		for (Edge e : list[0]) {
			if (!visited[e.to]) {
				pq.add(e);
			}
		}
		for (Edge i: pq) {
			System.out.println(i.weight);
		}
		System.out.println();
		System.out.println(pq.peek().weight);

		while (!pq.isEmpty() && edgeCount != m) {
			
			Edge edge = pq.poll();
			int nodeIndex = edge.to;

			if (visited[nodeIndex]) {
				continue;
			}

			mstEdges[edgeCount++] = edge;
			minCostSum += edge.weight;

			visited[nodeIndex] = true;
			for (Edge e : list[nodeIndex]) {
				if (!visited[e.to]) {
					pq.add(e);
				}
			}
		}

		if (edgeCount == m) {
			System.out.println();
			for (Edge i: mstEdges) {
				System.out.println(i.weight);
			}
			return true;
		}
		return false;
	}




	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = readInt(), r = readInt(), d = readInt(); //c = # of cities, r = # of roads, d = # of dcities
		ArrayList<Edge>[] list = new ArrayList[c];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Edge>();
		}

		for (int i=0; i<r; i++) {
			int x = readInt()-1, y = readInt()-1, w = readInt();
			list[x].add(new Edge(y, w));
			list[y].add(new Edge(x, w));
		}

		
		System.out.println(Prims(c, list));



//		int dw = 0;
//		for (ArrayList<Edge> i: list) {
//			System.out.print(dw++ +" --> ");
//			for (int j=0; j<i.size(); j++) {
//				System.out.print(i.get(j).weight+" ");
//			}
//			System.out.println();
//		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
