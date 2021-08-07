import java.util.*;
import java.io.*;
public class BitwiseOperators {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		/*
		 * Right shift operator
		 * First operand (bits get shifted) >> Second operand (number of places to shift the first operand)
		 * Right shifting is equivalent to division by 2 ^ right operand
		 * for ex. 3 / (2^right operand)
		 * 3 / (2 ^3)
		 * 3 / (8)
		 * = 0
		 * 
		 * Left shift operator
		 * First operand (bits get shifted) << Second operand (number of places to shift the first operand)
		 * * Left shifting is equivalent to multiplication by 2 ^ right operand
		 * for ex. 3 * (2^right operand)
		 * 3 * (2 ^3)
		 * 3 * (8)
		 * = 24
		 */
		System.out.println(a>>3); //shift the bits of variable a to the right 3 bits
		
		System.out.println(a<<3); //shift the bits of variable a to the left 3 bits

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
