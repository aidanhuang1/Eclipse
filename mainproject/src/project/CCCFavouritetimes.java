package project;
import java.io.*;
public class CCCFavouritetimes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int d = Integer.parseInt(br.readLine());
		int hour = 12, minute = 0, count = 0;
		for (int i=0; i<d; i++) {
			minute++;
			if (minute==60) {
				minute = 0;
				hour++;
				if (hour==13) {
					hour = 1;
				}
			}
			String time = Integer.toString(hour)+String.format("%02d", minute);
			int commondif = time.charAt(1) - time.charAt(0);
			boolean sequence = true;
			for (int j=0; j<time.length()-1; j++) {
				if (commondif!=time.charAt(j+1)-time.charAt(j)) {
					sequence = false;
					break;
				}
			}
			if (sequence) {
				count++;
			}
		}	
		System.out.println(count);
	}
}
