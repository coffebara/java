package java0612;

class Bag<T> {
	// 클래스 이름 다음에 <T>를 지정하여 Bag를 젲네릭 클래스로 선언한다.
	// Bag 선언된 모든 T는 인스턴스 생성 시 전달되는 타입으로 대체하다.
	// 타입 매개변수로 전달되는 값을 타입 인자라고 한다.
	private T thing;

	// Bag<T> 클래스 내에서만 사용할 수 있게 지정
	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " +thing.getClass().getName());
	}
}
