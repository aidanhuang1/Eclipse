
public class test2 {

	public static int recursive(int a) {
		if (a==0) {
			return 0;
		} else {
			System.out.println(a);
			a--;
			return recursive(a);
		}
	}

	public static int fib(int b) {
		if (b==0) {
			return 0;
		} else if (b==1) {
			return 1;
		} else {
			return fib(b-1)+fib(b-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(recursive(10));
		System.out.println(fib(10));
	}

}
