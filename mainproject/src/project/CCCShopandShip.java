package project;
import java.util.*;
import java.io.*;

public class CCCShopandShip {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Edge>[] list;
	static int[] cost;
	static int N, T;
	
	//NOTE THAT WE CAN START FROM ANY CITY BUT WE MUST END UP AT THE DESTINATION CITY
	//So then after we have found our distances using dijkstra, we iterate through
	//all the cities, keeping track of our totalcost (pencilcost + shippingcost) for the minimum cost
	//
	
	//SOMETHING IS PROBABLY WRONG WITH THE DIJKSTRA METHOD
	
	
	static class Edge implements Comparable<Edge> {
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
	
	static class Road implements Comparator<Edge> {
		@Override
		public int compare(Edge o1, Edge o2) {
			// TODO Auto-generated method stub
			if (o1.weight < o2.weight) {
				return -1;	
			} else if (o1.weight > o2.weight) {
				return 1;
			}
			return 0;
		}
	}

	public static void Dijkstra(int start) {
		boolean[] visited = new boolean[N+1];
		int[] dist = new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>(new Road());
		pq.add(new Edge(start, 0));

		while(!pq.isEmpty()) {
			
			Edge temp = pq.poll(); //current node
			visited[temp.to] = true;
			
			if (dist[temp.to] < temp.weight) {
				continue;	
			}
			
			for (Edge i: list[temp.to]) {
				if (!visited[i.to]) {
					
					int newDist = dist[temp.to] + i.weight; //temp.to = current, i.to = next
					if (newDist < dist[i.to]) {
						dist[i.to] = newDist;
						pq.add(new Edge(i.to, newDist));
					}
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i=0; i<dist.length; i++) {
			int totalcost = cost[i]+dist[i];
			System.out.println(dist[i]);
			if (min > totalcost) {
				min = totalcost;
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = readInt();
		T = readInt();
		list = new ArrayList[N+1];
		for (int i=0; i<list.length; i++) {	
			list[i] = new ArrayList<Edge>();
		}
		for (int i=0; i<T; i++) {
			int x = readInt()-1, y = readInt()-1, weight = readInt();
			list[x].add(new Edge(y, weight));
			list[y].add(new Edge(x, weight));
			
		}
		int K = readInt();
		cost = new int[N+1];
		for (int i=0; i<K; i++) {
			cost[readInt()-1] = readInt();
		}
		
		int destination = readInt()-1;
		Dijkstra(destination);
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
