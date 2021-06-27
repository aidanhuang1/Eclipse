import java.util.*;
import java.io.*;
public class CSESMoneySums {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), max = 0;
		int[] coins = new int[n];
		for (int i=0; i<n; i++) {
			int coin = readInt();
			coins[i] = coin;
			max += coin; //max is the sum of all the coins that we are given, 
			//we need this to create the size of our capacity array
		}
		boolean[] possible = new boolean[max+1]; //if possible[i] is true, then we can make a sum of i
		possible[0] = true;	
		int count = 0;
//		for (int i=0; i<n; i++) {
//			for (int j=max; j>=0; j--) {
//				if (possible[j]) { //if the sum we are at currently is true, then the sum that we add another coin with would also be true, as long as it is not out of bounds
//					possible[j+coins[i]] = true;
//				}
//			}
//		}
		
		//The code above works too, but the one below is a bit shorter
		
		for (int coin: coins) {
			for (int j=max; j>=0; j--) {
				if (possible[j]) {
					possible[j + coin] = true;
				}
			}
		}
		
		
		for (int i=1; i<possible.length; i++) {
			if (possible[i])
				count++;
		}
		System.out.println(count);
		for (int i=1; i<possible.length; i++) {
			if (possible[i]) System.out.print(i+" ");
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
