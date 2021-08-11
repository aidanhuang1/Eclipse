import java.util.*;
import java.io.*;
public class GCD {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	public static long gcd(long a, long b) {
	    return b == 0 ? (a < 0 ? -a : a) : gcd(b, a % b);
	  }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gcd(12, 18)); // 6
	    System.out.println(gcd(-12, 18)); // 6
	    System.out.println(gcd(12, -18)); // 6
	    System.out.println(gcd(-12, -18)); // 6

	}
}
