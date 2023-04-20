public class Card {

    private String[] suites = {"Clubs", "Spades", "Hearts", "Diamonds"};
    private String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King"};

    private String suite;
    private String value;
    private int cardNum;

    public Card(int cardNum) {
        // Assigns numbers 0-51 to a unique card
    }

    public String getSuite() {
        //...
        return suite;
    }

    public String getValue() {
        //...
        return value;
    }

    public int getCardNum() {
        return cardNum;
    }

    public char getColor() {
        if (getSuite().equals("Heart") || getSuite().equals("Diamond")) {
            return 'R';
        }
        else {
            return 'B';
        }
    }

    /**
     * Checks whether the card should be printed face down or face up.
     * @return true if the card is visible to the player
     */
    public boolean isVisibile() {
        return true; // STUB
    }

    @Override
    public String toString() {
        return getValue() + " of " + getSuite();
    }
}
