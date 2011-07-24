/**
 * Assignment 2: Playing cards
 */
package assignment.pk02playingcard;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        PokerDeck deck = new PokerDeck();

        System.out.println("Your deck is: ");
        System.out.println(deck.toString());
    }

}
