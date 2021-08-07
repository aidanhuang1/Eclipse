package project;
import java.util.*;
import java.io.*;
public class CSESSumofTwoValues {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	//Two pointers
	
	/*
	 * Main Idea

Let's start by iterating over the first value in $\mathcal{O}(n)$ time. Given
one value, $a$, the other value must be $x - a$ unless $a > x$ (in which case
$a$ cannot be a valid first value).

So the question reduces to, given some value $a$, does some other value $x - a$
exist?
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), x = readInt();
		int[] array = new int[n+1];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=1; i<=n; i++) {
			array[i] = readInt();
			map.put(array[i], i);
		}
		for (int i=1; i<=n; i++) {
			if (map.containsKey(x-array[i])) {
				System.out.println(i+" "+map.get(x-array[i]));
				return;
			}
			
		}
		System.out.println("IMPOSSIBLE");

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
