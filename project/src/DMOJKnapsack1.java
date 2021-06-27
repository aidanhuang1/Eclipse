
import java.util.*;
import java.io.*;
public class DMOJKnapsack1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), W = readInt(); //N is number of items, W is the capacity
		long[] knapsack = new long[10]; //knapsack[i] is the maximum sum for the i capacity
		for (int i=1; i<=N; i++) {
			int w = readInt(), v = readInt(); //weight/cost, value
			
			for (int j=W; j>=w; j--) { //we look backwards starting from max capacity, we stop at w because our item's weight will not go less than w in that row 
				
				knapsack[j] = Math.max(knapsack[(j-w)] + v, knapsack[j]); //knapsack[(j-w)] because your trying to add the previous with the current item's value and seeing if it is bigger
				System.out.println(Arrays.toString(knapsack));
			}
			
		}
		
		Arrays.sort(knapsack);
		System.out.println(knapsack[9]);

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
