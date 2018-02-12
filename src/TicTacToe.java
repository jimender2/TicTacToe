
public class TicTacToe {

	public static void main(String[] args) {
		String[] board = new String[9];
		int win = 0;
		board[0] = "1";
		board[1] = "2";
		board[2] = "3";
		board[3] = "4";
		board[4] = "5";
		board[5] = "6";
		board[6] = "7";
		board[7] = "8";
		board[8] = "9";
		
		display(board);
		
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
