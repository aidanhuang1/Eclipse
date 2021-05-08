import java.util.*;
public class HighFiver {
	
	public static boolean memerornot(int n) {
		if (n%2==0  && n%3==0 && n%(String.valueOf(n).length())!=2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (!memerornot(n)) {
			System.out.println("memer");
		} else {
			System.out.println("not a memer");
		}
	}

}
