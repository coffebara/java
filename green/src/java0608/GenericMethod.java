package java0608;

class GenericMethods<T, M, N>{
	String t;
	double d;
	String subject;
	int grade;
	T gSubject;
	N gGrade;
	
	public T method1(T t) {
		return t;
	}
	public String method1(String s) {
		t=s;
		return t;
	}
	public boolean method2(M m, M n) {
		
		return (m ==n)? true : false;
	}
	public boolean method2(double m, double n) {

		return (m ==n)? true : false;
	}
	public String method3(T t, N n) {
		gSubject =t;
		gGrade = n;
		System.out.println(t + ": " + n);
		return t + ": " + n;
	}
	public String method3(String s, int i) {
		System.out.println(s + ": " + i);
		return s + ": " + i;
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		
		GenericMethods gm = new GenericMethods();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");
		System.out.println(str1);
		System.out.println(str2);
		
		boolean bool1 = gm.<Double>method2(2.5,2.5);
		boolean bool2 = gm.method2(2.5,2.5);
		System.out.println(bool1); // 같으면 true
		System.out.println(bool2); // 다르면 false
		
		gm.<String, Integer>method3("국어", 80);
		gm.method3("국어", 80);
	}//제네릭 메서드: 릴턴타입 또는 매개 변수의 타입을 제네릭 타입으로 선언2          
}

//안녕
//안녕
//true
//false