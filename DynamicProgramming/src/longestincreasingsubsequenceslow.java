import java.util.*;
import java.io.*;
public class longestincreasingsubsequenceslow {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	 * This is a slow implementation with a time complexity of O(n^2)
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		int[] numbers = new int[n];
		for (int i=0; i<n; i++) {
			numbers[i] = readInt();
		}
		int[] length = new int[n];
		HashSet<Integer> hashset = new HashSet<>();
		Arrays.fill(length, 1);
		int lis = 0; //we can find the size of the lis
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				
				hashset.add(length[i]); //hashset can be used to find unique numbers
				
				if (numbers[j]<numbers[i]) {
					length[i] = Math.max(length[i], length[j]+1);
					
				}
			}
			lis = Math.max(lis, length[i]);
		}
		System.out.println(Arrays.toString(length));
		
		
		System.out.println(hashset);
		System.out.println(lis);
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
