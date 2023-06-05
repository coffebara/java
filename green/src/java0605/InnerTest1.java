package java0605;
//고객정보 >> 주소는:세종시 세종구 , 전화번호: 010-1111-2222
public class InnerTest1 {
	public static void main(String[] args) {
//		MyOuter1 i = new MyOuter1("홍길동",25);
		MyOuter1.Inner inner = new MyOuter1.Inner("세종시 세종구");
		System.out.println("고객정보 >> "+inner.getUserInfo());
	}
}
