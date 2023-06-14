package Ex6.practice;

public class Ex6_21 {
	static int abs(int value) {
//		value = (int)Math.sqrt(Math.pow(value, 2));
		value = value >0 ? value : -value;
		return value;
	}
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}
}
