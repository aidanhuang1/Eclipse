package project;
import java.util.Arrays;
import java.util.Scanner;
public class CCCDoTheShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String array [] = {"A", "B", "C", "D", "E"};
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A==1) {
				for (int i=0; i<B; i++) {
					String letter = array[0];
					array[0] = array[1];
					array[1] = array[2];
					array[2] = array[3];
					array[3] = array[4];
					array[4] = letter;
				}
			}
			if (A==2) {
				for (int i=0; i<B; i++) {
					String letter = array[4];
					array[4] = array[3];
					array[3] = array[2];
					array[2] = array[1];
					array[1] = array[0];
					array[0] = letter;
				}
			}
			if (A==3) {
				for (int i=0; i<B; i++) {
					String letter = array[0];
					array[0] = array[1];
					array[1] = letter;
				}
			}
			if (A==4 && B==1) /* what if B is pressed multiple times at button 4? */ {
				break;

			}
		} 
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}


}
