/**
 * Assignment 2: Playing cards
 */
package assignment.pk02playingcard;

import assignment.pk02playingcard.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Print out to console all card in a deck");
        FullDeck fd = new FullDeck();
        System.out.println(fd.toString());

        System.out.println("Draw 5 random cards like in poker game");
        PokerDeck pokerDeck = new PokerDeck();
        System.out.println("Your poker deck is: ");
        System.out.println(pokerDeck.toString());
        System.out.println("Your poker arrangeed poker deck is:");
        pokerDeck.arrange();
        System.out.println(pokerDeck.toString());
    }

}
