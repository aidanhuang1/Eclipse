package main;
import java.util.*;
public class CCCHightidelowtide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> oldlist = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			oldlist.add(sc.nextInt());
		}
		Collections.sort(oldlist);
		ArrayList<Integer> newlist = new ArrayList<Integer>();
		while(true) {
			if (oldlist.size()!=0) {
				newlist.add(oldlist.get(oldlist.size()-1));
				oldlist.remove(oldlist.size()-1);
			}
			if (oldlist.size()!=0) {
				newlist.add(oldlist.get(0));
				oldlist.remove(0);
			} else {
				break;
			}
		}
		for (int i=newlist.size()-1; i>=0; i--) {
			System.out.print(newlist.get(i)+" ");
		}
	}

}
