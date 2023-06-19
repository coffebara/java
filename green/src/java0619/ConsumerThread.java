package java0619;

public class ConsumerThread extends Thread {
	E09MyLabel bar; // 레퍼런스타입 변수

	ConsumerThread(E09MyLabel bar) {
		this.bar = bar;
	}

	public void run() {
		while (true)
			try {
				sleep(200);
				bar.consume(); // consume 메서드호출
			} catch (InterruptedException e) {
				return;
			}
	}
}