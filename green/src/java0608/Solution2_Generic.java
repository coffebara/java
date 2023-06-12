package java0608;

class Apple{
	@Override
	public String toString() {
		return "애플오브젝트입니다";
	}
}
class Pencil {
	@Override
	public String toString() {
		return "연필오브젝트입니다";
	}
}

class Goods <T>{//일반화
	private T t;
	
	public T get() {
		return t;		
	}
	public void set(T t) {
		this.t = t;
	}
}

public class Solution2_Generic {
	public static void main(String[] args) {
		//#1. Goods을 통해서 Apple 객체 추가 및 가져오기
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get(); // 다운캐스팅 필요 없음
		System.out.println(apple); // goods1에서 Apple 객체를 가져옵니다.
		
		//#2. Goods을 통해서 Pencil 객체 추가 및 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
		System.out.println(pencil);	// Pencil 객체 출력
		
		//#3. 잘못된 타입선언
		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
//		Pencil pencil2 = goods3.get(); //강한타입체크
	}//toString 메서드가 오버라이드되지 않았기 때문에 나오는 결과 값입니다
}//toString 메서드는 클래스 이름, @ 기호,
// 그리고 객체의 해시코드 16진수로 표현한 값을 반환

