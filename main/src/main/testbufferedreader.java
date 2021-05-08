package main;
import java.io.*;
import java.util.*;

public class testbufferedreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		System.out.println(a);
		System.out.println(b);
	}

}
