import java.util.Arrays;

public class deleteelementinarray {
	
	static int[] delete(int[] array, int index) {
		if (index<=0 || index>=array.length) {
			System.out.println("Invalid");
		} else {
			for (int i=index; i<array.length-1; i++) {
				array[i] = array[i+1];
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,4};
		System.out.println(Arrays.toString(delete(a, 2)));
	}

}
