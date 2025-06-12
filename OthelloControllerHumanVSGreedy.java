package ca.utoronto.utm.assignment1.othello;

/**
 * This controller uses the Model classes to allow the Human player P1 to play
 * the computer P2. The computer, P2 uses a greedy strategy. 
 * 
 * @author arnold
 *
 */
public class OthelloControllerHumanVSGreedy extends Controller{

	/**
	 * Constructs a new OthelloController with a new Othello game, ready to play
	 * with a Human player and Greedy Player
	 */
	public OthelloControllerHumanVSGreedy() {
		super();
		this.player1 = new PlayerHuman(this.othello, OthelloBoard.P1);
		this.player2 = new PlayerGreedy(this.othello, OthelloBoard.P2);
	}



	/**
	 * The computer uses a greedy strategy, that is, it picks the first
	 * move which maximizes its number of token on the board.
	 * @param args
	 */

	public static void main(String[] args) {
		OthelloControllerHumanVSGreedy oc = new OthelloControllerHumanVSGreedy();
		oc.play(); // this should work
	}
}
