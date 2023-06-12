package java0609.rent.member;

//온라인 렌트카 예약 시스템에서 Member인터페이스에 회원에 관한 기본적이고
//핵심적인 비즈니즈 로직을 처리하는기능을추상 메서드로 선언한다.
public interface Member {
	//회원 정보를 등록하는 메서드
	public void regMember() throws MemberException;
	
	//등록된 회원의 정보를 조회하는 메서드
	public String viewMember() throws MemberException;
	
	//등록된 회원의 정보를 수정하는 메서드
	public void modMember() throws MemberException;
	
	//등록된 회원이 탈퇴 시 회원정보를 삭제하는 메서드
	public void delMember() throws MemberException;

}
