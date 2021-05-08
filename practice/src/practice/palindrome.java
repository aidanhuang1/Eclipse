package practice;
import java.util.ArrayList;

public class palindrome {
	
	//method 1
	public static boolean check(String a) {
		ArrayList<Character> reverse = new ArrayList<Character>();
		for (int i=a.length()-1; i>=0; i--) {
			reverse.add(a.charAt(i));
		}
		for (int i=0; i<reverse.size(); i++) {
			if (reverse.get(i)!=a.charAt(i)) return false;
		}
		return true;
	}
	
	
	//method 2
	public static boolean check2(String a) {
		String b = "";
		for (int i=a.length()-1; i>=0; i--) {
			b+=(a.charAt(i));
		}
		for (int i=0; i<a.length(); i++) {
			if (b.charAt(i)!=a.charAt(i)) return false;
		}
		return true;
	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String a = "poop", b = "red";
			System.out.println(check2(a));


		}

	}
