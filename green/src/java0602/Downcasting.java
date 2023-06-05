package java0602;

//다운캐스팅 : 자식 클래스의 타입으로 부모 클래스의 객체를 참조하는 것
//다운캐스팅은 기본적으로 업캐스팅된 객체에만 적용 가능하며,
//이를 통해 자식 클래스의 필드와 메소드에 접근한다. 명시적으로 타입변환을 해야한다.
//다운캐스팅은 항상안전하게 이루어지지 않으므로 instanceof를 사용하여
//실제 참조하는 객체가 해당 클래스의 인스턴스인지 확인하는 것이 좋습니다.
class Parent {
	public void sayHello() {
		System.out.println("Hello from Parent");
	}
}

class Child extends Parent {
	public void sayHello() {
		System.out.println("Hello form Child");
	}

	public void sayGoodbye() {
		System.out.println("Goodbye form Child");
	}
}

public class Downcasting {
	public static void main(String[] args) {
		Parent p = new Child(); //업캐스팅
		p.sayHello();
		
		if(p instanceof Child) {
			Child c = (Child) p; //다운캐스팅
			c.sayGoodbye();
		}
		
	}
}

/*
 * 업캐스팅을 하게 되면 자식 클래스에서 오버라이딩한 메서드를 가져와 부모클래스에서 쓸 수 있다. 다운캐스팅을 하게 되면 부모 클래스가
 * 자식클래스가 되어 모든 멤버 메서드를 사용 할 수 있다.
 * 
 * 하지만 다운캐스팅을 하게 되면 기존에 부모클래스로 초기화 하였을 때 할당된 메모리보다 커질 수 있다. 따라서 기능의 문제가 생길 수
 * 있을것이다.
 */