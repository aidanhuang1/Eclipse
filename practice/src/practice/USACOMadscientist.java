package practice;
import java.util.*;
import java.io.*;
public class USACOMadscientist {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt();
		String A = readLine(), B = readLine();
		int AG = 0, AH = 0, BG = 0, BH = 0;
		for (int i=0; i<N; i++) {
			if (A.charAt(i)=='G') {
				AG++;
			} else if (A.charAt(i)=='H') {
				AH++;
			}
			if (B.charAt(i)=='G') {
				BG++;
			} else if (B.charAt(i)=='H') {
				BH++;
			}
		}
		System.out.println((Math.abs(AG-BG)+Math.abs(AH-BH)));
		
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
