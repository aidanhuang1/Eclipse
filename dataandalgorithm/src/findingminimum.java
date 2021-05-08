
public class findingminimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int heights[] = {6, 4, 2, 5, 9, 8};
		int n = heights[0];
		for (int h : heights) {
			if (n > h) { // for each loop to find if a number is smaller than n, then use that
				n = h;
			}
		}
		System.out.println(n);

	}

}
