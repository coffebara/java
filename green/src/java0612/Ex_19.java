package java0612;

import java.util.ArrayList;

public class Ex_19 {
	public static void main(String[] args) {
// MyStudent 객체만 넣을 수 있는 ArrayList 객체 생석
		ArrayList<MyStudent> list =new ArrayList<MyStudent>();
//	ArrayList에 "이순신"으로 초기화 된 MyStudent 객체 삽입
		list.add(new MyStudent("이순신"));
//	ArrayList에 저장된 MysStudent 객체를 빼오기 위해
//	MyStudent 타입의 변수 생성 후 get() 메서드로 ArrayList의 첫 번째 값 대입
		MyStudent s = list.get(0);
//	MyStudent s = (MyStudent)list.get(0); // 제네릭이 없으면 이렇게 함
//	저장된 이름을 출력한다
		System.out.println("학생 이름 : " + s.getName());
	}
}
