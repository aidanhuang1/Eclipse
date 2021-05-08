package project;
import java.util.Arrays;
import java.util.Scanner;

public class CCCArt {

	public static void main(String[] args) {
		
		// TO-DO: Create a way to ignore commas in the input
		// What if the input coordinates have a 0? 
		
		// TODO Auto-generated method stub
		// This is the input for integers in the array
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\D"); // this will remove the commas between the integers
		int N = sc.nextInt();
		int[] ArrayX = new int[N];
		int[] ArrayY = new int[N];
		for (int i=0; i<N; i++) {
			ArrayX[i] = sc.nextInt();
			ArrayY[i] = sc.nextInt();
			
		}		
		
		// Here is where we find largest and smallest integers of each array

		int ArrayXSmall = ArrayX[0];
		int ArrayYSmall = ArrayY[0];
		int ArrayXLarge = ArrayX[0];
		int ArrayYLarge = ArrayY[0];
		// Smallest integers
		for (int i=0; i<ArrayX.length; i++) {
			if (ArrayX[i] < ArrayXSmall) {
				ArrayXSmall = ArrayX[i];
			}
		}
		for (int i=0; i<ArrayY.length; i++) {
			if (ArrayY[i] < ArrayYSmall) {
				ArrayYSmall = ArrayY[i];
			}
		}		
		// Largest integers
		for (int i=0; i<ArrayX.length; i++) {
			if (ArrayX[i] > ArrayXLarge) {
				ArrayXLarge = ArrayX[i];
			}
		}		
		for (int i=0; i<ArrayY.length; i++) {
			if (ArrayY[i] > ArrayYLarge) {
				ArrayYLarge = ArrayY[i];
			}
		}		
		//Minus 1 for smallest, Plus 1 for largest to fit the frame
		ArrayXSmall = ArrayXSmall - 1;
		ArrayYSmall = ArrayYSmall - 1;
		ArrayXLarge = ArrayXLarge + 1;
		ArrayYLarge = ArrayYLarge + 1;
		// Prints out coordinates of smallest and largest
		System.out.println(ArrayXSmall+","+ArrayYSmall);
		System.out.println(ArrayXLarge+","+ArrayYLarge);

	}
}	

