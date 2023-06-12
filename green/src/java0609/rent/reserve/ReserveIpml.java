package java0609.rent.reserve;

import java0609.rent.base.Base;

//Reserve ㅣㄴ터페이스를구현하는 구현클래스이다. impl
//인터페이스에서 선언된메서드를 실제 그 기능을 구현하는 클래스다. 
//실제 각각의추상 메서드의 기능을 구현한다
public class ReserveIpml extends Base implements Reserve{
	//멤버변수 선언
	private String resCarNumber;
	private String resDate;
	private String useBeginDate;
	private String returnDate;
//	getters and setters
	
	//차를예약하는기능을 하는 메서드
	@Override
	public String reserveCar() {
		System.out.println("렌트카 예약 시간: " +showTime());
		//부모 클래스의 showTime 메서드를 사용하여 메서드 호출 시간을 출력한다.
		System.out.println("차를 예약합니다");
		return "예약차 정보";
	}
	//차 예약정보를 수정하는 메서드
	@Override
	public void modReserveInfo() {
		System.out.println("렌트카 예약 정보 수정시간 : "+ showTime());
		System.out.println("차를 예약합니다.");
	}
	//차 예약 정보를 취소하는 메서드
	@Override
	public void cancelReserveIinfo() {
		System.out.println("렌트카 예약정보 삭제 시간: "+showTime());
		System.out.println("차를 예약합니다.");
	}
	
	
}
