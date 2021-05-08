import java.util.*;
public class hasNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)); //Arrays.asList to add initially
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { //hasNext returns true if there is at least one more element to be examined
			System.out.println(it.next());
		}
	}

}
