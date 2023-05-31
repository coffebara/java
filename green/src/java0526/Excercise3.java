package java0526;

public class Excercise3 {

	public static void main(String[] args) {
//	      1+3+5+7+9...+n의 합이 최초로 1,000 이상이 되는 n의 값과 그 수까지의 합을 구하라

//	      구현방법
//	      1. 1부터 홀수의 합을 저장한다.
//	      2. 홀수의 합이 1000이상인지를 체크한다.
//	      3. 1000이상이면 마지막으로 더한 홀수와 그 홀수까지의 합을 출력한 후 종료한다
//	      4. 1000이상이 아니면 그 다음 홀수를 이용해서 다시 1번 과정을 반복한다
		int num = 1;
		int sum = 0;
		while (true) {
			sum += num;
			if (sum >= 1000)
				break;
			else
				num += 2;
		}
		System.out.println("1에서" + num + "까지의 홀수의 합은" + sum);

	}

}
