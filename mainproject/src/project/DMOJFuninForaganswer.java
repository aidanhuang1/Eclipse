package project;
import java.io.*;
import java.util.*;
public class DMOJFuninForaganswer{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static long dist[];
	public static void main(String[]args) throws IOException{
		int n = readInt(), m = readInt();  	
		for(int i = 0; i < n; i++) {
			adj.add(new ArrayList<Edge>());
			dist = new long[n];
		}
		for(int i = 0; i < m; i++) {
			int a = readInt() - 1, b = readInt() - 1; 
			long w = readLong(); 
			adj.get(a).add(new Edge(b, w, i)); 
			adj.get(b).add(new Edge(a , w, i));
		}
		int a = readInt() - 1, b = readInt() - 1; //a is starting node, b is ending node, c is time limit
		long c = readLong();
		dijkstras(a, m); 
		System.out.println(Arrays.toString(dist));
		if (dist[b] > c) { //if we dont have enough time to get to the ending node 
			
			pw.println(-1); 
			pw.close(); 
			return;
			}
		long left = 0, right = m;
		while(left < right) {
//			System.out.println(Arrays.toString(dist));
			long mid = left + (right - left) / 2;
			dijkstras(a, mid);
			System.out.println(Arrays.toString(dist));
//			System.out.println(dist[b]);
			if(dist[b] < c) { //b is the ending node, c is the time limit (if it is still under time limit)
				
				right = mid;
			}
			else {
				left = mid + 1;
			}
		}
//		pw.println(left); 
		pw.close();
	}
	static void dijkstras(int src, long m){
		Arrays.fill(dist, Long.MAX_VALUE);
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		pq.add(new Edge(src, 0, 0)); 
		dist[src] = 0; 
		while(!pq.isEmpty()){
			Edge u = pq.poll();
			if(u.weight > dist[u.dest]) {
				continue;
			}
			for(Edge e : adj.get(u.dest)) {
				if(e.pass < m && dist[e.dest] > dist[u.dest] + e.weight) { // if next node's level is less than
					dist[e.dest] = dist[u.dest] + e.weight;
					pq.add(new Edge(e.dest, dist[e.dest], e.pass));
				}
			}
		}
	}

	static class Edge implements Comparable<Edge>{
		int dest, pass; long weight;
		public Edge(int dest, long weight, int pass) {
			this.dest = dest;
			this.weight = weight;
			this.pass = pass;
		}
		public int compareTo(Edge a){
			return Long.compare(weight, a.weight);
		}
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong () throws IOException {
		return Long.parseLong(next());
	}

	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}

	static String readLine () throws IOException {
		return br.readLine().trim();
	} 
}