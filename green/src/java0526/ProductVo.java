package java0526;

import java.util.Arrays;

public class ProductVo {
//      VO (value Object): VO는 주로 도메인 모델 내에서 사용
//      값 객체라고도 불리며, 불변성을 가지는 객체입니다
//      DTO (Data Transfer Object): 주로 외부 시스템과의 데이트 교환
//      데이터 전공 객체라고도 불리며, 데이터의 전송을 단순화하기 위해 사용됩니다.
//      주로 데이터베이스 쿼리나 외부 시스템과의 데이터 교환 등에서 사용됩니다
//      전역 변수 - 품목번호, 품목명, 단가
   public String productNo;
   public String productName;
   public int price;
   
//   외부에서 호출시 전역변수의 품목번호를 반환하기 위한 함수
   public String getProductNo() {
      return productNo;
   }
//   외부에서 품목번호를 제공 시 전역변수의 품목번호에 값을 저장하기 위한 함수
   public void setProductNo(String productNo) {
      this.productNo = productNo;
      this.printResult(productNo);
   }
//   외부에서 호출 시 전역변수의 제품명을 반환하기 위한 함수
   public String getProductName() {
      return productName;
   }
//   외부에서 제품명을 제공 시 전역변수의 제품명에 값을 저장하기 위한 함수
   public void setProductName(String productName) {
      this.productName = productName;
      this.printResult(productNo);
   }
//   외부에서 호출 시 전역변수의 단가를 반환하기 위한 함수
   public int getPrice() {
      return price;
   }
//   외부에서 단가를 제공 시 전역변수의 단가에 값을 저장하기 위한 함수
   public void setPrice(int price) {
      this.price=price;
      
//      오류발생 - printResult()는 String타입의 파라미터만 들어올 수 있음
//      printResult(productNo)
      
//      String 연산에서 문자 + 숫자 = 문자 가 된다
      String msg = "" + price;
      this.printResult(msg);
      
   }
//   setXXX() 함수를 사용 시 아래의 메시지가 나타나도록 함수 구현
   public String printResult(String msg) {
      return msg + "가 입력되었습니다";
   }
//   동적파라미터를 사용한 print() 함수 사용
   public String print(String...message) { // ... 가변인자 (여러개의 인자들)
//      Arrays.toString() 함수는 앞으로 배울 배열에서 다룰 예정
      return Arrays.toString(message);
   }// message 배열을 문자열로 반환한 결과를 반환합니다.
   public static void main(String[] args) {
   }

}