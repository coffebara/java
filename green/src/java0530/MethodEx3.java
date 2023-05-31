package java0530;

public class MethodEx3 {
//	매개변수가 2개인 메서드를 선언하다.

	public void print(int a, int b) {
		int c = a + b;
		System.out.println("결과값=" + c);
	}

	public void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 12;
		int result = 0;
		MethodEx3 m = new MethodEx3(); //강한 결압 <- Spring 관점
		
		m.print(10,30);
//		m.print(10,30.5f));
		m.print(num1,num2);
		m.print("안녕하세요");
		
	}
}
