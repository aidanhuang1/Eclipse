package project;
import java.io.*;
public class CCCSlotMachines {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int quarters = Integer.parseInt(br.readLine()), tplays = 0, m1 = Integer.parseInt(br.readLine());
		int m2 = Integer.parseInt(br.readLine()), m3 = Integer.parseInt(br.readLine()), machine = 0;
		while (true) {
			quarters--;
			if (machine == 0) {
				m1++;
				if (m1==35) {
					quarters+=30;
					m1 = 0;
				}
				machine = 1;
			} else if (machine == 1) {
				m2++;
				if (m2==100) {
					quarters+=60;
					m2 = 0;
				}
				machine = 2;
			} else if (machine == 2) {

				m3++;
				if (m3==10) {
					quarters+=9;
					m3 = 0;
				}
				machine = 0;
			}
			tplays++;
			if (quarters == 0) {
				System.out.printf("Martha plays %d times before going broke.",tplays);
				break;
			}
		}

	}

}
