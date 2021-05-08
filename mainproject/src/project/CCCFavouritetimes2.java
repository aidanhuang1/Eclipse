package project;
import java.io.*;
import java.util.Scanner;
public class CCCFavouritetimes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int hours1 = 1, hours2 = 2, minutes1 = 0, minutes2 = 0;
		int count = (D/720)*31;
		D %= 720;
		for (int i=0; i<D; i++) {
			minutes2++;
			if (minutes2>=10) {
				minutes1++;
				minutes2=0;
			}
			if (minutes1>=6) {
				hours2++;
				minutes1=0;
			}
			if (hours2>=10) {
				hours1++;
				hours2 = 0;
			}
			if (hours1==1 && hours2>=3) {
				hours1 = 0;
				hours2 = 1;
			}
			
			if (hours1==0) {
				if (hours2-minutes1>=0) {
					if (minutes2==minutes1-(hours2-minutes1))
					count++;
				} else if (hours2-minutes1<0) {
					if (minutes2==Math.abs(hours2-minutes1)+minutes1) {
						count++;
					}
				}
			} else if (hours1==1) {
				if (hours2-hours1 == minutes1-hours2 && minutes1-hours2 == minutes2-minutes1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
