package project;
import java.util.*;
import java.io.*;
public class CCCItstoughbeingateen5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static boolean[] hasprereq = new boolean[7];
	static boolean notpossible = false;


	public static void lookmore(int i, ArrayList<Integer>[] list) {
		Arrays.fill(hasprereq, false);
		list[i].clear();
		for (ArrayList<Integer> find: list) {
			for (int node: find) {
				hasprereq[node] = true;
			}
		}
	}

	public static int check(boolean[] visited, ArrayList<Integer>[] list) {
		for (int i=0; i<hasprereq.length; i++) {
			if (!hasprereq[i] && !visited[i]) {
				visited[i] = true;
				lookmore(i, list);
				return i;
			}
		}
		notpossible = true;
		return -1;
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Integer>[] list = new ArrayList[7];
		boolean[] visited = new boolean[7];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<>();
		}
		list[0].add(6);
		list[0].add(3);
		list[1].add(0);
		list[2].add(3);
		list[2].add(4);
		hasprereq[6] = true;
		hasprereq[3] = true;
		hasprereq[0] = true;
		hasprereq[4] = true;
		while (true) {
			int x = readInt(), y = readInt();
			if (x==0 && y==0) break;
			list[x-1].add(y-1);
			hasprereq[y-1] = true;
		}
		int index = 0;
		int[] order = new int[7];

		while (index<7) {
			int noprereq = check(visited, list);

			order[index] = noprereq;
			index++;

			if (index>=7) break;
		}

		if (notpossible) {
			System.out.println("Cannot complete these tasks. Going to bed.");
		} else {
			for (int i: order) {
				System.out.print((i+1)+" ");
			}
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
