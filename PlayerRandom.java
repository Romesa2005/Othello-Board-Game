package ca.utoronto.utm.assignment1.othello;

import java.util.ArrayList;
import java.util.Random;

/**
 * PlayerRandom makes a move by first determining all possible moves that this
 * player can make, putting them in an ArrayList, and then randomly choosing one
 * of them.
 * 
 * @author arnold
 *
 */

public class PlayerRandom extends Player {
	private Random rand = new Random();

	/**
	 * Uses the super class constructor to inherit the constructor
	 */
	public PlayerRandom(Othello othello,char player) {
		super(othello, player);
	}

	/**
	 * get a move that is random chosen coordinate from the possible moves
	 * @return move
	 */
	public Move getMove() {
		OthelloBoard board = this.othello.getBoard();
		ArrayList<Move> possible_points = new ArrayList<>();
		for (int row = 0; row < Othello.DIMENSION; row++) {
			for (int col = 0; col < Othello.DIMENSION; col++){
				if (board.helperforrandom(row,col,this.player)){
					possible_points.add(new Move(row,col));
				}
			}
		}
		return possible_points.get(rand.nextInt(possible_points.size()));

	}
}
