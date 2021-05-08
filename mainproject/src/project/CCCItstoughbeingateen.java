package project;
import java.util.*;
public class CCCItstoughbeingateen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<Integer>(), y = new ArrayList<Integer>();
		x.add(1);
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(3);
		y.add(7);
		y.add(4);
		y.add(1);
		y.add(4);
		y.add(5);
		while(true) { //adds new instructions
			int addx = sc.nextInt();
			int addy = sc.nextInt();
			if (addx==0 && addy==0) {
				break;
			}
			x.add(addx);
			y.add(addy);
		}
		ArrayList<Integer> noprereq = new ArrayList<Integer>(); //looks for tasks with no prerequisites
		for (int i=1; i<=7; i++) {
			if (!y.contains(i)) {
				noprereq.add(i);
			}
		}
		//adds number to new list and remove that number from original list
		ArrayList<Integer> neworder = new ArrayList<Integer>();
		for (int i=1; i<=7; i++) {
			neworder.add(i);
			for (int j=1; j<=7; j++) {
				if (x.get(j)==neworder.get(i)) {
					x.remove(j);
					y.remove(j);
//					neworder.add(x.get(j));
				}
			}

		}

	}



	//first find numbers without prerequisites, and find the smallest number of those.
	//

}



