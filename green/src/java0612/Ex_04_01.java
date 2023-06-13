package java0612;

public class Ex_04_01 {//멀티타입 매개변수
	public static void main(String[] args) {
		// KeyValue 라는 메서드에 String, Integer라는 인자를 넘겨서
		// String, Integer 타입의 KeyValue 를 리턴받는다는 의미
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		// setKey라는 메서드에 '사과'갑슬 입력한다. 
		kv1.setKey("사과");
		kv1.setValue(10000);
		// setKey로 입력한 값을 getKey로 받아온다. 
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key: " +key1 + " value: " +value1);
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없음)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key: " + key2 + " value: " +value2);
		
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키값만 사용");
		String key3 = kv3.getKey();
		System.out.println("Key: " + key3);
	}
}
//제네릭을 사용하면 구체적인 데이터 타입을 인스턴스에 따라 지정할 수 있어
//중복의 제거와  타입의 안정성을 동시에 추구할 수 있다!
//여기서는 <K, V> 사용해서 타입 오류를 방지
//KeyValue<String, Integer> kv1 = new KeyValue<>();
//KeyValue<Integer, String> kv2 = new KeyValue<>();
//KeyValue<String, Void> kv3 = new KeyValue<>();
//다 다른 자료형을 리턴 값으로 받지만 제네릭을 씀으로 하나의 코드로 만들 수있다.