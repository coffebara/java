package Ex7_practice;

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

	SutdaDeck2() {
		for (int i = 0; i < CARD_NUM; i++) {
			if (i < 10 && (i == 0 || i == 2 || i == 7)) {
				cards[i] = new SutdaCard2(i + 1, true);
			} else if (i < 10) {
				cards[i] = new SutdaCard2(i + 1, false);
			} else {
				cards[i] = new SutdaCard2((i % 10) + 1, false);
			}
		}
	}

	public void shuffle() {
		// todo 배열 cards에 담긴 카드의 위치를 뒤섞는다.
		SutdaCard2 c= new SutdaCard2();
		int tmpN = 0;
		for (int i = 0; i < cards.length; i++) {
			tmpN = (int) (Math.random() * 20);
			c= cards[i];
			cards[i] = cards[tmpN];
			cards[tmpN] = c;
		}
	}

	public SutdaCard2 pick() {
		int tmpN = (int) (Math.random() * 20);
		return cards[tmpN];
	}

	public SutdaCard2 pick(int index) {

		return cards[index];
	}
} // SutdaDeck

class SutdaCard2 {
	int num;
	boolean isKwang;

	SutdaCard2() {
		this(1, true);
	}

	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_2 {
	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();

		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");

		System.out.println();
		System.out.println(deck.pick(0));
	}
}
