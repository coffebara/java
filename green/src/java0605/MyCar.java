package java0605;
//인터페이스들간의 관계는 상속(extends)이다.
public interface MyCar {
	public static final int SAFE_SPEED=60; // 상수
//	public intSAFE_SPEED=60;;
	public abstract void speedUp();//추상메서드
	public abstract void speedDown();
	public abstract void stop();
	/*
	 * public void speedUp(); 
	 * public void speedDown(); 
	 * public void stop();
	 */
}//	<<interface>>
//			MyCar
// 	 	implements
// Truck			SportsCar