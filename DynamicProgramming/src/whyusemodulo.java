import java.util.*;
import java.io.*;
public class whyusemodulo {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	/*
	 * ( a + b) % c = ( ( a % c ) + ( b % c ) ) % c
	   ( a * b) % c = ( ( a % c ) * ( b % c ) ) % c
	   ( a – b) % c = ( ( a % c ) – ( b % c ) ) % c
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = 1;
		long A = 10000000, B=100000;
		/*
		 * There is a rectangle of size A x B, compute its area
		 * A, B <= 10^18
		 * As we can see, (A*B) will result in Integer Overflow
		 */
//		System.out.println( ((A%1000000007)*(B%1000000007)) % 1000000007);
		i = (i*A) % 1000000007;
		System.out.println(i);
		i = (i*B) % 1000000007;
		System.out.println(i);

	}
}
