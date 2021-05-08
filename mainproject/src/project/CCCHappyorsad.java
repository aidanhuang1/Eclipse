package project;
import java.util.Scanner;
public class CCCHappyorsad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		//use nextline to do the entire string without seperated by spaces
		//sc.next() will seperate if there is space
		//for example, "this is" will have a length of 4 using sc.next
		//using sc.nextLine(), it has 7
		int happy = 0;
		int sad = 0;
		for (int i=0; i<A.length(); i++) {
			if (A.charAt(i)==(':')) {
				if (A.charAt(i+1)==('-')) {
					if (A.charAt(i+2)==(')')) {
						happy++;
					}
					if (A.charAt(i+2)==('(')) {
						sad++;
					}
				}
			}
		}
		if (happy==sad && happy!=0 && sad !=0) {
			System.out.println("unsure");
		}
		if (happy>sad) {
			System.out.println("happy");
		}
		if (sad>happy) {
			System.out.println("sad");
		}
		if (happy==0 && sad==0){
			System.out.println("none");
		}
	}

}
