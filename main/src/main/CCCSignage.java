package main;
import java.util.*;
public class CCCSignage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(), index = 0;
		String[] message = new String[] {"WELCOME", "", "TO", "", "CCC", "", "GOOD", "", "LUCK", "", "TODAY", "", ""};
		boolean done = false;
		while(!done) {
			int spacesleft = w;
			ArrayList<String> row = new ArrayList<String>();

			while(true) {
				if (message[index].length()<=spacesleft && index<=10) {
					row.add(message[index]);
					spacesleft-=message[index].length();
					index++;
					row.add(".");
					spacesleft--;
					index++;
				} else { 					
					row.remove(row.size()-1);
					spacesleft++;		
					if (row.size()==1) {
						for (int i=0; i<spacesleft; i++) {
							row.add(".");
						}
						spacesleft = 0;
					}			
					while(true) {	
						if (spacesleft==0) { 
							for (int j=0; j<row.size(); j++) {
								System.out.print(row.get(j));
							}
							System.out.println();
							break;
						} else { 
							boolean dot = false;
							for (int j=0; j<row.size(); j++) {
								if (spacesleft==0) {	
									break;
								} else if (row.get(j)=="." && spacesleft!=0 && !dot) {
									row.add(j, ".");
									spacesleft--;
									dot = true;
								} else if (row.get(j)!=".") {
									dot = false;
								} 
							}
						}
					}
					break;
				}
			}
			if (index>=11) {
				done = true;
				break;
			}
		}
	}
}


