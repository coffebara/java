package java0616;

public class Horse2 implements Runnable {
	private int horse_num; // 말의 번호
	private int curMeter; // 현재 위치
	private final int MAXMETER = 1000; // 골인지점
	private int speed = 10; // run 한번 실행시마다 이동하는 거리
	private static int rank = 1; // 등수
	private int fake_horse_num = 8; // 특정 조작을 가할 말의 번호

	public Horse2(int horse_num) {
		this.horse_num = horse_num;
	}

	public void run() { // 런메서드
		while (curMeter < MAXMETER) { // 최대거리(골인지점)보다 현재위치가 작으면 반복실행
			long sleepTime = (long) (Math.random() * 500);
			// 0~499 의 랜덤값을 갖는 sleepTime 변수
			curMeter += speed;

			if (horse_num == fake_horse_num) {// 말의번호가 페이크말의 번호와 같을때 실행
				if (curMeter == 500) {
					fake_Comment();
				}
				// curMeter(현재위치)가 500이면 페이크코멘트 메서드호출
				if (curMeter >= 500 && rank < 9)
					// 500미터 이상이면서 8등까지 정해지지 않았을 때 실행
					sleepTime = fake(sleepTime);
				// fake메서드를 통해 sleepTime의 값을 변경
			}
			if (curMeter % 100 == 0)
				System.out.println(horse_num + "번 말이 " + curMeter + "미터 도착 ");
			try {
				Thread.sleep(sleepTime); // sleepTime/1000 초 만큼 메서드 정지
			} catch (Exception e) {
				e.getStackTrace(); // 해당 예외를 순차적으로 추적함
			}
			if (curMeter >= MAXMETER) {
				System.out.println(horse_num + "번 말이 결승선 도착 " + rank + "등 도착");
				rank++;
			}
		}
	}
	public long fake(long sleepTime) {
		return sleepTime +500;
	}
	public void fake_Comment() {
		System.out.println("아  "+ fake_horse_num+"번 말이 사행을 하는데요.");
	}
}
