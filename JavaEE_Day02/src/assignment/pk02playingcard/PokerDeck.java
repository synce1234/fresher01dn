package assignment.pk02playingcard;

import assignment.pk02playingcard.FullDeck;

public class PokerDeck extends FullDeck {
    private Card[] cards = new Card[5];

    private int pokerRanking = 0;

    @SuppressWarnings("unused")
    private void setPokerRanking(int pokerRanking) {
        this.pokerRanking = pokerRanking;
    }

    public int getPokerRanking() {
        return pokerRanking;
    }

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

    /**
     * sắp xếp lại 1 cỗ bài poker 5 lá
     */

    public void arrange() {
        Card temp = new Card();
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (cards[i].getCardValue() > cards[j].getCardValue()) {
                    temp.setRank(cards[i].getRank());
                    temp.setSuit(cards[i].getSuit());
                    cards[i].setRank(cards[j].getRank());
                    cards[i].setSuit(cards[j].getSuit());
                    cards[j].setRank(temp.getRank());
                    cards[j].setSuit(temp.getSuit());
                }
            }
        }
    }

    public boolean isGreaterThan(PokerDeck pd2) {
        // TODO so sánh 2 bộ bài poker vào đây
        // 9 Royal Flush thùng phá sảnh xì
        // 8Straight Flush thùng phá sảnh
        // 7Four of a Kind tứ quý
        // 6Full House cù lũ
        // 5Flush thùng
        // 4Straight sảnh
        // 3Three of a kind sám cô
        // 2Two Pair 2 phé
        // 1One Pair 1 phé
        // 0 High Card mậu thầu
        if(this.getPokerRanking() > pd2.getPokerRanking()){
            return true;
        } else {
            return false;
        }
    }

    private void calculatePokerRank() {
        
    }
    public static void main(String[] args) {
        PokerDeck pd = new PokerDeck();
        System.out.println("Chơi poker, rút 5 lá bài...");
        System.out.println("5 lá bài chưa sắp xếp: ");
        System.out.println(pd.toString());
        System.out.println("5 lá bài được sắp xếp tăng dần: ");
        pd.arrange();
        System.out.println(pd.toString());

    }
}
