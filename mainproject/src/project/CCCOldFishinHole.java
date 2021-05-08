package project;
import java.util.*;
public class CCCOldFishinHole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int trout = sc.nextInt(), pike = sc.nextInt(), pickerel = sc.nextInt(), total = sc.nextInt(), count = 0;
		for (int i=0; i<total+1; i++) {
			for (int j=0; j<total+1; j++) {
				for (int k=0; k<total+1; k++) {
					if ((i*trout)+(j*pike)+(k*pickerel)<=total && (i+j+k)!=0) {
						System.out.printf("%d Brown Trout, %d Northern Pike, %d Yellow Pickerel%n",i,j,k);
						count++;
					}
				}
			}
		}
		System.out.printf("Number of ways to catch fish: %d\n",count);
	}

}
