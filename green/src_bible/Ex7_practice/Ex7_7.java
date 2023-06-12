package Ex7_practice;

class Outer2 {
	static class Inner {
		int iv = 200;
	}
}

public class Ex7_7 {
	public static void main(String[] args) {
		Outer2.Inner ic = new Outer2.Inner();
		System.out.println(ic.iv);
	}
}
