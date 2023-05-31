package java0526;

public class Excercise4 {

	public static void main(String[] args) {
//자연수 143이 소수인지 판별하기
//*소수 : 1과 자기 자신만으로 나누어 떨어지는 수
//예) 3의 약수 : 1, 3
//	4의 약수 : 1, 2, 4 합성
//	1. 143의 약수의 개수를 구한다
//	2. 약수의 개수가 두개인지 확인한다
//	3. 약수의 개수가 두개이면 소수, 아니면 합성
		int num = 143;
		int count = 0; // 약수의 개수를 저장하는 변수 
	for(int i=1; i<=num; i++) {
		if( num % i == 0) {
			System.out.println("약수:" + i);
			count ++;
		}
	}
		System.out.println(num+"의 약수의 개수: "+count);
		if(count == 2)
			System.out.println(num + "은 소수입니다");
		else
			System.out.println(num + "은 합성입니다");
	}

}
