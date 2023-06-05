package java0602;

//초등학생 클래스
public class Elementary extends Student{
	public Elementary(String name, int grade) {
		System.out.println("Elementary 생성자 호출");
		this.name = name;
		this.grade = grade;
	}
}
