package project;
import java.util.*;
import java.io.*;
public class DMOJContagion {

	static class country {
		int x;
		int y;
		public country(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static country[] countries;
	static int[] distance;
	static boolean[] visited;
	
	public static int calcdist(country from, country to) {
	    return ((from.x-to.x)*(from.x-to.x)) + ((from.y-to.y)*(from.y-to.y));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt();
		countries = new country[N];
		distance = new int[N];
		visited = new boolean[N];
		Arrays.fill(distance, Integer.MAX_VALUE);
		for (int i=0; i<N; i++) {
			countries[i] = new country(readInt(), readInt());
		}
		int X = readInt()-1, Q = readInt();
		distance[X] = 0;
		for (int i=0; i<N; i++) {
			int d = Integer.MAX_VALUE, u = Integer.MAX_VALUE;
			for (int j=0; j<N; j++) {
				if (!visited[j] && distance[j] < d) {
					d = distance[j];
					u = j;
				}
			}
			visited[u] = true;
			for (int j=0; j<N; j++) {
				int tempdist = calcdist(countries[u], countries[j]);
				if (distance[j] > (distance[u] + tempdist)) {
					distance[j] = distance[u] + tempdist;
				}
			}
		}
		for (int i=0; i<Q; i++) {
			int hours = readInt();
			int count = 0;
			for (int j: distance) {
				if (j<=hours) {
					count++;
				}
			}
			System.out.println(count);
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
