package programmers;

//1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
//
//세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
//세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
//세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
//세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
public class days8_2 {
	public static int Solution(int a, int b, int c) {
		int answer = 0;
		if (a == b && a ==c) { // 모두같다면
			answer = (int) (27 * (Math.pow(a, 6)));
		} else if (a == b) {
			answer = (a+b+c)*(a*a+b*b+c*c);
		} else if (a == c) {
			answer = (a+b+c)*(a*a+b*b+c*c);
		} else if (b == c) {
			answer = (a+b+c)*(a*a+b*b+c*c);
		} else {
			answer = a+b+c;
		}
		return answer;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 6;
		int c = 1;
		System.out.println(Solution(5, 1, 3)); 
	}
}
