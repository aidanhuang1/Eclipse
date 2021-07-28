import java.util.*;
import java.io.*;
public class DMOJKnapsack2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//columns are the values, rows are the items, grids are the weights
	//this is different from knapsack 1 because columns were weights and grids were values

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), W = readInt(); //N is number of items, W is max capacity
		int[] weights = new int[N], values = new int[N];
		int maxvalue = 0;
		for (int i=0; i<N; i++) {
			int weight = readInt(), value = readInt();
			weights[i] = weight;
			values[i] = value;
			maxvalue += value;
		}
		
		long[] dp = new long[maxvalue+1]; //instead of maximum value, we are finding minimum weight
		Arrays.fill(dp, Integer.MAX_VALUE); //fill with max value because we are finding minimum weight
		
		dp[0] = 0;
		for (int i=0; i<N; i++) {
			for (int j=maxvalue; j>=0; j--) {
				if (j >= values[i]) { //values[i] is the value of item i, and if j is bigger than values[i], that means we have space (more than or equals to index 0) 
					dp[j] = Math.min(dp[j-values[i]]+weights[i], dp[j]);
				}
			}
		}
		int answer = 0;
		for (int i=0; i<=maxvalue; i++) {
			if (dp[i] <= W) {
				answer = Math.max(answer, i);
			}	
		}
		System.out.println(answer);
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
