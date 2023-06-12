package java0608;

import java.util.ArrayList;

public class ArrayListEx03 {
	public static void main(String[] args) {
//ArrayList 객체 생성
		ArrayList list = new ArrayList();
//ArrayList에 해당 값 순서대로 추가
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
//ArrayList의 해당 인덱스에 해당 값 추가 (나머지 뒤로 밀림)
		list.add(1, "APPLE");
//ArrayList에 해당 인덱스의 값을 해당 값으로 변경
		list.set(2, "GRAPE");
//ArrayList의 해당 인덱스의 값 삭제
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
