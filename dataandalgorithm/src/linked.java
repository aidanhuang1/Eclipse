
import java.util.ArrayList;

public class linked {

	static int numberofnumbers;
	static boolean taken[] = new boolean[100];
	static ArrayList<Integer> perm = new ArrayList<>();
	
	static void rec(int n) {
		//base case
		if(perm.size() == numberofnumbers) {
			/* this is another way to do 
			for(int k : perm) {
				System.out.print(k + " ");
			}
			System.out.println();
			*/
			
			// outputting permutation
			for (int i=0; i<perm.size(); i++) {
				int k = perm.get(i);
				System.out.print(k + " ");
			}
			System.out.println();
			return;
			// return we dont add anymore
		}
		//recurrence
		for(int i = 1; i<=numberofnumbers; i++) {
			//check if the value i is taken
			if(taken[i] == false) { //if i is not in permutation
				taken[i] = true; // make it true
				perm.add(i); // we add it the end of the permutation
				rec(n+1); // get the next element
				perm.remove((Integer) i); // remove the last element
				taken[i] = false; // set it to false
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
