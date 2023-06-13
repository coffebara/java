package java0612;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework {
	public static void main(String[] args) {

		String[] fruit = { "사과", "바나나", "귤", "수박", "사과", "사과", "귤", "수박", "수박", "바나나", "귤", "사과", "사과", "수박", "귤",
				"바나나", "바나나", "사과", "귤", "귤" };
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < fruit.length; i++) {
			if (map.containsKey(fruit[i])) {
				map.replace(fruit[i], map.get(fruit[i]) + 1);
			} else {
				map.put(fruit[i], 1);
			}
		}
		Set set = map.entrySet();
		Iterator ite = set.iterator();
		System.out.println("과일 개수 출력하기");
		System.out.println("============");
		while (ite.hasNext()) {
			Map.Entry e = (Map.Entry) ite.next();
			System.out.println(e.getKey() + ":" + e.getValue() + "개");
		}

	}
}
