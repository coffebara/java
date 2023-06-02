package java0601;

class Student {
	private String name;
	private int grade=1;
	
	public Student() {
		
	}
	public Student(String name) {
		this.name = name;
//		this.grade = 1;
		System.out.println("인자가 1개인 생성자 호출");
	}
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		System.out.println("인자가 2개인 생성자 호출");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}