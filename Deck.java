import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

/**
 * ...
 */
public class Deck {

    private ArrayList<Card> cardDeck;


    /**
     * Creates a default card deck.
     */
    public Deck() {
        cardDeck = new ArrayList<>();

        for (int i = 0; i < 52; i++) {
            Card c = new Card(i);
            cardDeck.add(c);
        }
    }

    /**
     * Shuffles the card deck.
     */
    public void shuffle() { // FIXME
        Random rand = new Random();

        for (int i = 0; i < 52; i++) {
            int indexA = rand.nextInt(0, 52);
            int indexB = rand.nextInt(0, 52);

            Card cA = new Card(cardDeck.get(indexA).getCardNum());
            Card cB = new Card(cardDeck.get(indexB).getCardNum());

            cardDeck.remove(indexA);
            cardDeck.add(indexA, cB);
            cardDeck.remove(indexB);
            cardDeck.add(indexB, cA);
        }
    }

}
