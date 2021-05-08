import java.util.Arrays;

public class movezerostoendofarray {
	
	static int[] move(int[] array) {
		int[] newarray = new int[array.length];
		int count = 0;
		for (int i=0; i<array.length; i++) {
			if (array[i]!=0) {
				newarray[count++] = array[i];
			}
		}
		for (int i=0; i<array.length-count; i++) {
			newarray[count++] = 0;
		}
		return newarray;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,0,2,0,1};
		System.out.println(Arrays.toString(move(a)));

	}

}
