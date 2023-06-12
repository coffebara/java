package Ex7_practice;

class Product {
	int price;
	int bonusPoint;

	Product(){
		
	}
	Product(int price){
		this.price = price;
		this.bonusPoint =  (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super();
	}

	public String toString() {
		return "TV";
	}
}

public class Ex7_3 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}

// 자식 클래스의 인스턴스를 생성할 때 먼저 부모 클래서가 생성이 되어야 한다.
// 따라서 자식 클래스의 생성자 메서드에서 부모 클래스의 생성자 메서드를 실행시켜야 하며
// 부모 클래스의 생성자 메서드가 기본 생성자 메서드 없이 오버라이드 되어 있을 경우 기본 생성자를 추가 시켜주어야 한다.