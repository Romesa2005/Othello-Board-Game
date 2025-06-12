package ca.utoronto.utm.assignment1.othello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is a class that constructs a player that will get the moves by asking in the console
 * 
 * @author arnold
 *
 */
public class PlayerHuman extends Player {
	
	private static final String INVALID_INPUT_MESSAGE = "Invalid number, please enter 1-8";
	private static final String IO_ERROR_MESSAGE = "I/O Error";
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Uses the super class constructor to inherit the constructor
	 */

	public PlayerHuman(Othello othello, char player) {

		super(othello, player);

	}
	/**
	 * get a move through overloading by using the getMove(string)
	 * @return move
	 */
	public Move getMove() {
		
		int row = getMove("row: ");
		int col = getMove("col: ");
		return new Move(row, col);
	}
	/**
	 * ask the player to input a number in controller. We use that number to get a move later.
	 * @param message
	 * @return int
	 */
	private int getMove(String message) {
		
		int move, lower = 0, upper = 7;
		while (true) {
			try {
				System.out.print(message);
				String line = PlayerHuman.stdin.readLine();
				move = Integer.parseInt(line);
				if (lower <= move && move <= upper) {
					return move;
				} else {
					System.out.println(INVALID_INPUT_MESSAGE);
				}
			} catch (IOException e) {
				System.out.println(INVALID_INPUT_MESSAGE);
				break;
			} catch (NumberFormatException e) {
				System.out.println(INVALID_INPUT_MESSAGE);
			}
		}
		return -1;
	}
}
