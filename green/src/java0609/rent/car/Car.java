package java0609.rent.car;

//온라인 렌트카 예약 시스템에서 렌트카에 대한 기능적이고 핵심적인 기능을 하는
//추상메서드를 선언한다
public interface Car {
	//렌트카 정보를 조회하는 메서드
	public String checkCarInfo();
	//샐운 렌트카를 등록하는 메서드
	public void regCarInfo();
	//기존의 렌트카 정보를 수정하는 메서드
	public void modCarInfo();
	//기존에 등록된 렌트카 정보를 삭제하는 메서드
	public void delCarInfo();
}
