package archived;
//package assignment.pk02playingcard;
//
//enum Suit {
//    HEART, DIAMOND, CLUB, SPADE
//}
//
//enum Rank {
//    Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
//}
//
///*
// * we'll play in VietNamese rule:
// * SPADE < CLUB < DIAMOND < HEART
// * 2 < 3 < 4 < ... < 10 < J < Q < K < A
// */
//
//public class Card {
//
//    //
//    private String[] rankArrayFull = { "Two", "Three", "Four", "Five", "Six",
//            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
//    private String[] rankArray = { "2", "3", "4", "5", "6", "7", "8", "9",
//            "10", "J", "Q", "K", "A" };
//    private String[] suitArray = {"HEART", "DIAMOND", "CLUB", "SPADE"};
//
//    //
////    private Rank rank = Rank.Two;
////    private Suit suit = Suit.SPADE;
//
//    public Suit getSuit() {
//        return suit;
//    }
//
//    public void setSuit(Suit suit) {
//        this.suit = suit;
//    }
//
//    public void generateRandomCard() {
//        this.setRank((int) (Math.random() * 13));
//        int suitLevel = (int) (Math.random() * 4);
//        switch (suitLevel) {
//            case 0:
//                this.setSuit(Suit.valueOf("SPADE"));
//                break;
//            case 1:
//                this.setSuit(Suit.valueOf("CLUB"));
//                break;
//            case 2:
//                this.setSuit(Suit.valueOf("DIAMOND"));
//                break;
//            case 3:
//                this.setSuit(Suit.valueOf("HEART"));
//                break;
//        }
//    }
//
//    public Card() {
//
//    }
//
//    /**
//     * 
//     * @param rank
//     * @param suitParam
//     */
//    public Card(int rank, int suitParam) {
//        switch (rank) {
//            case 0:
//                this.setRank(Rank.Two);
//                break;
//            case 1:
//                this.setRank(Rank.Three);
//                break;
//            case 2:
//                this.setRank(Rank.Four);
//                break;
//            case 3:
//                this.setRank(Rank.Five);
//                break;
//            case 4:
//                this.setRank(Rank.Six);
//                break;
//            case 5:
//                this.setRank(Rank.Seven);
//                break;
//            case 6:
//                this.setRank(Rank.Eight);
//        }
//        switch (suitParam) {
//            case 0:
//                this.suit = Suit.SPADE;
//                break;
//            case 1:
//                this.suit = Suit.CLUB;
//                break;
//            case 2:
//                this.suit = Suit.DIAMOND;
//                break;
//            case 3:
//                this.suit = Suit.HEART;
//                break;
//        }
//    }
//
//    public String toString() {
//        String str = "";
//        String rankString = "";
//        switch (getRank()) {
//            case 0:
//                rankString = "A";
//                break;
//            case 10:
//                rankString = "J";
//                break;
//            case 11:
//                rankString = "Q";
//                break;
//            case 12:
//                rankString = "K";
//                break;
//            default:
//                rankString = String.valueOf(this.getRank());
//                break;
//        }
//        String suitLevelString = String.valueOf(this.suit.toString());
//        str = str + rankString + "-" + suitLevelString;
//
//        return str;
//    }
//
//    public static void main(String[] args) {
//        Card c1 = new Card(0, 0);
//        Card c2 = new Card(0, 1);
//        Card c3 = new Card(0, 2);
//        Card c4 = new Card(0, 3);
//        System.out.println(c1.toString());
//        System.out.println(c2.toString());
//        System.out.println(c3.toString());
//        System.out.println(c4.toString());
//    }
//
//    /**
//     * @return the rank
//     */
//    public Rank getRank() {
//        return rank;
//    }
//
//    /**
//     * @param rank
//     *            the rank to set
//     */
//    public void setRank(Rank rank) {
//        this.rank = rank;
//    }
//
//    public void setRank(int rank) {
//
//    }
//}
