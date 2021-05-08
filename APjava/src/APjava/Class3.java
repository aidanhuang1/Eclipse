package APjava;
import java.util.Scanner;
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the year: ");
		int year = sc.nextInt();
		if (year%4==0) {
			System.out.println(year+" is a leap year");
		} else {
			System.out.println(year+" is not a leap year");

		}
		
		System.out.println("input the month: ");
		int month = sc.nextInt();
        String monthName;
        int days = 0;
		switch (month) {
        case 1:
            monthName = "January";
            days = 31;
            break;
        case 2:  
            monthName = "February";
            days = 29;
            break;
        case 3:  
        	monthName = "March";
        	days = 31;
            break;
        case 4:  
        	monthName = "April";
        	days = 30;
                 break;
        case 5:  
        	monthName = "May";
        	days = 31;
                 break;
        case 6:  
        	monthName = "June";
        	days = 30;
                 break;
              
        case 7: 
        	monthName = "July";
        	days = 31;
                 break;
        case 8:  
            monthName = "August";
            days = 31;
            break;
        case 9:  
            monthName = "September";
            days = 30;
            break;
        case 10: 
        	monthName = "October";
        	days = 31;
                 break;
        case 11: 
        	monthName = "November";
        	days = 30;
                 break;
        case 12: 
        	monthName = "December";
        	days = 31;
                 break;
        default: 
            monthName = "Invalid month";
            break;
    }
		
    System.out.println(monthName+" of "+year+" has "+days+" days");

	}

}
