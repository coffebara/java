package java0608;

import java.util.StringTokenizer;

public class Ex_11 {
	public static void main(String[] args) {
//StringTokenizer : 문자열 관련 클래스
//import java.util.StringToenizer; 를 해야 사용 가능
//StringTokenizer 클래스는 각 문자열을 토큰 단위로 분류한다
//StringTokenizer의 생성자를 활용해 저장된문자열의 분기점을 지정할 수 있다
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
//"/" 문자를 분기로 문자열을 분리
//st 객체는 위의 초기화를 통해 문자열 배열 형태로 변경 됨
//hasMoreTokens 메서드는 객체에 다음 토큰이 있는지 확인
		while (st.hasMoreTokens())
// StringTokenizer 객체의 다음 토큰을 가져와 출력
			System.out.println(st.nextToken());
	}//토큰화는 주어진 문자열을 지정된 구분자에 따라 여러 부분으로 분리하는 과정
}//클래스는 생성자에서 받은 문자열을 지정된 분리자(구분자)를 기준으로 분리하여 토큰을 저장



//Java의 StringTokenizer와 split은 모두 문자열을 토큰으로 나누는 데 사용됩니다. 그러나 두 클래스 사이에는 몇 가지 중요한 차이점이 있습니다.
//
//StringTokenizer는 문자 또는 문자열로 문자열을 구분하는 반면, split은 정규표현식으로 구분합니다.
//StringTokenizer는 빈 문자열을 토큰으로 인식하지 않지만 split은 빈 문자열을 토큰으로 인식합니다.
//StringTokenizer는 문자열을 구분하는 위치를 지정할 수 있지만, split은 구분자를 사용하여 문자열을 구분합니다.