package Ex6.practice;

public class Ex6_2 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1,1,100,60,76);
		
		String str =s.getStudentInfo();
		System.out.println(str);
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public String getStudentInfo() {
		int sum = kor+eng+math;
		double avg = (Math.round(sum/3.0*10))/10.0;
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+sum+", "+avg;
	}
	
	
}
