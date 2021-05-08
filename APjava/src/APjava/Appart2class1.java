package APjava;
import java.util.ArrayList;
import java.util.Arrays;
public class Appart2class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		question 10
				int[] array = {1,3,2,5,4,7,8};
				ArrayList<Integer> newarray = new ArrayList<Integer>();
				for (int i=0; i<array.length; i++) {
					if (array[i]%2==0) {
						newarray.add(array[i]);
					} 
		
				}
				for (int i=0; i<array.length; i++) {
					if (array[i]%2!=0) {
						newarray.add(array[i]);
					}
				}
				System.out.println(newarray);
		
				
				//trying to do it without arraylist
				
//		int temp = 0;
//		int[] array = {1,3,2,5,4,7,8};
//		for (int i=0; i<array.length; i++) {
//			if (array[i]%2==0) {
//				temp = array[0];
//				array[0] = array[i];
//				array[i] = temp;
//			}
//		}
//		for (int i=0; i<array.length; i++) {
//			if (array[i]%2!=0) {
//				temp = array[0];
//				array[0] = array[i];
//				array[i] = temp;
//			}
//
//		}
//		System.out.println(Arrays.toString(array));
	}
}
