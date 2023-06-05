package java0605;

public class CarTest {
	public static void main(String[] args) {
//		MyCar c1 = new MyCar(); // 인터페이스는 인스턴스 생성이 불가능하다.
		MyCar c = new MySportsCar();
		MySportsCar s = new MySportsCar();
		MyTruck t = new MyTruck();
		//MyCar.SAFE_SPEED = 80;
		System.out.println("Car.SAFP_SPEE= "+ MyCar.SAFE_SPEED);

		c.speedUp();
		c.speedDown();
//		c.turbo();
		c.stop();
		
		System.out.println();
		s.speedUp();
		s.speedDown();
		s.turbo();
		s.stop();
	}
}
