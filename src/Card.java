public class Card {
    private int value;
    private String suit;
    private boolean faceUp;

    public Card(int value, String suit, boolean faceUp) {
        this.value = value;
        this.suit = suit;
        this.faceUp = faceUp;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }
}
