import java.util.*;
import java.io.*;
public class TrappingRainWater {
	
	//Step 1: Start from the first wall (number) and iterate to the next number that is equal to or more than the first
	//Step 2: At the second wall, find the next that is the greatest or greater/equal to the second wall
	//And make sure the distance between is at least 1
	
	public static int lookforfirst(int[] array) {
		if (array[0]==0) {
			for (int i=0; i<array.length; i++) {
				if (array[i]!=0) {
					return i;
				}
			}
			return -1;
		} 
		return 0;
		
	}
	
	public static int water(int[] array, int n) { //where array is the array and n is the size of the array
		int total = 0;
		int index = lookforfirst(array); //look for the first index to start from
		if (index==-1) { 			
			return 0;
		} //otherwise
		for (int i=index; i<array.length; i++) {
			if (array[i]>=array[index]) { //we found a wall
				for (int j=i-1; j>index; j--) {
					total += (array[index]-array[j]);
				}
				index = i;
			}
		}
		return total;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = {3, 0, 0, 2, 0, 4};
		System.out.println(water(array, 6));
		
	}

}
