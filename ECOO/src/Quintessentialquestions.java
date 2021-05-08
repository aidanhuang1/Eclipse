import java.util.*;
public class Quintessentialquestions {
	
	public static boolean contains(int[] array, int x) {
		for (int i=0; i<array.length; i++) {
			if (array[i]==x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
		int A[] = new int[K], B[] = new int[K], C[] = new int[K];
		for (int i=0; i<K; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		for (int i=1; i<=M; i++) {
			if (!contains(B, i)) { //No professor answered
				System.out.print(-1+" ");
			} else { //at least 1 professor answered	

				int currentprofessor = -1;
				int highestscore = -1;
				for (int j=1; j<B.length; j++) {
					if (B[j]==i) {
						if (C[j]>highestscore) {
							highestscore = C[j];
							currentprofessor = A[j];
						}
					}
				}
				System.out.print(currentprofessor+" ");
				
			}
		}
	}

}
