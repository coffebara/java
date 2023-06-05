package java0605A;

public class MultiTest {//다중인터페이스
	public static void main(String[] args) {
		Child c = new Child();
		ITest i = new Child();
		ITest1 i1 = new Child();
		c.test();
		c.func1();
		c.func2();
		System.out.println();
		
		i.test();
//		i.func1(); //오류발행
//		i.func2();
		i1.func1();
	}
}


//test()메서드입니다. 
//func1 메서드 호출
//func2 메서드 호출
//
//test() 메서드입니다. 
//func1 메서드 호출
