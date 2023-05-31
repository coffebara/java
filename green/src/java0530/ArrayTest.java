package java0530;

public class ArrayTest {
	public static void main(String[] args) {
		int[] num;
		num = new int[2];

		num[0] = 1;
		num[1] = 2;
//	num[2] =3; 실행 시 ArrayIndexOutoffBoundsException 발생
//	num[1] = 5.6f;
		System.out.println("num[0]=" + num[0]);
		System.out.println("num[1]=" + num[1]);
		System.out.println();

		for (int i = 0; i < num.length; i++) {
			System.out.println("num:" + num[i]);
		}
	}
}
