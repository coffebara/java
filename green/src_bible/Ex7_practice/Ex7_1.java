package Ex7_practice;

//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 
//섯다카드 20장을 담는 SutdaCard배열을 초기화 하시오. 단 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있고, 
//숫자가 1,3,8인 경우에는 둘 중의 한장은 광(Kwang)이어야 한다. 즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 한다.
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < CARD_NUM; i++) {
			if(i<10 && (i==0 || i == 2 || i ==7)) {
				cards[i] = new SutdaCard(i+1,true);
			} else if(i<10) {
				cards[i] = new SutdaCard(i+1,false);
			} else {
				cards[i] = new SutdaCard((i%10)+1,false);
			}
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info() 대신 Object클래스의 toString()을 오버라이딩 했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();

		for (int i = 0; i < deck.cards.length; i++) {
			System.out.println(deck.cards[i] + ",");
		}
	}
}
