package ch02;

//자동정렬 Ctrl + shift + f
//라인 삭제 Ctrl + d
//alt + 아래 방향키 해당라인을 아래로 내려보낼 수 있다
class KHE {
	public static int exStatic = 88;
	public int exInstance = 99;
}

public class StaticTest {
	public static void main(String[] args) {
		System.out.println(KHE.exStatic); // 출력 88
//		System.out.println(KHE.exInstance); 출력 불가
		
		KHE E1 = new KHE();
		System.out.println(E1.exInstance);
		
		KHE.exStatic = 77;
		E1.exInstance = 11;
		E1.exStatic = 22;
		System.out.println(KHE.exStatic);
		System.out.println(E1.exInstance);
		System.out.println(E1.exStatic);
		
//
//		KHE E1 = new KHE();
//		System.out.println(E1.exInstance); // 99 KHE 클래스에서 정의한 원본 값 그대로
//		System.out.println(E1.exStatic); // 88 KHE클 래스에서 정의한 원본 값 그대로
//
//		E1.exInstance = 3;
//		System.out.println(E1.exInstance);
//		E1.exStatic = 5;
//		System.out.println(E1.exStatic);
//		System.out.println(KHE.exStatic);
//
//		KHE E2 = new KHE();
//		System.out.println(E2.exInstance);
//		System.out.println(E2.exStatic);
//		
//		KHE.exStatic = 77;
//		System.out.println(KHE.exStatic);
	}

}
//
//
//static 변수가 클래스의 모든 인스턴스에 대해 공유되며,
//한 인스턴스에서 이 변수를 변경하면 그 변경이 모든 인슽턴스에 반영된다.
//결론
//Instance는 객체 가운데 메모리에 할당되어 상주하고 있는 실체를 말한다.
//즉, intance는 기존의 Class가 가지고 있는 변수/함수와
//메모리를 공유하지 않는 분절된 도구로 사용할 수 있다.
//그러나 함수나 변수가 Static을 선언한 경우는 예외다.
//즉, Class의 Static 변수의 변화는 모든 Intance에 적용된다.
//1과 같이 E, E2 / KHE classKhe 중 어느 하나의 exStatic만 바꿔도
//넷의 결과값이 동시에 바뀐다
