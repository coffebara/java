package java0531;
//클래스 밖에 올 수 있는 3가지

//1. packgae - .java 파일의 폴더(패키지) 위치 -default의 경우 폴더가 생성되지 않음
//2. import - 다른 폴더(패키지) 위치의 클래스를 참조
//3. 외부클래스 (external class)
//	- 외부에 포함된 또 다른 클래스
//	- public 키워드를 사용할 수 없음
//	
//클래스 안에 올 수 있는 4가지
//1. 필드 (멤버) - 클래스 특징(속성)을 나타내는 변수 (int age =20)
//2. 메서드 (멤버) - 클래스의 기능 (void working() {...})
//			 - 리턴타입+메서드이름+()+{}로 구성
//3. 생성자
// - 객체 생성 기능 (생성자이름+()+{}) - 생성자의 이름은 클래스  이름과 동일하어야 함
//4. 내부클래스 (inner class) (멤버)
//	- 클래스 내부 정의된 클래스

//기본 생성자의 자동 추가
class AA {
	int m;

	void work() {
		System.out.println(m);
	}
	// 컴파일러가 자동으로 추가해주는 기본 생성자
//	A(){
	// 객체 생성이후에 해야 할 추가 일들
//	}
}

class B {
	int m;

	void work() {
		System.out.println(m);
	}

	B() { // 기본 생성자
	}
}

class C {
	int m;

	void work() {
		System.out.println(m);
	}

	// 오버로딩된 생성자가 대체를 해서 기본생성자가 없다
	C(int a) { // 생성자의 기본기능: 객체 생성 + 필드 초기화
		m = a;
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
//		#1. 클래스의 객체 생성
		AA a = new AA();
//		클래스 참조변수 =new(Heap 메모리에 넣어라)  
//		A(); 생성자 --> 출력값은 객체(필드,메서드,이너클래스)
		B b = new B();
//		C c=new C(); 불가능
		C c = new C(3);
//		#2. 메서드 호출
		a.work(); // 자바에서 멤버 변수는 해당 타입의 기본값으로 자동으로 초기화 됨
		b.work();
		c.work();
	}
}

// 각 타입별 기본 값
//정수 타입 (byte, short, int, long): 0
//부동소수점 타입 (float, double): 0.0
//논리 타입 (boolean): false
//문자 타입 (char): '\u0000' (널 문자)
//참조 타입 (클래스, 배열 등): null

//스택 영역: 이 영역은 메서드의 실행 과정에서 임시로 할당되는 메모리를 다룹니다. 
//메서드를 호출할 때마다 각각의 스택 프레임이 생성되며, 
//지역 변수와 매개변수가 이 영역에 저장됩니다. 
//
//힙 영역: 이 영역은 동적으로 생성된 객체를 저장하는 공간입니다. 
//new키워드로 매개변수가 이 영역에 할당됩니다. 
//
//메서드(정적) 영역: 이 영역은 클래스 정보(클래스명, 부모클래스명, 메서드와변수)와 함께 
//정적(static) 변수와 상수를 저장하는 공간입니다. 이 영역은 JVM이 시작될 때 생성되며,
//JVM이 종료되면 해제됩니다.