import java.util.*;
import java.io.*;
public class Test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static String t(String a) {
		System.out.println(a);
		if (a.length()>0)
		return t(a.substring(1, a.length()));
		return "";
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String test = "abababababababa";
		test = test.replaceFirst("b", "");
		System.out.println(test);
				
				
//		t(test);
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
