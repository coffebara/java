package java0605A;

public class Child implements ITest, ITest1 {
	public void test() {
		System.out.println("test() 메서드입니다.");
	}
	public void func1() {
		System.out.println("func1 메서드 호출");
	}
	public void func2() {
		System.out.println("func2 메서드 호출");
	}
}
