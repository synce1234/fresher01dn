package assignment.pk02playingcard;

import java.util.List;
import java.util.Arrays;

/*
 * we'll play in VietNamese rule:
 * SPADE < CLUB < DIAMOND < HEART
 * 2 < 3 < 4 < ... < 10 < J < Q < K < A
 */

public class Card {

    private String[] rankArray = { "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "J", "Q", "K", "A" };
    private String[] suitArray = { "SPADE", "CLUB", "DIAMOND", "HEART" };

    private List<String> rankList = Arrays.asList(rankArray);
    private List<String> suitList = Arrays.asList(suitArray);
    /*
     * trong bảng mã Unicode
     * 9824 9829 9830 9827
     * ♠ ♥ ♦ ♣
     */
    private String suit = "";
    private String rank = "";
    private int cardValue = 0;

    /**
     * @return the cardValue
     */
    public int getCardValue() {
        return cardValue;
    }

    /**
     * @param cardValue
     *            the cardValue to set
     */
    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank
     *            the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit
     *            the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * construct a new card with random rank and suit.
     */
    public Card() {
        int randomSuitIndex = (int) (4 * Math.random());
        int randomRankIndex = (int) (13 * Math.random());

        this.suit = suitArray[randomSuitIndex];
        this.rank = rankArray[randomRankIndex];

        this.setCardValue((rankList.indexOf(this.rank) + 1) * 10
                + (suitList.indexOf(this.suit) + 1));
    }

    /**
     * construct a new card with rank and suit in number
     * @param rankInt
     * @param suitInt
     */
    public Card(int rankInt, int suitInt) {
        this.suit = suitArray[suitInt];
        this.rank = rankArray[rankInt];
        this.setCardValue((rankInt + 1) * 10 + (suitInt + 1));
    }

    @Override
    public String toString() {
        String str = "";
        str = str + this.rank + "-" + this.suit;
        return str;
    }

    public boolean isGreaterThan(Card c) {
        if (this.getCardValue() > c.getCardValue()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();
        if (c1.isGreaterThan(c2)) {
            System.out.println(c1.toString() + " is greater than "
                    + c2.toString());
        } else {
            System.out.println(c2.toString() + " is greater than "
                    + c1.toString());
        }

    }

}
