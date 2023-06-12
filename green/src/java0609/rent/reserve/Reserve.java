package java0609.rent.reserve;

//온라인 렌트카 예약 시스템에서 회원이 렌트카 예약 대한 기본적이고
//핵심적인 기능을 하는 추상 메서드를 선언한다.
public interface Reserve {
	//렌트카예약 기능을 하는 메서드
	public String reserveCar();
	
	//예약된 렌트카 정보를 수정하는 메서드
	public void modReserveInfo();
	
	//예약된 렌트카 정보를 삭제하는메서드
	public void cancelReserveIinfo();
}
