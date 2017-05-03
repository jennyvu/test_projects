package TicTacToeApplication;

import java.util.Scanner;

public class TicTacToeApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean doYouWantToPlay = true;
		while(doYouWantToPlay) {
			System.out.println("Welcom to TicTacToe! You are going to play" +
		"against the master of TicTacToe. Are you ready\n" +
					"First, you must pick the character you will be" +
		"then, which character I will be");
			System.out.println();
			System.out.println("Enter character that represent you: ");
			char playerToken = sc.next().charAt(0);
			System.out.println("Enter character that represent your opponent: ");
			char opponentToken = sc.next().charAt(0);
			TicTacToe game = new TicTacToe(playerToken, opponentToken);
			AI ai = new AI();
			// set up the game
			System.out.println();
			System.out.println("Now we can start the game. Enter a number and your token " +
			"will be placed ond board.\n The number goes from 1-9, left to right. We shall see who will win the game.");
			TicTacToe.printIndexBoard();
			System.out.println();
			// Let start
			while(game.gameOver().equals("notOver")) {
				if (game.currentMarker == game.userMarker) {
					System.out.println("It's your turn, enter spot for your token: ");
					int spot = sc.nextInt();
					while(!game.playTurn(spot)) {
						System.out.println("Your input invalid, please try again: ");
						spot = sc.nextInt();
					}
					System.out.println("You picked " + spot + "!");
				} else {
					// ai turns
					System.out.println("It's my turn!");
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println("I picked " + aiSpot + "!");
				}
				System.out.println("Current board.");
				game.printBoard();
			}
			System.out.println(game.gameOver());
			System.out.println();
			// if want to start new game.
			System.out.println("Enter y to play agains, enter something else to quit: ");
			char resp = sc.next().charAt(0);
			doYouWantToPlay = (resp == 'y');
			game.printBoard();
			game.printBoard();
		}

	}

}
