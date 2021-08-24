import java.util.*;
import java.io.*;
public class DMOJDisjointSetTest2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static int[] dsu;
	
	static int find(int x) {
		return dsu[x] == -1 ? x : (dsu[x] = find(dsu[x]));
	}
	
	static void union(int x, int y) {
		dsu[x] = y;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=readInt(), m = readInt(), count = 0;
		dsu = new int[n+1];
		Arrays.fill(dsu, -1);

		ArrayList<Integer> list = new ArrayList<>();
		for (int i=1; i<=m; i++) {
			int x = find(readInt()), y = find(readInt());
			if (x != y) {
				union(x, y);
				list.add(i);
				count++;
			}
			if (count==n-1) {
				for (int e: list) {
					System.out.println(e);
				}
				return;
			}
		}
		System.out.println("Disconnected Graph");
		
			

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
