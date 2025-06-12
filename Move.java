package ca.utoronto.utm.assignment1.othello;

/**
 * The Move class represents a move in the game of Othello.
 * It stores the row and column index of a position on the board.
 * This class is immutable after construction.
 *
 * @author arnold
 */
public class Move {
	// The row and column indices of the move
	private int row, col;

	/**
	 * Constructs a Move with the given row and column.
	 *
	 * @param row The row index of the move
	 * @param col The column index of the move
	 */
	public Move(int row, int col) {
		this.row = row;
		this.col = col;
	}

	/**
	 * Returns the row index of the move.
	 *
	 * @return the row index
	 */
	public int getRow() {
		return row;
	}

	/**
	 * Returns the column index of the move.
	 *
	 * @return the column index
	 */
	public int getCol() {
		return col;
	}

	/**
	 * Returns a string representation of the move in the format (row,col).
	 *
	 * @return a string describing the move
	 */
	@Override
	public String toString() {
		return "(" + this.row + "," + this.col + ")";
	}
}
