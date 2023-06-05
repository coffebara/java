package Ex7;

public class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		car = fe;
//		car.water();
		fe2 = (FireEngine) car;// 자손타입<- 조상타입. 형변환 생략 불가
		fe.water();
	}
}

class Car {
	String oclor;
	int door;

	void drive() { // 운전하는기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}
