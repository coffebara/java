package java0612;

public class Student {
	// main 문에서 객체의 멤버를 그대로 가져가 쓰기 때문에
	// 캡슐화는 진행하지 않음
	int id;
	String tel;

	// Constuctor
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}// 캡슐화가 안되어있기 때문에 getter & setter 구현하지 않음
