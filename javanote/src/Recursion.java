import java.util.Scanner;
public class Recursion {
	static int count = 0;
	
	public static void countingback(int b) {
		if (b==1) {
			System.out.println("done "+b);
		} else {
			System.out.println("not yet "+b);
			b--;
			countingback(b);
		}
	}
	
	public static void d1(int a) {
		if (a==5) {
			System.out.println("done");
		} else {
			System.out.println("nope");
			a--;
			d1(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		d1(10);
		countingback(10);

	}

}
