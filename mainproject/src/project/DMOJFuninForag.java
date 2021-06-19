package project;
import java.util.*;

import java.io.*;
public class DMOJFuninForag {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Edge>[] list;
	static int[] dist, distlevel;
	static int N, M;

	public static void search(int start, int M) {
		Arrays.fill(dist, Integer.MAX_VALUE);
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		pq.add(new Edge(start, 0, 0)); 
		dist[start] = 0; 
		int templevel = 0;
		distlevel[start] = templevel;

		while(!pq.isEmpty()){
			Edge u = pq.poll();
			if (u.time > dist[u.to]) {
				continue;
			}
			for (Edge e : list[u.to]) {
				int temptime = dist[u.to] + e.time;
				if (e.level < M && dist[e.to] > temptime) { 
					dist[e.to] = temptime;
					if (e.level>templevel) {
						templevel = e.level;
					}
					distlevel[e.to] = templevel+1;
					pq.add(new Edge(e.to, dist[e.to], e.level));
				}
			}
		}
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = readInt();
		M = readInt();
		list = new ArrayList[N];
		dist = new int[N];
		distlevel = new int[N];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Edge>();
		}
		for (int i=0; i<M; i++) {
			int a = readInt()-1, b = readInt()-1, c = readInt();
			list[a].add(new Edge(b, c, i));
			list[b].add(new Edge(a, c, i));
		}
		int a = readInt()-1, b = readInt()-1, c = readInt();

		search(a, M);
		if (dist[b] > c) { //if we dont have enough time to get to the ending node 

			System.out.println(-1);
			return;
		}
		int left = 0, right = M;
		while(left < right) {
			//			System.out.println(Arrays.toString(dist));
			int mid = left + (right - left) / 2;
			search(a, mid);
			if(dist[b] < c) { //b is the ending node, c is the time limit (if it is still under time limit)

				right = mid;
			}
			else {
				left = mid + 1;
			}
		}
		System.out.println(Arrays.toString(dist));
	}


	static class Edge implements Comparable<Edge>{
		int to;
		int time;
		int level;
		public Edge (int to, int time, int level) {
			this.to = to;
			this.time = time;
			this.level = level;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return level-o.level;
		}
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
