import java.util.*;
import java.io.*;
public class knapsack {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*					2D ARRAY METHOD
		 * 
		 * We will be comparing two numbers in a max( , ).
		 * The first (left) number is looking at the row object from the object at the very left
		 * and we are subtracting its weight from the capacity in the current column.
		 * The remaining weight is how many steps you go backwards in the row above.
		 * 
		 * The other number your comparing is the number that is right above your current pointer. 
		 * You take the greatest of the two numbers.
		 * 
		 * 
		 * 
		 * 
		 * When you are done making the 2d array,
		 * You work backwards from the bottom-right of the arrays to the top-left
		 * You first compare the number above with the number you are currently at.
		 * We start at the bottom right corner and we compare with the number one up from our position.
		 * If both numbers are not equal, we take the weight of the object on the row we are currently on,
		 * we go to the row above and move left the number of the weight.
		 * The number we end up at is where we will be going next.
		 * We repeat the steps.
		 * 
		 * We will be including the item of the row that we were just on into our solution.
		 * 
		 * If both numbers are equal, we will not include the item of the row we were just on. 
		 * We will continue moving up 1.
		 * We repeat the steps.
		 */
		
		//This isn't the 2d array method, this uses the 1d array but its more memory efficient
		int N = readInt(), W = readInt();
		long[] knapsack = new long[100001];
		for (int i=1; i<=N; i++) {
			int w = readInt(), v = readInt();
			for (int j=W; j>=w; j--) {
				knapsack[j] = Math.max(knapsack[(j-w)] + v, knapsack[j]);
				System.out.println(Arrays.toString(knapsack));
			}
		}
		
		Arrays.sort(knapsack);
		System.out.println(knapsack[100000]);

	

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
