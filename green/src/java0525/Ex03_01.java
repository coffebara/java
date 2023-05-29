package java0525;
//printf 출력문 형식
//(1) 정해진 서식에 따라 문자열을 비롯한 여러 자료형을 출력
//(2) printf()는 괄호() 안에 큰 따옴표("")로 모든 내용을 묶어 글자로 취급한다
//(3) 중간에 다른 문자,숫자 등의 값을넣기 위해선 %c, %d와 같은 지정 포맷으로 표시하며
//그 대응 값을 입력한 포맷의순서대로 큰 따옴표("") 우측에 콤파( , )로 구분하여 입력한다
//(4) 또한 줄 바꿈 등의 동작은 역 슬래시(\, 원 표시)n 등의 특정 제어자를 이용한다
//(\n, \t 등)
public class Ex03_01 {
public static void main(String[] args) {
	System.out.printf("100+100 = ");
	
	System.out.printf("\n");
	
	System.out.printf("%d", 100 + 100);
	System.out.printf("\n");
	System.out.printf("%f", 1.0 + 1);
}
}
