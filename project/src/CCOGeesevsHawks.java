import java.util.*;
import java.io.*;
public class CCOGeesevsHawks {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	 * Create a 2d array nxn
	 * columns represent the 
	 *we start from first line first number, 
	 *compare it to all the numbers on the next line starting from left to right
	 * if the two numbers fit the conditions and we have a sum, we add it to the row i
	 * dp[i][j] = Math.max(dp[i][j-1], team1+team2+dp[i-1][j
	 * 
	 * maybe we also keep a visited array?
	 * greedy algorithms, create a class and use priorityqueue
	 * 
	 */
	
	public static class game implements Comparable<game>{
		char c;
		int points;
		public game(char c, int points) {
			this.c = c;
			this.points = points;
		}
		@Override
		public int compareTo(CCOGeesevsHawks.game o) {
			// TODO Auto-generated method stub
			return o.points-points;
			
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		PriorityQueue<game> pq1 = new PriorityQueue<>();
		PriorityQueue<game> pq2 = new PriorityQueue<>();
		String[] temp1 = readLine().split("");
		for (int i=0; i<n; i++) {
			pq1.add(new game(temp1[i].charAt(0), readInt()));
		}
		String[] temp2 = readLine().split("");
		for (int i=0; i<n; i++) {
			pq2.add(new game(temp2[i].charAt(0), readInt()));
		}
		int[][] dp = new int[n+1][n+1];
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		while(!pq2.isEmpty()) {
//			game temp = pq2.poll();
//			System.out.println(temp.c+" "+temp.points);
//		}
		

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
