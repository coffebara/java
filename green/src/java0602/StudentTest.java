package java0602;

public class StudentTest {
	public static void main(String[] args) {
		String sinsang=null;
		Elementary e = new Elementary("이순신",2);
		University u = new University("홍길동",3,20);
		
		sinsang=e.getStudentInfo();
		System.out.println("학생 정보: " +sinsang);
		sinsang=u.getStudentInfo();
		System.out.println("학생 정보: "+sinsang+", 수강학점: "+u.getCourses()+"점");
	}
}
