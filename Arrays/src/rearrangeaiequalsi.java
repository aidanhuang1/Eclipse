import java.util.Arrays;

public class rearrangeaiequalsi {
	
	static int[] rearrange(int[] array) {
		for (int i=0; i<array.length; i++) {
			if (array[i]!=i) {
				array[i] = -1;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {0,1,2,3,5,4,6};
		System.out.println(Arrays.toString(rearrange(a)));

	}

}
