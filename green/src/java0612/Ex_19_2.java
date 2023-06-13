package java0612;

import java.util.ArrayList;

//Q. 홍길동을 추가해보기 이순신 다음에 홍길동 나오게 하기.
public class Ex_19_2 {
	public static void main(String[] args) {
		ArrayList<MyStudent> list = new ArrayList<>();
		list.add(new MyStudent("이순신"));
		list.add(new MyStudent("홍길동"));
		
		for(MyStudent sn :list) {
			System.out.println("학생 이름 : " +sn.getName());
		}
	}
}
