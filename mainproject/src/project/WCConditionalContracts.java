package project;
import java.util.*;
import java.io.*;
public class WCConditionalContracts {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> maxnums = new ArrayList<Integer>();
		for (int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		int i=0;
		int groupvalue = 0;
		int temp = list.get(0);
		while(!list.isEmpty()) {
			if (list.get(i)==temp) {
				list.remove(i);
				groupvalue++;
				i=0;
			} else if (i==list.size()-1) {
				maxnums.add(groupvalue);
				groupvalue = 0;
				temp = list.get(0);
				i = 0;
			} else {
				i++;
			}
		}
		maxnums.add(groupvalue);
		if (maxnums.size()==1) {
			System.out.println(1);
		} else {
			System.out.println(maxnums.get(maxnums.size()-1)+maxnums.get(maxnums.size()-2));
		}
	}
}
