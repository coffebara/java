package java0615A;

//public class White_01 extends Thread{
//	// run() 메서드 오버라이딩
//	@Override
//	public void run() {
//		// 스레드 실행 시 해당 출력문 무한 반복
//		while(true)
//			System.out.println("백기 올려!!");
//	}
//}

class White_02 implements Runnable{
	// run 메서드 구현
	public void run() {
		while(true)
			System.out.println("백기 올려!!");
	}
}
