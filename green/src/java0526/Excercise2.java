package java0526;

public class Excercise2 {

	public static void main(String[] args) { // for ...if % &&
		// 두 수 150, 300 의 공약수를 구하라
		// * 공약수 : 두 수를 공통으로 나누어 떨어지게 하는 수
		// 예 ) 4, 6 의 공약수 : 1. 2
		// 분석 그런데 4와 6 중 작은 수인 4보다 큰 수는 두 수의 공약수가 될 수 없다.
		int num1 = 150;
		int num2 = 300;
		for (int i = 1; i <= Math.min(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i + "는 " + num1 + "과 " + num2 + "의 공약수 입니다.");
			}
		}
	}

}
