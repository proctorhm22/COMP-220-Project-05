
/**
 * Runs through the repetitive game motions.
 */

public class GameLoop {

    /**
     * Continues to loop until user quits, no valid moves remain, or player wins.
     */
    public static void gameLoop() {
        while (true) {
            //...
        }
    }

    /**
     * Move Option 1
     * Drawing a new card from the available deck.
     */
    public void drawCard() {
        //...
    }

    /**
     * Move Option 2
     * Moves a specified card (and following cards) to a new column.
     * @param cardIndex
     * @param col
     */
    public void moveTo(int cardIndex, int col) {
        //...
    }

    /**
     * Move Option 3
     * Moves the top card in the given column to the appropriate foundation.
     * @param col
     */
    public void toFoundation(int col) {
        //...
    }

    /**
     * Shows the available player input options given the move type
     * @param moveType
     */
    public void getOptions(int moveType) {
        //...
    }

    /**
     * Decides whether or not a move is valid
     */
    public void validityCheck(int moveType) {
        // ...
    }

    /**
     * Decides whether or not to end the gameLoop
     * @return true if a valid move is possible
     */
    public boolean movesRemaining() {
        return true; // STUB
    }

    /**
     * Prints the 'board' as it stands after each move
     */
    public static void printGameBoard() {
        //...
    }
}
