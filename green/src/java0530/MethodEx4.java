package java0530;

public class MethodEx4 {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		MethodEx4 m = new MethodEx4();
		result = m.add(num1, num2);
		System.out.println("두 수의 합은 " + result);
		System.out.println("두 수의 합은 " + m.add(100, 300));
	}
}
