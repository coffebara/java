package java0613;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Suffle {
	// suffle 카드를 섞고있다.
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		// Collections.suffle 메서드를 활용해 랜덤으로 데이터를 출력하는 예제
		Collections.shuffle(list);
		System.out.println(list);
	}
}
