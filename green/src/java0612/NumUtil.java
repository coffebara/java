package java0612;

//Comparable<T> 인터페이스 : compareTo(T obj) 추상 메서드를 활용할 수 있음
//NumUtil은 Comparable을 상속 받는타입만전달 받을 수 있고, 인터페이스 Maximum을 구
public class NumUtil<T extends Comparable<T>> implements Maximum<T> {
	// 제네릭 타입 배열 Field
	T[] value;

//생성자: 멤버 변수 초기화
	NumUtil(T[] value) {
		this.value = value;
	}

//상속 받은 인터페이스 Maximum의 max() 메서드 구현
//배열 요소중 가장 큰 값을 찾는 메서드
	public T max() {
//변수 v에 멤버 변수 value 배열의 첫 번째 값을 저장
		T v = value[0];
		for (int i = 0; i < value.length; i++)
			if (value[i].compareTo(v) > 0)
				v = value[i];
//value[i]의 값이 더 크면 v 변수 값이 저장, 가장 큰 값 추출
//compareTo 메서드는 현재 객체와 매개변수로 전달받은 객체의 유니코드 순서를 비교하여
//작으면 음수, 같으면 0, 크면 양수로 반환
		return v;
	}

}
