package project;
import java.util.Arrays;
import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] data = new int[n][n];

		for(int row=0;row<n;row++)
		
			for(int col=0;col<n;col++)
			{
				data[row][col] = (row+1)*(col+1);
			}
	
		System.out.println(Arrays.deepToString(data));
		
		
	}

}
