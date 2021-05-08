import java.util.Arrays;

public class rotatearray {
	
	static int[] rotate(int[] array, int t) {
		for (int i=0; i<t; i++) {
			int beginning = array[0];
			for (int j=0; j<array.length-1; j++) {
				int temp = array[j+1];
				array[j] = temp;
				if (j==array.length-2) {
					array[array.length-1] = beginning;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(rotate(a, 1)));

	}

}
