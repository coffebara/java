package Ex6.practice;

public class Ex6_3 {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}
}
class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	public Student2() {
	}

	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		total = kor + eng + math;
		return total;
	}

	public double getAverage() {
		if (total != 0)
			avg = (Math.round(total / 3.0 * 10)) / 10.0;
			return avg;
	}

	public String getStudentInfo() {
		total = kor + eng + math;
		double avg = (Math.round(total / 3.0 * 10)) / 10.0;
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total + ", " + avg;
	}

}

