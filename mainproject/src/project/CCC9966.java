package project;
import java.io.*;
import java.util.*;
public class CCC9966 {

	public static boolean onedigit(String[] number) {
		char digit = Arrays.toString(number).charAt(1);
		if (digit=='1' || digit=='8' || digit=='0') {
			return true;
		}
		return false;
	}

	public static boolean containsdigit(String[] number) {
		String[] matches = new String[] {"1", "0", "6", "9", "8"};
		for (String i : matches) {
			if ((Arrays.toString(number)).contains(i)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i=a; i<=b; i++) {
			String[] oldnumber = String.valueOf(i).split("");
			String[] number = new String[oldnumber.length];
			int index = 0;
			for (int j=oldnumber.length-1; j>=0; j--) {
				number[index] = oldnumber[j];
				index++;
			}
			for (int j=0; j<number.length; j++) {
				if (number[j].charAt(0)=='9') {
					number[j] = "6";
				} else if (number[j].charAt(0)=='6') {
					number[j] = "9";
				}
			}
			if (number.length==1) {
				if (onedigit(number)) {
					count++;
				}
			}
			else if (Arrays.toString(number).equals(Arrays.toString(oldnumber)) && containsdigit(number)) {
				count++;
			}
			System.out.println(Arrays.toString(number)+" "+Arrays.toString(oldnumber)+" "+count);

		}
		System.out.println(count);
	}

}
