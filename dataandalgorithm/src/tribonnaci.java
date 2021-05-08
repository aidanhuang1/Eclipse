
import java.util.Scanner;

public class tribonnaci {

	static int f(int n) {
		if(n==0 || n==1 || n==2) {
			return 1;
		}
		return f(n-1) + f(n-2) + f(n-3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(f(5));

	}
	//1 + 1 + 1 + 3 + 5


}
