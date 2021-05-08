import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class JavanotesforCCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Use split(" ") if you want to split every word by spaces,
		 * String arr[] = a.split(" ");
		 * This creates a string array, and the string a is splitted into sections divided by spaces
		 * The quick brown fox jumps over the lazy dog
			[The, quick, brown, fox, jumps, over, the, lazy, dog]
		 */
		
//		--------------------------------------------------------------------------

		//substring to return a new string that is part of the original string
		//substring starts from index 0 and goes until what index you want it to end
		String a = "abcdefg";
		System.out.println(a.substring(0,a.length()-1)); // (substring(start index, end index))
		
//		--------------------------------------------------------------------------
		
		//You can use BufferedReader to make the input faster (in some cases)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		HashMap<Double, Double> map = new HashMap<Double, Double>();
//		int n = Integer.parseInt(br.readLine());
//		for (int i=0; i<n; i++) {
//			String[] a = br.readLine().split(" ");
//			map.put(Double.parseDouble(a[0]), Double.parseDouble(a[1]));
//		}
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int r = Integer.parseInt(br.readLine());
//		int c = Integer.parseInt(br.readLine());
//		room = new int [r][c];
//		for (int i=0; i<r; i++) {
//			String[] reader = br.readLine().split(" ");	
//			for (int j=0; j<c; j++) {
//				room[i][j] = Integer.parseInt(reader[j]);
//			}
//		}
		
//		--------------------------------------------------------------------------

		//When sorting arrays, it may be faster to use Collections.sort or Arrays.sort(Object[]) 
		//instead of Arrays.sort(primitive[])
		
		

	}

}
