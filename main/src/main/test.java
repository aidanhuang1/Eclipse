package main;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String T = "abcdefg";
		String character = T.substring(1, T.length());
		char first = T.charAt(0);
		System.out.println(character);
		T = character+first;
		System.out.println(T.lastIndexOf(T));
	}

}
