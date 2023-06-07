package java0607;
//랩퍼클래스 (Wrapper) 변수형 객체로 변수를 객체처럼 사용하기 위해 활용
//특징: 변수 객체가 되기 때문에 다양한 메서드를 활용할 수 있다.
//단점: 변수같지만 객체이기 때문에 저장된 데이터 활용을 위해 다시 자료형으로 되돌려야 한다
//자료형 변수를 랩퍼로 바꾸는 과정을 박싱(박스에 포장)
//랩퍼 클래스 객체를 자료형 변수로 바꾸는과정을  언박싱(박스에서 꺼냄)이라고 한다.
public class Ex_04_10 {
	public static void main(String[] args) {
		int n =10;
//자동박싱
//자료형 변수를 랩퍼로  바꾸는 과정
		Integer intObject = n;
//박싱된 값도 잘만 쓸수 있다
//박싱된 값에 수를 더해도 상관없다
		System.out.println("intObject = " + intObject);
//박싱된 값을 받음 자동 언박싱
		int m = intObject + 10;
		System.out.println("m = " + m);
	}

}
