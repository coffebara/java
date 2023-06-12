package java0609.rent.member;

import java0609.rent.base.Base;

//Member 인터페이스를구현하는 구현클래스이다
//인터페이스에서선언된 메서드를실제 그기능을 구현하는 클래스이다
//같은 클래스 내에서 인터페이스로 분리된 메서드와 다른메서드를 구분해서소스의 구조를
//명확하게 하고 가독성을 좋게해서 효율적으로 소스관리를 할수 있다.
public class MemberImpl extends Base implements Member {
	private String id;
	private String password;
	private String name;
	private String address;
	private String phoneNum;

	// getters and setters
	// 새로운 회원 정보를 등록하는 메서드
	public void regMember() throws MemberException{
		name="홍길동";
		if(name==null || name.equals("")) {
			throw new MemberException("이름은 필수 입력 정보입니다.");
		} else {
			System.out.println("회원 등록시간: "+showTime());
			//부모 클래스의 showtime 메서드를 사용하여 메서드 호출 시간을 출력한다.
			System.out.println("회원 가입합니다.");
		}
	}
	// 기존 회원의 정보를 조회하는 메서드
	public String viewMember() throws MemberException{
		System.out.println("회원 조회시간: "+showTime());
		return " 조회된 회원 정보";
	}

	// 등록된 회원의 정보를 수정하는 메서드
	public void modMember() throws MemberException{
		System.out.println("회원 수정시간: "+showTime());
		System.out.println("회원 정보를 수정합니다.");
	}

	// 기존 회원이 탈퇴 시 회원정보를 삭제하는 메서드
	public void delMember() throws MemberException{
		System.out.println("회원 삭제시간: "+showTime());
	}

}
