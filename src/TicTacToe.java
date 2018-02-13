import java.util.*;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		//For Scanner
		Scanner scan = new Scanner(System.in);
		//Variables
		String[] board = new String[9];
		int win = 0;		
		int change, change2;

		//Reset Board
		board[0] = "1";
		board[1] = "2";
		board[2] = "3";
		board[3] = "4";
		board[4] = "5";
		board[5] = "6";
		board[6] = "7";
		board[7] = "8";
		board[8] = "9";
		
		//Allow User to choose game piece
		String gamePiece = "e";		
		String computerPiece;
		do {	
			System.out.println("Choose your game piece (X or O):");
			gamePiece = scan.nextLine();
		} while (!gamePiece.contentEquals("X") && !gamePiece.contentEquals("O"));
		if (gamePiece.contentEquals("X")) {
			computerPiece = "O";
		} else {
			computerPiece = "X";
		}
		do {
			display(board);
			do {
				do{
					System.out.print("Choose a number: ");
					change = scan.nextInt();
					change = (change - 1);
				} while (change >=8 && change <=0);
			} while ((board[change] == "X" && board[change] == "O"));
		board[change] = gamePiece;
		
		//Check for win
		win = check(board);
		
		//Play computer
		change = computer(board);
		
		win = check(board);
		board[change] = computerPiece;
		} while (win == 0);
		System.out.println("Game over");
		System.exit(0);
	}
	
	//Computer
	private static int computer(String board[]){
		int change;
		do {
			do{
				int random = (int)(Math.random() * 9 +1);
				change = random;
				System.out.println(change);
			} while (change >=8 || change <=0);
		} while ((board[change] == "X" && board[change] == "O"));
		return change;
	}

	
	
	//Check for a win
	private static int check(String board[]){
		int value = 0;
		if (board[0]== board[1] && board[1] == board[2]) {
			value = 1;
		} else if (board[3] == board[4] && board[4] == board[5]) {
			value = 1;
		} else if (board[6] == board[7] && board[7] == board[8]) {
			value = 1;
		} else if (board[0] == board[4] && board[4] == board[8]) {
			value = 1;
		} else if (board[8] == board[4] && board[4] == board[0]) {
			value = 1;
		} else {
			value = 0;
		}
		
		return value;
	}

	//Display the board
	private static void display(String board[]) {
		System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("---------");
		System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("---------");
		System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
		System.out.println("---------");

	}
}
