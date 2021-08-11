import java.util.*;
import java.io.*;
public class isPrime {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	public static boolean isPrime(long n) {
	    if (n < 2) return false;
	    if (n == 2 || n == 3) return true;
	    if (n % 2 == 0 || n % 3 == 0) return false;

	    long limit = (long) Math.sqrt(n);

	    for (long i = 5; i <= limit; i += 6) {
	      if (n % i == 0 || n % (i + 2) == 0) {
	        return false;
	      }
	    }	
	    return true;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(29));

	}
}
