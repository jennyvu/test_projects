package TicTacToeApplication;

public class TicTacToe {
	protected static char[] board;
	protected char userMarker;
	protected char aiMarker;
	protected char winner;
	protected char currentMarker;
	
	public TicTacToe(char playerToken, char aiMarker){
		this.userMarker = playerToken;
		this.aiMarker = aiMarker;
		this.winner = '-';
		this.currentMarker = playerToken;
		this.board = setBoard();
	}
	
	public static char[] setBoard(){
		char[] board = new char[9];
		for(int i = 0; i < 9; i++){
			board[i] = '-';
		}
		return board;
	}

	public boolean playTurn(int spot) {
		boolean isValid = withInRange(spot) && !isSpotTaken(spot);
		if (isValid) {
			board[spot -1] = currentMarker;
			currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;	
		}
		return isValid;
	}
	
	public boolean withInRange(int spot){
		return (spot > 0 || spot < board.length + 1);
	}
	
	public boolean isSpotTaken(int spot){
		return (board[spot -1] != '-');
	}
	
	public void printBoard(){
		System.out.println();
		for(int i = 0; i < 9; i++){
			if (i % 3 == 0 && i != 0) {
				System.out.println();
				System.out.println("-------------");
			}
			System.out.print(" | " + board[i]);
		}
		System.out.println();
	}
	
	public static void printIndexBoard() {
		System.out.println();
		for(int i = 0; i < board.length; i++){
			if (i % 3 == 0 && i != 0) {
				System.out.println();
				System.out.println("-------------");
			}
			System.out.print(" | " + (i + 1) );
		}
		System.out.println();
	}
	
	public boolean isTheBoardFilled() {
		for (int i = 0; i < board.length; i++) {
			if (board[i] == '-') {
				return false;
			}
		}
		return true;
	}
	
	public String gameOver() {
		boolean didSomeoneWin = isThereAWinner();
		if (didSomeoneWin) {
			return "We have a winner! The winner is " + this.winner + "'s.";
		} else if (isTheBoardFilled()) {
			return "Draw: Game over!";
		} else {
			return "notOver";
		}
	}
	
	public boolean isThereAWinner() {
		boolean diagonalsAndMiddles = 
				(rightDiag() || leftDiag () || midRow() 
				|| secondCol()) && board[4] != '-';
		boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
		boolean bottomAndThird = (bottomRow() || thirdCol()) && board[8] != '-';
		if (diagonalsAndMiddles) {
			this.winner = board[4];
		} else if (topAndFirst) {
			this.winner = board[0];
		} else if (bottomAndThird) {
			this.winner = board[8];
		}
		return diagonalsAndMiddles || topAndFirst || bottomAndThird;
	}
	
	private boolean rightDiag() {
		return board[2] == board[4] && board[4] == board[6];
	}
	
	private boolean leftDiag() {
		return board[0] == board[4] && board[4] == board[8];
	}
	
	private boolean midRow() {
		return board[3] == board[4] && board[4] == board[5];
	}
	
	private boolean secondCol() {
		return board[1] == board[4] && board[4] == board[7];
	}
	
	private boolean topRow() {
		return board[0] == board[1] && board[1] == board[2];
	}
	
	private boolean firstCol() {
		return board[0] == board[3] && board[3] == board[6];
	}
	
	private boolean bottomRow() {
		return board[6] == board[7] && board[7] == board[8];
	}
	
	private boolean thirdCol() {
		return board[3] == board[5] && board[5] == board[8];
	}
}
