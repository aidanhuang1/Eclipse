package project;
import java.util.*;
import java.io.*;
public class CFBooks {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//Runtime error???

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = readInt(), t = readInt();
		
		int[] array = new int[n+1];
		for (int i=1; i<=n; i++) {
			array[i] = readInt();
		}		
		
		int left = 1, right = 1, current = array[1], max = 0;
		while (left<n && right<n) {
			while (current <= t && right<n) {
				right++;
				current += array[right];
			}
			while (current > t && left<n) {
				current -= array[left];
				left++;
			}
			max = Math.max(max, Math.abs(right-left)+1);
		}
		System.out.println(max);

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
