import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		//For Scanner
		Scanner scan = new Scanner(System.in);
		
		//Variables
		String[] board = new String[9];
		int win = 0;		
		int change;

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
		String gamePiece;		
		do {
			System.out.println("Choose your game piece (X or O):");
			gamePiece = scan.nextLine();
		} while (gamePiece == "X" || gamePiece == "O");
		
		do {
			display(board);
			do {
				System.out.print("Choose a number: ");
				change = scan.nextInt();
			} while (board[change] == "X" || board[change] == "O");
		board[change] = gamePiece;
		} while (win == 0);
	}
	
	private static int check(String board[]){
		int value = 0;
		if (board[0]== board[1] && board[1] == board[2]) {
		
			
		}
		return value;
	}

	private static void display(String board[]) {
		System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("---------");
		System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("---------");
		System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
		System.out.println("---------");

	}
}
