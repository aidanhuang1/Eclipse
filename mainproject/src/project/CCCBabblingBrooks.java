package project;
import java.util.*;
public class CCCBabblingBrooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); //Initial flow for streams from 1 to m
		ArrayList<Integer> streams = new ArrayList<Integer>(); //Array of streams from left to right
		for (int i=1; i<=m; i++) {
			streams.add(sc.nextInt());
		}
		while (true) { 
			int n = sc.nextInt();
			if (n==77) { //end
				for (int stream : streams) {
					System.out.print(stream+" ");
				}
				break;
			} else if (n==99) { //split
				int a = sc.nextInt()-1, b = sc.nextInt();
				int leftfork = (int) (streams.get(a)*(b/100.0)); //what goes into the left fork of the stream
				int rightfork = streams.get(a)-leftfork; //what goes into the right fork of the stream
				streams.remove(a); //removes that stream
				streams.add(a, leftfork);
				streams.add(a+1, rightfork);
			} else if (n==88) { //join
				int a = sc.nextInt()-1;
				int total = streams.get(a)+streams.get(a+1);
				streams.remove(a);
				streams.remove(a);
				streams.add(a, total);
			}
		}
	}

}
