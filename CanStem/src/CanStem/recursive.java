package CanStem;

public class recursive {
	
	public static int a(int input) {
		if(input==0) {
			return 0;
		}
		else {
			return input + a(input-1);
		}
	}
	
	
	//count how many "x"
	public static int b(String input) {
		if(input.length() == 0) {
			return 0;
		}
		if(input.substring(0,1).equals("x")) {
			return 1+b(input.substring(1, input.length()));
		}
		return b(input.substring(1, input.length()));
		
	}
	
	//read a integer 
	//count how many "8" there are
	
	public static int c(int input) {
		if (input==0) {
			return 0;
		} 
		if (input%10==8) {
			return 1+c(input = input/10);
		}
		return c(input = input/10);
	}
	
	//fibonacci
	public static int d(int x) {
		if (x<=1) {
			return x;
		} else {
			return d(x-2) + d(x-1);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(a(5));
		 System.out.println(b("abxcd"));
		 System.out.println(c(82388));
		 System.out.println(d(4));
	}

}



