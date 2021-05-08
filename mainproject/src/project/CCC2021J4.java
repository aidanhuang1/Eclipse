package project;
import java.util.*;
import java.io.*;
public class CCC2021J4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String shelf = sc.next();
		int Lcount = 0, Mcount = 0;
		int swaps = 0;
		for (int i=0; i<shelf.length(); i++) {
			if (shelf.charAt(i)=='L') {
				Lcount++;
			} else if (shelf.charAt(i)=='M') {
				Mcount++;
			}
		}


		int Part1S = 0, Part1M = 0;
		for (int i=0; i<Lcount; i++) {
			if (shelf.charAt(i)=='S') {
				Part1S++;
			} else if (shelf.charAt(i)=='M') {
				Part1M++;
			}
		}

		int Part2L = 0, Part2S = 0;
		for (int i=Lcount; i<Lcount+Mcount; i++) {
			if (shelf.charAt(i)=='L') {
				Part2L++;
			} else if (shelf.charAt(i)=='S') {
				Part2S++;
			}
		}

		int Part3L = 0, Part3M = 0;
		for (int i=Lcount+Mcount; i<shelf.length(); i++) {
			if (shelf.charAt(i)=='L') {
				Part3L++;
			} else if (shelf.charAt(i)=='M') {
				Part3M++;
			}
		}
		//Part 1 swap with part 3
		if (Part1S!=0 && Part3L!=0) {
			if (Part1S==Part3L) {
				swaps+=Part1S;
				Part1S = 0;
				Part3L = 0;
			} else if (Part1S>Part3L) {
				swaps+=Part3L;
				Part1S-=Part3L;
				Part3L = 0;
			} else if (Part1S<Part3L) {
				swaps+=Part1S;
				Part3L-=Part1S;
				Part1S = 0;
			}
		}
		
//		Part 1 swap with Part 2
		if (Part1M!=0 && Part2L!=0) {
			if (Part1M==Part2L) {
				swaps+=Part1M;
				Part1M = 0;
				Part2L = 0;
			} else if (Part1M>Part2L) {
				swaps+=Part2L;
				Part1M-=Part2L;
				Part2L = 0;
			} else if (Part1M<Part2L) {
				swaps+=Part1M;
				Part2L-=Part1M;
				Part1M = 0;
			}
		}
		
		//Part 2 swap with Part 3
		if (Part2S!=0 && Part3M!=0) {
			if (Part2S==Part3M) {
				swaps+=Part2S;
				Part2S = 0;
				Part3M = 0;
			} else if (Part2S>Part3M) {
				swaps+=Part2S;
				Part2S-=Part3M;
				Part3M = 0;
			} else if (Part2S<Part3M) {
				swaps+=Part2S;
				Part3M-=Part2S;
				Part2S = 0;
			}
		}
		
		swaps += (Part1S+Part3L+Part1M+Part2L+Part2S+Part3M)/3*2;
		System.out.println(swaps);
	}
}


