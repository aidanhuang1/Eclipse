import java.util.*;
import java.io.*;
public class LuckyNumbers {

	public static int counter = 2;

	public static boolean isLucky(int n) {
		if (n<counter) {
			return true;
		} else if (n%counter==0) {
			return false;
		}
		int prevcounter = counter;
		counter++;
		return isLucky(n-(n/prevcounter));		
		

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If we do the position of the number (n) divided by the interval of numbers we are deleting
		//For ex. number 5 and every second number deleted
		//we would get 2, cause 5/2 = 2
		//This is how many positions that the number 5 would go down by.
		//Number 5 would then be at position 3.
		Scanner sc = new Scanner(System.in);
		int n = 19;
		System.out.println(isLucky(n));

	}

}
