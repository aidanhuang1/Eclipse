package project;
import java.util.*;
import java.io.*;
public class CCCItstoughbeingateen4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void stack(int i, boolean[]visited, ArrayList<Integer> next, ArrayList<Integer>[] list) {
		visited[i] = true;
		for (int j: list[i]) {
			if (!visited[j]) {
				stack(j, visited, next, list);
			}
		}
		next.add(i);
	}

	public static void sort(ArrayList<Integer>[] list, int noprereq) {
		boolean[] visited = new boolean[7];
		int[] order = new int[7];
		order[0] = noprereq;
		int index = 1;
//		System.out.println(noprereq+1);
		ArrayList<Integer> next = new ArrayList<>();
		stack(noprereq, visited, next, list);
		while (!next.isEmpty()) {
			order[index] = next.remove(0);
			System.out.println(order[index]);
			index++;
		}
		for (int i=0; i<7; i++) {
			if (!visited[i]) {
				stack(i, visited, next, list);
				while (!next.isEmpty()) {
					order[index] = next.remove(0);
					index++;
				}
			}
		}
		
		
		for (int i: order) {
			System.out.print((i+1)+" ");
		}

	}



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Integer>[] list = new ArrayList[7];
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<>();
		}
		boolean[] hasprereq = new boolean[7];
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
		int noprereq = Integer.MAX_VALUE;
		for (int i=0; i<hasprereq.length; i++) {
			if (!hasprereq[i]) {
				noprereq = Math.min(noprereq, i);
			}
		}
		sort(list, noprereq);





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
