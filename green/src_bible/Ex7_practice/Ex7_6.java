package Ex7_practice;

class Outer {
	class Inner {
		int iv = 100;
	}
}

public class Ex7_6 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.Inner ic = oc.new Inner();
		System.out.println(ic.iv);
	}
}
