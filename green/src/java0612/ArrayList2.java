package java0612;

import java.util.ArrayList;

//ArrayList 특징
//java.util.List 계열이다.
//- 객체(데이터)에 순서가 지정된다. 
//- 모든 타입의 객체를저장할 수 있다. 
//- 저장하는 객체(데이터)의 개수에 제한이 없다. 
//ArrayList는 List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트이다.
public class ArrayList2 {
	public static void main(String[] args) {
//문자열만 저장할 수 있는 ArrayList 객체 생성
		ArrayList<String> al = new ArrayList<>();
// add(value) : ArrayList의 삽입 메서드
		al.add("watermelon");		al.add("apple");
		al.add("banana");				al.add("watermelon");
		al.add("Jujube");				al.add("banana");
// size(): ArrayList에 저장된 데이터의 개술를 반환하는 메서드
		System.out.println("Count : " + al.size());
		print(al);
//set(index, value) 해당 인덱스에 저장된 데이터 변경하는  메서드
// 기존의 요소를 덮어씌우는 역할... 새로운 값으로 교체할 수 있다.
		al.set(1, "kiwi");
		print(al);
		al.set(4, "peach");
		print(al);
// remove(index) : 해당 인덱스에 저장된 데이터 삭제
		al.remove(0);
		print(al);
// get(index) : 해당 인덱스에 저장된 데이ㅌㅓ를 반환
		System.out.println("Index 3 : " + al.get(3));
// contains(value) : 해당 값이 저장되어 있는지 확인
		System.out.println("banana : " + al.contains("banana"));
// indexOf(value) : 해당 값이 저장되어 있다면 그 위치(index) 반환
		System.out.println("banana: " + al.indexOf("banana"));
//	lastIndexOf(value) : 해당 값이 여러 개 저장되어 있다면 제일 마지막에 저장된 위치(index) 반환
		System.out.println("banana : " + al.lastIndexOf("banana"));
//	ArrayList 안의 값들을 확인하여 "banana"가 있다면 "strawberry"로 바꾸는 로직
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).equals("banana"))
				al.set(i, "strawberry");
			print(al);
		}
	}

//	문자열만 저장할 수 있는 ArrayList를 매개변수로 전달 받아
//	그 안의 값들을 출력하는 메서드
	private static void print(ArrayList<String> al) {
//	확장 for문을 이용해 전달받은 매개변수의 값 하나씩 출력
		for (String str : al)
			System.out.print(str + "\t");
		System.out.println();
	} // Set 인터페이스는 요소의 순서를 유지하지 않으며,
	// 인덱스로 요소를 검색하는 get(index) 메서드를 제공하지 않습니다.
	// get(index) 메서드는 List 인터페이스와 그 구현체들인 ArrayList, LinkedList 등에서 사용할 수 있습니다.
// Set은 요소의 순서를 유지하지 않는 자료구조이기 때문에 순서에 의존하여 요소를 가져오는 것은
// 보장되지 않습니다. 따라서 Set에서 요소를 순서대로 출력하거난
// 특정 인덱스의 요소를 가져오려면 Iterator를 사용하거나 foreach 루프를 활용해야합니다.

}
