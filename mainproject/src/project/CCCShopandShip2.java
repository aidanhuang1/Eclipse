package project;
import java.util.*;
import java.io.*;

public class CCCShopandShip2 { //This is the adjacency matrix method, ACs for all test cases
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[][] list;
	static int[] cost;
	static int[] store;
	static int N, T, K;

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

	public static int getmin(boolean[] visited, int[] dist) {
		int min = Integer.MAX_VALUE;
		int city = 1;
		for (int i=1; i<=N; i++) {
			if (!visited[i] && min>dist[i]) {
				min = dist[i];
				city = i;
			}
		}
		return city;
	}


	public static void Dijkstra(int start) {
		boolean[] visited = new boolean[N+1];
		int[] dist = new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;

		for (int i=1; i<=N; i++) {

			int city = getmin(visited, dist);

			visited[city] = true;
			for (int j=1; j<=N; j++) {
				if (list[city][j] > 0 && !visited[j]) {
					int newdist = list[city][j] + dist[city];
					if (dist[j] > newdist) {
						dist[j] = newdist;
					}
				}
			}
		}


		int min = Integer.MAX_VALUE;
		for (int i=1; i<=N; i++) {
			min = Math.min(min, cost[i] + dist[i]);
		}
		System.out.println(min);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		N = readInt();
		T = readInt();
		list = new int[N+1][N+1];

		for (int i=1; i<=T; i++) {
			int x = readInt(), y = readInt(), weight = readInt();
			if (x >= 1 && x <= N && y >= 1 && y <= N) {
				list[x][y] = weight;
				list[y][x] = weight;
			}
		}
		K = readInt();
		cost = new int[N+1];
		Arrays.fill(cost, Integer.MAX_VALUE/100);
		for (int i=1; i<=K; i++) {
			cost[readInt()] = readInt();

		}
		int destination = readInt();
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
