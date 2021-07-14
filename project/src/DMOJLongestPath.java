import java.util.*;
import java.io.*;
public class DMOJLongestPath {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static boolean[] visited;
	static ArrayList<Integer>[] list;
	static int[] dp;
	public static int dfs(int v) {
		if (dp[v]!=-1) return dp[v];
		for (int u: list[v]) {
			dp[u] = dfs(u);
			dp[v] = Math.max(dp[u]+1,dp[v]);
		}
		return dp[v];
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), m = readInt();
		list = new ArrayList[n+1];
		visited = new boolean[n+1];
		dp = new int[n+1];
		for (int i=1; i<=n; i++) {
			list[i] = new ArrayList<Integer>();
		}
	
		for (int i=1; i<=m; i++) {
			list[readInt()].add(readInt());
		}
		Arrays.fill(dp, -1);
		for (int i=1; i<=n; i++) {
			if (!visited[i]) {
				dfs(i);
			}
		}
		int max = 0;
		for (int i: dp) {
			max = Math.max(max, i);
		}
		System.out.println(max+1);
		System.out.println(Arrays.toString(dp));
		

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