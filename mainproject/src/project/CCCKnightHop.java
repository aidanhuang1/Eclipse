package project;
import java.util.*;
import java.io.*;
public class CCCKnightHop {
	
	//In the 2D array, look at all the possible squares where the knight can go to
	//We put those into a queue
	//As we look through the queue, we check to see if the square is the square we want to go to.
	//If not, we look at all the squares that are reachable from there and add them to the queue.

	//How do we know if we are able to go to that square?
	//We look at all the squares a knight can hop to in a L-shape unrestrictedly, meaning we can
	//rotate clockwise through all of the 8 squares and check each one if we can go to that square.
	//Looking at the coordinates, we must make sure it is within the 8x8 board and it has not been hopped to already
	//Otherwise we don't add it to the queue.
	//We create a queue for the x coordinate and a queue for the y coordinate

	public static int moves = 0;
	public static boolean[][] board = new boolean[8][8];
	public static int possiblemoves[][] = {{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1},{-2,1},{-1,2}};

	public static int BFS(int startx, int starty, int endx, int endy) {
		Queue<Integer> queueX = new LinkedList<>();
		Queue<Integer> queueY = new LinkedList<>();
		queueX.add(startx);
		queueY.add(starty);
		board[startx][starty] = true;
		while (!queueX.isEmpty() && !queueY.isEmpty()) {
			int size = queueX.size();
			for (int i=0; i<size; i++) {
				int X = queueX.poll();
				int Y = queueY.poll();
				board[X][Y] = true;
				if (X==endx && Y==endy) {
					return moves;
				}
				for (int j=0; j<possiblemoves.length; j++) {
					int tempX = X+possiblemoves[j][0];
					int tempY = Y+possiblemoves[j][1];
					if (tempX>=0 && tempX<=7 && tempY>=0 && tempY<=7) {
						if (!board[tempX][tempY]) {
							queueX.add(tempX);
							queueY.add(tempY);					

						}
					}
				}
			}
			moves++;
		}
		return moves;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(BFS(sc.nextInt()-1,sc.nextInt()-1,sc.nextInt()-1,sc.nextInt()-1));

	}

}
