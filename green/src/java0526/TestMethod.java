package java0526;

public class TestMethod {

	public static void main(String[] args) {
/** 객체의 생성 */
	ProductVo product = new ProductVo();
	/** 함수를 이용하여 속성 값의 저장*/ 
	product.setProductNo("a001");
	product.setProductName("Americane");
	product.setPrice(3800);
	/** 함수를 이용하여 속성 값을 조회 */
	String productNo = product.getProductNo();
	String productName = product.getProductName();
	int price = product.getPrice();
	
	System.out.println("productNo = " + productNo);
	System.out.println("productName = " + productName);
	System.out.println("price = " + price);
	
	/**동적 파라미터의 사용*/
	product.print("americano", "Latte", "Mocha");
	}

}
