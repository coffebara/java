package java0605;
//Q. Inner 클래스에 static을 빼고 출력하기
//고객정보 >> 이름:홍길동, 나이:31, 주소는:세종시 세종구 , 전화번호: 010-1111-2222
public class InnerTest2 {
	public static void main(String[] args) {
		MyOuter2 myOuter = new MyOuter2("홍길동", 31);
		MyOuter2.Inner inner = myOuter.new Inner("세종시 세종구");
		//myOuter 인스턴스에 대한 Inner 인스턴스를 생성합니다.
		System.out.println("고객정보 >> " + inner.getUserInfo());
	}//인스턴스 내에 또 다른 인스턴스를 만든겁니다. 
}	//내부클래스 또는 중첩클래스 사용 시 볼 수 있다.