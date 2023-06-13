package java0612;

import java.util.ArrayList;
import java.util.List;

public class Ex_05 {
//ArrayList 객체를 List로 형을 맞추고
//	와일드카드를 활용해 저장된 요소들의 객체 정보를 맞춤
//	class TEST{
	public void getProductText_Set(List<?> list) {
//데이터를 저장할때 객체와 객체의 변수들을 생성한다. 
//String은 null로 int는 0으로 초기화
		Product_ArrayList prod = null;
		String code = null;
		String name = null;
		String color = null;
		int qty = 0;
		for (int i=0; i< list.size(); i++) {
//전송받은 list 객체 List 타입이므로 형변환이 필요
			prod = (Product_ArrayList) list.get(i);
//형변환 후 내부에 저장된 변수들도  형변환해 데이터 획득
			code = (String) prod.getCode();
			name = (String) prod.getName();
			color = (String) prod.getColor();
			qty = (int) prod.getQty();
			
			System.out.println("제품번호 = "+code);
			System.out.println("제품이름 = "+name);
			System.out.println("제품색상 = "+color);
			System.out.println("제품수량 = "+qty);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ArrayList<Product_ArrayList<String, Integer>> pList = new ArrayList<>();
		
		Product_ArrayList<String, Integer> p1 = new Product_ArrayList<>("0001", "스마트폰", "블랙", 100);
		Product_ArrayList<String, Integer> p2 = new Product_ArrayList<>("0002", "스마트 TV", "화이트", 200);
		Product_ArrayList<String, Integer> p3 = new Product_ArrayList<>("0003", "노트북", "실버", 100);
				
		pList.add(p1); 	pList.add(p2);	pList.add(p3);
		Ex_05 p = new Ex_05();
		p.getProductText_Set(pList);
	}
}
