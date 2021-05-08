package project;
import java.util.*;
import java.io.*;
public class CCCItstoughbeingateen2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] tasks = new int [10][10];
		int[] ans = new int[7];
		tasks[1][7] = 1;
		tasks[1][4] = 1;
		tasks[2][1] = 1;
		tasks[3][4] = 1;
		tasks[3][5] = 1;
		while(true) {
			int addx = Integer.parseInt(br.readLine());
			int addy = Integer.parseInt(br.readLine());
			if (addx==0&&addy==0) {
				break;
			}
			tasks[addx][addy] = 1;
		}
		ArrayList<Integer> noprereqs = new ArrayList<Integer>();
		for (int i=1; i<=7; i++) {
			if (!tasks.contains(i)) {
				noprereq.add(i);
			}
		}
		
		for (int i=1; i<=7; i++) {
			for (int j=1; j<=7; j++) {
				
			}
		}
	}

}
