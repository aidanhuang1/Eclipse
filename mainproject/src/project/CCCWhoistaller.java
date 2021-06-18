package project;
import java.util.*;
import java.io.*;
public class CCCWhoistaller {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static boolean[] visited;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), M = readInt();
		ArrayList<Integer>[] list = new ArrayList[N+1];
		visited = new boolean[N+1];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for (int i=0; i<M; i++) {
			int a = readInt(), b = readInt();
			list[b].add(a);
		}
		int p = readInt(), q = readInt();
		int found = 0;
		
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(q);
		visited[q] = true;
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			if (temp==p) {
				found = 1;
			}
			for (int i: list[temp]) {
				if (!visited[i] || i==p) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
		queue.clear();
		queue.add(p);
		visited[p] = true;
		if (found==0) {
			while (!queue.isEmpty()) {
				int temp = queue.poll();
				if (temp==q) {
					found = 2;
				}
				for (int i: list[temp]) {
					if (!visited[i] || i==q) {
						queue.add(i);
						visited[i] = true;
					}
				}
			}
		}
		if (found==1) {
			System.out.println("yes");
		} else if (found==2) {
			System.out.println("no");
		} else {
			System.out.println("unknown");
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
