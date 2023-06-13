package java0612;

public class  KeyValue <T, V>{
	T key;
	V value;
	
	public void setKey(T key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public T getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
