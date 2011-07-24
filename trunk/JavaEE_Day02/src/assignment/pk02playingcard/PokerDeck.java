package assignment.pk02playingcard;

import assignment.pk02playingcard.FullDeck;

public class PokerDeck extends FullDeck {
    private Card[] cards = new Card[5];

    public PokerDeck() {
        for (int i = 0; i < 5; i++) {
            cards[i] = new Card();
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
        //TODO sắp xếp lại 1 cỗ bài poker 5 lá
    }
    
    public boolean isGreaterThan(PokerDeck pd2) {
     // TODO so sánh 2 bộ bài poker vào đây
        // Royal Flush thùng phá sảnh xì
        // Straight Flush thùng phá sảnh
        // Four of a Kind tứ quý
        // Full House cù lũ
        // Flush thùng
        // Straight sảnh
        // Three of a kind sám cô
        // Two Pair 2 phé
        // One Pair 1 phé
        // High Card mậu thầu
        return false;
    }

    public static void main(String[] args) {
        PokerDeck pd = new PokerDeck();
        System.out.println(pd.toString());
    }
}
