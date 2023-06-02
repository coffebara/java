package java0601;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();

		s.setName("이순신");
		String name = s.getName();
		System.out.println("학생 이름은 " + name);
	}
}
