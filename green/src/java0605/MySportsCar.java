package java0605;

public class MySportsCar implements MyCar {

	@Override
	public void speedUp() {
		System.out.println("SportsCar speedUp");

	}

	@Override
	public void speedDown() {	
		System.out.println("SportsCar speedDown");

	}

	@Override
	public void stop() {
		System.out.println("SportsCar stop");

	}
	public void turbo() {//자신만의 기능을 구현해준다
		System.out.println("SportsCar turbo 기능입니다.");
	}

}
