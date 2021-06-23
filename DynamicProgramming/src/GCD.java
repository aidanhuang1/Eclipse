import java.util.*;
import java.io.*;
public class GCD {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(5, 10));
	}
}
