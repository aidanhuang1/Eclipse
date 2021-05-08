package main;
import java.util.*;
public class CCCCensor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.lineSeparator());
		int n = sc.nextInt();
		int characters = 0;
		for (int i=0; i<n; i++) {
			String a = sc.next();
			StringBuilder censor = new StringBuilder(a);




			for (int j=0; j<a.length(); j++) {
//				System.out.println("j is "+j+" a.length is "+a.length()+" characters is "+characters);
				if (a.charAt(j)==(' ') || j==a.length()-1) {


					if (characters==4) { //if there is a 4 letter word
						characters = 0;
						for (int y=1; y<5; y++) {
							censor.setCharAt(j-y, '*');
						}

					} else if (j==a.length()-1 && characters == 3) {
						for (int y=0; y<4; y++) {
							censor.setCharAt(j-y, '*');
						}

					} else {
						characters = 0;
					}

				} else { //if not 4 letter
					characters++;
				}

			}
			System.out.println(censor);
		}



	}

}
