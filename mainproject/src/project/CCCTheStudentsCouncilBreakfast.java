package project;
import java.util.*;
import java.io.*;
public class CCCTheStudentsCouncilBreakfast {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pink = Integer.parseInt(br.readLine()), green = Integer.parseInt(br.readLine());
		int red = Integer.parseInt(br.readLine()), orange = Integer.parseInt(br.readLine());
		int cost = Integer.parseInt(br.readLine()), count = 0;
		ArrayList<Integer> minimumlist = new ArrayList<>();
		for (int i=0; i<cost+1; i++) {
			for (int j=0; j<cost+1; j++) {
				for (int k=0; k<cost+1; k++) {
					for (int l=0; l<cost+1; l++) {
						if ((orange*i)+(red*j)+(green*k)+(pink*l)==cost) {
							System.out.printf("# of PINK is %d # of GREEN is %d # of RED is %d # of ORANGE is %d%n",l,k,j,i);
							count++;
							minimumlist.add(i+j+k+l); //could also use Math.min to find the smallest number passed through
						}
					}
				}
			}
		}
		int minimum = minimumlist.get(0);
		for (int i : minimumlist) {
			if (minimum>i) {
				minimum = i;
			}
		}
		System.out.printf("Total combinations is %d.%n",count);
		System.out.printf("Minimum number of tickets to print is %d.",minimum);
	}
}
