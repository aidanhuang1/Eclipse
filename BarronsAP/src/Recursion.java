
public class Recursion {
	static long num1 = 0;
	static long num2 = 1;
	public static int a(int n) {
		if (n==0) { //base case
			return 0;
		} else {
			System.out.println(n);
			return a(n-1);
		}
	}

	public static int fib1(int n) {
		if (n<=1) {
			return n;
		} else {
			return fib1(n-2) + fib1(n-1);
		}
	}

	public static long fib2(long n) {
		if (num1==0) {
			System.out.println(0);
			System.out.println(1);
		}
		while (n!=0) {
			long temp = num2;
			num2 += num1;
			num1 = temp;
			System.out.println(num2);
			return fib2(n-1);
		} 
		return num2+num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		System.out.println(a(5));
		//		System.out.println(fib1(10));
		System.out.println(fib2(55));
	}

}
