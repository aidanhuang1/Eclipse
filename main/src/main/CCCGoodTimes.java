package main;
import java.util.Scanner;
public class CCCGoodTimes {
	
	public static int over2400 (int time) {
		if (time>2400) {
			time = (time-2400);
		}
		return time;
	}
	public static int below0 (int time) {
		if (time<0) {
			time = (2400+time);
		}
		return time;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int originaltime = sc.nextInt();
		//ottawa
		System.out.println(originaltime+" in Ottawa");
		//victoria
		int time = (originaltime-300);
		below0(time);
		System.out.println(time + " in Victoria");
		//Edmonton
		time = (time+100);
		over2400(time);
		System.out.println(time + " in Edmonton");
		//Winnipeg
		time = (time+100);
		over2400(time);
		//Toronto
		System.out.println(originaltime + " in Toronto");
		//Halifax
		time = (time+200);
		over2400(time);
		//St. John's
		time = (time+30);
		if (time%100>59) {
			int a = time%100-61;
			time = ((time-time%100)+1)+a;
		}
		over2400(time);
		System.out.println(time + " in St. John's");
	}

}
