package assignment.pk02playingcard;

import assignment.pk02playingcard.Card;

public class FullDeck {
	private Card[] cards = new Card[52];

	public FullDeck() {
		int i = 0; // i= [1..52]
		for (int j = 0; j < 13; j++) { // 13 rank (cấp)
			for (int k = 0; k < 4; k++) { // 4 suit (chất)
				cards[i] = new Card(j, k);
				i++;
			}
		}
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < 52; i++) {
			str = str + cards[i].toString() + " ";
			if ((i % 4) == 3) {
				str = str + "\n";
			}
		}
		return str;
	}

	/**
	 * dùng để test cái toString();
	 * @param args
	 */
	public static void main(String[] args) {
		FullDeck fd = new FullDeck();
		System.out.println(fd.toString());
	}

}
