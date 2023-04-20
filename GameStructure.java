import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * May be merged into the GameLoop class, but is currently left separate for ideation stage.
 */

public class GameStructure {

    // The initial card deck
    private Deck cardDeck;

    // The seven columns
    private LinkedList[] columns;
    private LinkedList<Card> zero;
    private LinkedList<Card> one;
    //... and so on to 6

    // The four foundations
    private Card[] clubs;
    private Card[] hearts;
    private Card[] diamonds;
    private Card[] spades;

    // The playable deck
    private Queue<Card> playableDeck;

    /**
     * Initializes everything to default conditions and makes the game ready for the player.
     */
    public GameStructure() {
        columns = new LinkedList[7];
        playableDeck = null;

        for (int i = 0; i < 7; i++) {
            // Adds the linked lists to the array
        }

    }

    /**
     * Returns the bottommost card found in a column
     * @param column
     * @return
     */
    public Card getBottom(int column) {
        Card c = new Card(0);
        return c; // STUB
    }

    /**
     * Returns the stack of cards in the specified column up to the specified index.
     * @param column
     * @return
     */
    public LinkedList<Card> getStack(int column, int index) {
        LinkedList<Card> lc = new LinkedList<>();
        return lc;
    }
}
