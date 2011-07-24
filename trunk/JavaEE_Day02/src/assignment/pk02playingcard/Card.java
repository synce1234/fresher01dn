package assignment.pk02playingcard;

import java.util.List;
import java.util.Arrays;

/*
 * we'll play in VietNamese rule:
 * SPADE < CLUB < DIAMOND < HEART
 * 2 < 3 < 4 < ... < 10 < J < Q < K < A
 */

public class Card {

    //
    // private String[] rankArrayFull = { "Two", "Three", "Four", "Five", "Six",
    // "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };

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
    // private int[] suitSymbolIndexInUnicode = { 9824, 9827, 9830, 9829 };
    private String suit = "SPADE";
    private String rank = "2";

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

    public Card() {
    }

    public Card(int rankInt, int suitInt) {
        this.suit = suitArray[suitInt];
        this.rank = rankArray[rankInt];
    }

    public void generateRandomCard() {
        int randomSuitIndex = (int) (4 * Math.random());
        int randomRankIndex = (int) (13 * Math.random());

        this.suit = suitArray[randomSuitIndex];
        this.rank = rankArray[randomRankIndex];
    }

    public String toString() {
        String str = "";
        str = str + this.rank + "-" + this.suit;
        return str;
    }

    public boolean isGreaterThan(Card c) {
        if (rankList.indexOf(this.rank) > rankList.indexOf(c.getRank())) {
            return true;
        } else {
            if ((rankList.indexOf(this.rank) == rankList.indexOf(c.getRank()))
                    && (suitList.indexOf(this.suit) > suitList.indexOf(c
                            .getSuit()))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Card c1 = new Card();
        c1.generateRandomCard();
        Card c2 = new Card();
        c2.generateRandomCard();
        if (c1.isGreaterThan(c2)) {
            System.out.println(c1.toString() + " is greater than " + c2.toString());
        } else {
            System.out.println(c2.toString() + " is greater than " + c1.toString());
        }
        
    }
}
