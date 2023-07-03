package dao;
//DAO : Data Access Object
//데이터베이스나 다른 데이터 저장소에 접근하여 데이터를 조작하는 역할
//DAT는 데이터베이스와의 통신을 담당하기 때문에 데이터베이스 연결, 쿼리 실행
//트랜잭션 처리 등과 관련된 로직을 포함
//데이터 생성(Create), 데이터 조회(Read), 데이터 수정(Update), 데이터 삭제(Delete)
//Insert 쿼리		  Select 쿼리	   Update 쿼리		 Delete 쿼리

import java.util.ArrayList;
import dto.Product;

public class ProductRepository {
	// 통합 저장소 컬렉션 리스트
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	// 추가
	private static ProductRepository instance = new ProductRepository();
	

	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.17-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");

		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("NoteBook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");

		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core Processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);

	}
	// 통합 저장소에 저장된 모든 데이터를 컬렉션 리스트 통째로 반환하는 메서드
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	// 상품 상세 정보를 가져오는 메서드
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product!=null && product.getProductId()!= null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		
		return productById;
	}
	
//	추가 메서드 2가지
	public void addProduct(Product newProduct) {
		listOfProducts.add(newProduct);
		System.out.println(listOfProducts);
	}
	
	public static ProductRepository getInstance(){	
		return instance;
	}
}