package java0615A;

class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		// #2. 자막 번호 하나~다섯
		String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };
//		try {
//			Thread.sleep(10); // 일정 시간 동안스레드를 잠시 중지
//		} catch (InterruptedException e) {
//
//		}
		// #4. 자막번호 출력
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막번호) " + strArray[i]);
			try {
				Thread.sleep(210);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class CreateAndStartThread_M2C1 {
	public static void main(String[] args) {
		// SMIFileThread 객체 생성 및 시작
		Runnable smiFileRunnable = new SMIFileRunnable();
		// smiFileRunnable.start(); // 오류
		Thread thread = new Thread(smiFileRunnable);
//		Thread t = new Thread(new SMIFileThread());
//		t.start();
		thread.start();
		
		// #1 비디오프레임 1~5
		int[] intArray = { 1, 2, 3, 4, 5 };
		
		// #3. 비디오 프레임 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}
}
