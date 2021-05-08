package project;
import java.io.*;

public class Maxflow {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine()), max = 0;
			for (int j=0; j<N; j++) {
				max = Math.max(Integer.parseInt(br.readLine()), max);
			}
			System.out.println(max);
		}
	}

}
