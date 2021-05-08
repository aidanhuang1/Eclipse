package project;
import java.util.*;
public class CCCWaittimeprevious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int[] R = new int[M], W = new int[M], S = new int[M];
		for (int i=0; i<M; i++) {
			char letter = sc.next().charAt(0);
			int integer = sc.nextInt();
			if (letter=='R') {
				R[i] = integer; //i is when message was received, integer is which friend
			} else if (letter=='W') {
				W[i] = integer;
			} else if (letter=='S') {
				S[i] = integer; //i is when message is sent, integer is to which friend
			}
		}
		System.out.println(Arrays.toString(S));
		int[] Rtotal = new int[101]; //all R values in Rtotal
		for (int i=0; i<R.length; i++) {
			if (R[i]==0) {
				continue;
			}
			int time = 0;
			int friend = R[i];
			boolean hasreachedwaittime = false;
			boolean repliedto = false;
			int repeatW = 0;
			for (int j=i; j<M; j++) {
				if (W[j]!=0 && !hasreachedwaittime ) { //message reached a waittime
					System.out.println("reached waittime");
					hasreachedwaittime = true;
					time = time + (W[j]-1); //-1 is for removing time
					repeatW = W[j];
				} else if (hasreachedwaittime && repeatW==W[j]) {
					System.out.println("touched here");
					time = time + (W[j]); //-1 is for removing time
				} else if (friend==S[j]) { //message sent to friend
					repliedto = true;
					Rtotal[friend] += time; // time is time between recieved and sent message, friend is which friend
					time = 0;
					System.out.println(Rtotal[friend]);
					break;
				} else {
					time++;
				}
				System.out.println("friend: "+friend+"     time j: "+time+"       time i: "+i+"      j: "+j+"        total wait time: "+Rtotal[friend]);
			}
			if (!repliedto) {
				Rtotal[friend] = -1;
			}
		}
		for (int i=0; i<Rtotal.length; i++) {
			if (Rtotal[i]!=0) {
				System.out.println(i+" "+Rtotal[i]);
			} else if (Rtotal[i]==-1) {
				System.out.println(i+" -1");
			}
		}

	}

}
