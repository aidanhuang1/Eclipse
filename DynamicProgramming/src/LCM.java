import java.util.*;
import java.io.*;
public class LCM {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	/*
	 * Lowest Common Multiple uses GCD to find the answer
	 */
	
	// Recursive method to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcm(5, 10));

	}
}
