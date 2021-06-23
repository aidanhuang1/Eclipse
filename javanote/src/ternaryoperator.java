import java.util.*;
import java.io.*;
public class ternaryoperator {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		System.out.println((a>2) ? "yes" : "no"); //a is not greater than 2 so String b is "no"
		//otherwise if a was greater than 2, b would be "yes"
		
		a = (a<0) ? 1 : 2;
		System.out.println(a);
		
		
		int b = 50;
		System.out.println((b>40) ? "yes" : "no");
	}
}
