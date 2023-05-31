package java0530;
//메서드 정의
//자주 사용하는 기능을 미리 만들어 놓고 필요할 때마다 불러서 재사용하자는 개념
//인수를 받아 결과값을 리턴하는 작은 프로그램(subprogram)
//C언어의 함수에 해당한다
public class MethodEx1 {
	public void print() {
		System.out.println("메서드를 호출합니다.");
		//return;
		//return 7;
	}
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
		
		MethodEx1 m = new MethodEx1(); //메모리에 인스턴스 생성
		m.print();
		m.print();
		m.print();
	}
}
