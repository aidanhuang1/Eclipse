package CanStem;
import java.util.*;
public class studentmark2 {
	
	//Teacher's solution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String[]> l = new ArrayList<String[]>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		while(!input.equals("")) {
			boolean t = true;
			for (int i=0; i<l.size(); i++) {
				int m = Integer.parseInt(input.split(" ")[1]);
				int mark = Integer.parseInt(l.get(i)[1]);
				if (!(m>mark)) {
					l.add(i, input.split(" "));
					t = false;
					break;
				}
			}
			if (t) {
				l.add(input.split(" "));
				input = sc.nextLine();
			}
		}
		for (int i=0; i<l.size(); i++) {
			System.out.printf("%s %s%n", l.get(i)[0], l.get(i)[1]);
		}
	}

}
