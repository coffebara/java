package java0612;
//제네릭클래스의 타입 제한
//클래스/인터페이스 상관없이 항상 extends 사용

public interface Maximum<T extends Comparable<T>> {
	// 제네릭 인터페이스 선언, Comparable을 상속받는 타입만전달 받음
	public T max();
}
//Maximum은 제네릭 인터페이스로, Comparable<T>을 상속받는 타입에 대해서만 동작하는
//제한을 설정합니다.
//제네릭타입<? extends 상위타입> : Upper Bounded Wildcards (상위 클래스 제한)
//- 상위타입 이하. 상위타입의 클래스나 인터페이스 그리고 그것을 상속받은 하위 것만 올 수 있다

//제네릭타입<?> : Unbounded Wildcard(제한 없음)
//- <? extends Object> 의 요약어로 Object 클래스의 하위 클래스.
//즉, 모든 클래스가 올 수 있다

//제네릭타입<? super 하위타입> : Lower Bonded Wildcards (하위 클래스 제한)
//- 하위타입 이상, 즉, 하위타입의 클래스나 인터페이스 그리고
//그 것에게 상속을 한 상위 것만 올 수 있다.
