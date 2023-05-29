package java0525;
import java.util.Scanner;

public class SimpleCompute {
	public static void main(String[] args) {
		
	   int number1, number2, sum, diff, product;
	// 변수들을 선언한다 number1, number2, sum, diff, product	

	Scanner scan = new Scanner(System.in);
	System.out.println("첫번 째 정수를 입력하세요.");
	number1 = scan.nextInt();
	System.out.println("두번 째 정수를 입력하세요.");
	number2 = scan.nextInt();
	sum = number1 + number2;
	diff = number1 - number2;
	product = number1 * number2;
	
	System.out.printf("%d %d %d", sum, diff, product);


   }
}
//출력결과
//첫 번째 정수를 입력하세요: 50
//두 번째 정수를 입력하세요: 30
//합 = 80
//차 = 20
//곱 = 1500