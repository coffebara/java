package java0602;

public class University extends Student{
	private int courses;
	public University(String name, int grade, int courses) {
		System.out.println("University 생성자 호출");
		this.name = name;
		this.grade = grade;
		this.courses = courses;
	}
	//학점을 출력하는 메서드
	public int getCourses() {
		return courses;
	}
}
