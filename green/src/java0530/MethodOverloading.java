package java0530;

public class MethodOverloading {
	public static void main(String[] args) {
		print();
		print(3);
		print(5.8);
		print(2, 8);
	}

	public static void print() {
		System.out.println("데이터가 없습니다.");
	}

	public static void print(int a) {
		System.out.println(a);
	}

	public static void print(double a) {
//  public static void print(double b) <= 중복 불가능
		System.out.println(a);
	}

	public static void print(int a, int b) {
//	public static int print(int a, int b) <= 불가능
		System.out.printf("a: %d\t b: %d", a, b);
	}
}
 