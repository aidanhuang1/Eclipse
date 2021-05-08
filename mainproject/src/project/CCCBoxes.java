package project;
import java.util.*;
public class CCCBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] boxes = new int[n][3];
		for (int i=0; i<n; i++) {
			for (int j=0; j<3; j++) {
				boxes[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			int smallest = 2000;
			boolean fit = false;
			int[] array = new int [3];
			for (int j=0; j<3; j++) {
				array[j] = sc.nextInt();
			}
			Arrays.sort(array);
			for (int j=0; j<n; j++) { 
				boolean suitablebox = true;
				for (int k=0; k<3; k++) {
					if (boxes[j][k]<array[k]) {
						suitablebox = false;
						break;
					}
				}
				if (suitablebox) { 
					fit = true;
					int volume = 1;
					for (int k=0; k<3; k++) {
						volume *= boxes[j][k];
					}
					smallest = Math.min(smallest, volume);
				}
			}
			if (fit) {
				System.out.println(smallest);
			} else {
				System.out.println("Item does not fit.");
			}
		}
	}
}
