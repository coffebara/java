package java0526;
// 148의 약수를 구하라
// 약수: 어떤 수를 나누어 떨어지게 하는 수
// ex) 4의 약수: 1, 2, 4

// 분석
// 먼저 소스로 구현하기 전에 약수의 개념에 대해 알아야 한다.
// 약수는 어떤 수를 나누어 떨어지게 하는 수다
// 4의 약수를 구하는 과정을 살펴보면 1에서 4사이의 자연수가 4로 나누어 떨어지는지
// 확인해 보면 된다. 그런데 4보다 큰 수는 4의 약수가 절대로 될 수 없다
// 148까지 순차적으로 증가된다
public class Excercise1 { // for..if문

   public static void main(String[] args) {
      int i = 0;
      int num = 148;
      
      for(i=1; i<148; i++) {
         if(num%i == 0)
            System.out.println(i + "는" + num + "의 약수입니다.");
      }
   }

}