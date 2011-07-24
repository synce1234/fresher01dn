package assignment.pk02playingcard;

import assignment.pk02playingcard.FullDeck;

public class PokerDeck extends FullDeck {
    private Card[] cards = new Card[5];

    public PokerDeck() {
        for (int i = 0; i < 5; i++) {
            cards[i] = new Card();
            cards[i].generateRandomCard();
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str = str + cards[i].toString() + " ";
        }
        return str;
    }
    
    public void arrange() {
        
    }
    
    public boolean isGreaterThan(PokerDeck pd2) {
     // TODO Viết code so sánh 2 bộ bài poker vào đây
        return false;
    }

    public static void main(String[] args) {
        PokerDeck pd = new PokerDeck();
        System.out.println(pd.toString());
    }
}
