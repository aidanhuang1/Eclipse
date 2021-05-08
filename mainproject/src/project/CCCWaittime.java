package project;
import java.util.*;
public class CCCWaittime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int[] R = new int[M], W = new int[M], S = new int[M];
		for (int i=0; i<M; i++) {
			char letter = sc.next().charAt(0);
			int integer = sc.nextInt();
			if (letter=='R') {
				R[i] = integer; 
			} else if (letter=='W') {
				W[i] = integer;
			} else if (letter=='S') {
				S[i] = integer;
			}
		}
		int[] Rtotal = new int[101]; 
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
				if (W[j]!=0 && !hasreachedwaittime ) {
					hasreachedwaittime = true;
					time = time + (W[j]-1);
					repeatW = W[j];
				} else if (hasreachedwaittime && repeatW==W[j]) {
					time = time + (W[j]);
				} else if (friend==S[j]) {
					repliedto = true;
					Rtotal[friend] += time;
					time = 0;
					break;
				} else {
					time++;
				}
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
