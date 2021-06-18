package project;
import java.util.*;
import java.io.*;
public class DMOJFuninForag {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Edge>[] list;
	static int N, M;

	public static void search(int start, int end, int minutes) {
		int[][] dist = new int[N+1][100001];
		boolean[] visited = new boolean[N+1];
		for (int[] i: dist) {
			Arrays.fill(i, Integer.MAX_VALUE);
		}
		dist[start][0] = 0;
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(start, 0, 0)); 
		visited[start] = true;
		while (!pq.isEmpty()) {
			Edge temp = pq.poll();
			for (Edge i: list[temp.to]) {

				int alt = i.time+temp.time;
				if (alt<minutes) {
					if (i.level > temp.level) {
						dist[i.to][i.level] = alt;
						pq.add(new Edge(i.to, alt, i.level));
					} else {
						dist[i.to][temp.level] = alt;
						pq.add(new Edge(i.to, alt, temp.level));
					}
				}

			}
		}


		int min = 0;
		for (int i=end; i<=end; i++) {
			for (int j=0; j<dist[i].length; j++) {
				if (dist[i][j]!=Integer.MAX_VALUE && min<j) {
					min = j;
				}
			}
		}
		System.out.println(min);
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = readInt();
		M = readInt();
		list = new ArrayList[N+1];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Edge>();
		}
		for (int i=0; i<M; i++) {
			int a = readInt(), b = readInt(), c = readInt();
			list[a].add(new Edge(b, c, i+1));
			list[b].add(new Edge(a, c, i+1));
		}
		search(readInt(), readInt(), readInt());

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
