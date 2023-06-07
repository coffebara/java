package java0607;

//람다식은 재사용을 유연하게 할 수 있다
interface MyFunction2 {
	void print();
}

public class Ex_13 {
	public static void main(String[] args) {
//이번에는 매개변수 없는 메서드를 구현할 때 예제
//인터페이스 객체명을 f로 선언하고 매개변수 괄호에 아무 것도 없이 화살표로 동작을구현하면 된다
		MyFunction2 f = () -> {
			System.out.println("Hello");
		};
		f.print();
//한 번구현된 메서드를 재(사용)구현할 수도 있다.
		f = () -> {
			System.out.println("안녕");
		};
		f.print();
	}
}
