package project;
import java.util.*;
import java.io.*;
public class CCCTopYodeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();	
		int[] ranks = new int[n], array = new int[n];
		for (int i=0; i<k; i++) {
			for (int j=0; j<n; j++) {
				int integer = sc.nextInt();
				array[j] += integer;
			}
			
			int[] temp = array.clone();
			Arrays.sort(temp);
			for (int j=0; j<array.length; j++) {
				int ranking = 0;
				for (int l=temp.length-1; l>=0; l--) {
					ranking++;
					if (array[j]==temp[l]) {
						ranks[j] = Math.max(ranking, ranks[j]);
					}
				}
			}
		}
		int topyodeller = 0;
		int score = 0;
		for (int i=0; i<array.length; i++) {
			if (array[i]>topyodeller) {
				topyodeller = i;
				score = array[i];
			}
		}
		for (int i=0; i<array.length; i++) {
			if (array[i]==score) {	//If tied for Topyodeller, print and increase by competitor number
				System.out.println("Yodeller "+((topyodeller+2)-(array.length-i))+" is the TopYodeller: score "+score+", worst rank "+(ranks[topyodeller]));
			}
		}
		

	}

}
