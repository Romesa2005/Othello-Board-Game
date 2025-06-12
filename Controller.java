package ca.utoronto.utm.assignment1.othello;

/**
 * This is an abstract class from where all the other controller classes will inherit
 * I made this class because almost all the Othello classes were using the same code for
 * the methods except for the contructor
 *
 * @author arnold
 *
 */
public abstract class Controller {
    protected Othello othello;
    protected Player player1;
    protected Player player2;

    /**
     * Constructs a new Controller with a new Othello game, ready to play
     */
    public Controller() {

        this.othello = new Othello();

    }
    /**
     * Plays the game between the 2 players and reports on the taken moves
     */
    public void play() {
        while (!othello.isGameOver()) {
            this.report();
            Move move = null;
            char whosTurn = othello.getWhosTurn();

            if (whosTurn == OthelloBoard.P1)
                move = player1.getMove();
            if (whosTurn == OthelloBoard.P2)
                move = player2.getMove();

            this.reportMove(whosTurn, move);
            othello.move(move.getRow(), move.getCol());
        }
        this.reportFinal();
    }

    /**
     * Reports the player's move by printing out a statement informing the
     * player on the coordinate in which the player moved
     * @param whosTurn P1 or P2
     * @param move
     */
    protected void reportMove(char whosTurn, Move move) {
        System.out.println(whosTurn + " makes move " + move + "\n");
    }

    /**
     * Gives a general report of how the Othello Board looks and informs which player will go next
     */
    protected void report() {

        String s = othello.getBoardString() + OthelloBoard.P1 + ":"
                + othello.getCount(OthelloBoard.P1) + " "
                + OthelloBoard.P2 + ":" + othello.getCount(OthelloBoard.P2) + "  "
                + othello.getWhosTurn() + " moves next";
        System.out.println(s);
    }
    /**
     * Gives a final report after the player would have made the move and shows the points for each player
     */
    protected void reportFinal() {

        String s = othello.getBoardString() + OthelloBoard.P1 + ":"
                + othello.getCount(OthelloBoard.P1) + " "
                + OthelloBoard.P2 + ":" + othello.getCount(OthelloBoard.P2)
                + "  " + othello.getWinner() + " won\n";
        System.out.println(s);
    }


}
