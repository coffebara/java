package java0612;

public class Product_ArrayList<T, V> {
	private T code;
	private T name;
	private T color;
	private V qty;
	
//값 받을 때 t3의 값을 this.t3=t; 라고 적었다.
	public Product_ArrayList(T code, T name, T color, V qty) {
		this.code = code;
		this.name = name;
		this.color = color;
		this.qty = qty;
	}

	public T getCode() {
		return code;
	}

	public void setCode(T code) {
		this.code = code;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getColor() {
		return color;
	}

	public void setColor(T color) {
		this.color = color;
	}

	public V getQty() {
		return qty;
	}

	public void setQty(V qty) {
		this.qty = qty;
	}
	
	
	
}
