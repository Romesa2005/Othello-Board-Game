package ca.utoronto.utm.assignment1.othello;

/**
 * This is an abstract class from where all the other player classes will inherit
 * I made this class because the construtcor was the same for all classes
 *
 * @author arnold
 *
 */
public abstract class Player {
    protected Othello othello;
    protected char player;

    /**
     * Constructs a new Player with a new Othello game, and a character representing the Player
     */
    protected Player (Othello othello, char player) {

        this.othello = othello;
        this.player = player;
    }

    /**
     * An abstract method that gives structure to the player class. All inherited classes
     * will override this method
     * @return move
     */
    public Move getMove() {
        return (null);
    }
    }
