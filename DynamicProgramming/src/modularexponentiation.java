import java.util.*;
import java.io.*;
public class modularexponentiation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static double modpow(int x, int n, int m) {
		if (n == 0) {
			return 1%m;
		}
		double u = modpow(x, n/2, m);
		u = (u*u) % m;
		if (n%2 == 1) {
			u = (u*x) % m;
		}
		return u;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(modpow(3, 4, 2));

	}
}
