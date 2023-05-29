package ch03;

public class Exercise5 {

   public static void main(String[] args) {
      // 변수 선언
      int num = 2;
      int count;
      int order = 1;

      // 주어진 범위까지 소수를 확인
      while (order <= 20) { // 찾고자 하는 소수 개수 (20개)
         count = 0; // count 초기화
         // num이 소수인지 확인하는 for문
         for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // 나누어 떨어질 경우 count 증가
               count++;
            }
         }
         // 소수일 경우 출력
         if (count == 2) { // count가 2이면 소수
            System.out.println(order+ "번째 소수" + " = " + num); // 찾은 소수의 순서와 값 출력
            order++; // 찾은 소수의 순서를 증가시킴
         }
         num++; // 소수를 찾을 후보 숫자를 증가시킴
      }
   }
}