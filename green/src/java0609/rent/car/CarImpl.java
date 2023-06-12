package java0609.rent.car;

import java0609.rent.base.Base;

//Car 인터페이스를 구현하는 구현 클래스이다. 
//인터페이스에서 선언된 메서드를 실제 그 기능을 구현하는 클래스이다
//실제 각각의 추상 메서드의 기능을구현한다
public class CarImpl extends Base implements Car {
	// 렌트카 관련 멤버변수 선언
	private String carNumber;		//차번호
	private String carName;		//차이름
	private String carColor;			//차색상
	private int carSize;				//배기량
	private String carMaker;		//제조사
	// getters and setters

	// 인터페이스에 선언된 추상메서드를 구현한다

	// 차의 정보를 조회하는 메서드
	public String checkCarInfo() {
		System.out.println("렌트카 조회  시간: " + showTime());
		// 부모 클래스의 showTime 메서드를 사용하여 메서드 호출 시간을 출력한다.
		System.out.println("렌트카를 조회합니다.");
		return "조회한 렌트카 정보";
	}
	// 새 차의 정보를 등록하는 메서드
	public void regCarInfo() {
		System.out.println("렌트카 등록시간: "+showTime());
		System.out.println("렌트카를 조회합니다.");
	}
	//차의 정보를 수정하는 메서드
	public void modCarInfo() {
		System.out.println("렌트카 정보 수정시간 : "+showTime());
		System.out.println("렌트카를  조회합니다.");
	}
	//기존에 등록된 렌트카 정보를 삭제하는 메서드
	public void delCarInfo() {
		System.out.println("렌트카 정보 삭제 시간:"+showTime());
		System.out.println("렌트카를 조회합니다.");
	}

}
