package project;

import java.util.*;
import java.io.*;
public class CCCSurmisingaSprintersSpeed {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Double, Double> map = new HashMap<Double, Double>();
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			String[] a = br.readLine().split(" ");
			map.put(Double.parseDouble(a[0]), Double.parseDouble(a[1]));
		}
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);
		double max = 0;
		for (int i=0; i<n-1; i++) {
			max = Math.max(max, Math.abs(map.get(keys[i+1])-map.get(keys[i]))/((Double)keys[i+1]-(Double)keys[i]));
		}
		System.out.println(max);

	}
}