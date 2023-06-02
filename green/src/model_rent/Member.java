package model_rent;
import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String phone;
	private String reserveNumber = "a7b3c9d";
	private boolean license;
	private int payment;
	static private int num=0;
//	private String id;
//	private String pw;
	
	public String reserve() {
		System.out.print("이름을 입력하세요. : ");
		this.name = sc.nextLine();
		System.out.print("핸드폰 번호를 입력하세요. 예)010-1111-1111 : ");
		this.phone = sc.nextLine();
		System.out.println("면허증 유무 true/false");
		license = sc.nextBoolean();
		if(!license) {
			System.out.println("면허증이 필요합니다. 다음에 다시 이용해주세요.");
			return "";
		}
		reserveNumber += ++num;
		System.out.println("예약이 완료되었습니다. \n예약번호는 :"+reserveNumber+"입니다.");
		return reserveNumber;
	}
	public void use() {
		System.out.println("자동차를 사용합니다.");
	}
	public void pay() {
		System.out.println("결제 방식을 선택해주세요.\n1.카드 2.현장결제 3.무통장입금");
		this.payment = sc.nextInt();
	}
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.reserve();
	}
}
