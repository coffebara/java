package rent;

import java.util.Scanner;

public class Member {

	Scanner scan = new Scanner(System.in);

	private String name;
	private String phoneNumber;
	private String license;
	private int choose;
	private String YorN;

	public boolean SignUp() {
		System.out.print("이름을 입력하세요: ");
		name = scan.next();

		while (true) {
			System.out.print("휴대폰 번호를 입력하세요('-' 제외): ");
			phoneNumber = scan.next();

			if (phoneNumber.length() == 11) {

				while (true) {
					System.out.print("면허가 있습니까(Y/N)? : ");
					license = scan.next();

					if (license.equalsIgnoreCase("y")) {
						System.out.println();
						System.out.println("회원가입이 완료되었습니다");
						System.out.println("이름: " + name);
						System.out.println("휴대폰 번호: " + phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 7)
								+ "-" + phoneNumber.substring(7, 11));
						System.out.println();
						while (true) {
							System.out.print("예약하시겠습니까(Y/N)? : ");
							YorN = scan.next();

							if (YorN.equalsIgnoreCase("y")) {
								System.out.println();
								return true;
							} else if (YorN.equalsIgnoreCase("n")) {
								System.out.println("감사합니다");
								return false;
							} else {
								System.out.println();
								System.out.println("잘못 눌렀습니다. Y와 N중에 다시 입력해주세요.");
								System.out.println();
							}
						}
					} else if (license.equalsIgnoreCase("n")) {
						System.out.println("가입이 불가능합니다");
						return false;
					} else {
						System.out.println();
						System.out.println("잘못 눌렀습니다. Y와 N중에 다시 입력해주세요.");
						System.out.println();
					}
				}
			} else {
				System.out.println();
				System.out.println("다시 입력해주세요");
				System.out.println();
				continue;
			}
		}
	}

	public void Pay() {
		while (true) {
			System.out.println("결제방법을 선택해주세요.");
			System.out.print("1.카드결제, 2.현금결제, 3.무통장입금, 4.돌아가기 : ");
			choose = scan.nextInt();
			if (choose == 1) {
				System.out.println();
				System.out.println("카드결제를 선택하셨습니다");
				break;
			} else if (choose == 2) {
				System.out.println();
				System.out.println("현장결제를 선택하셨습니다");
				break;
			} else if (choose == 3) {
				System.out.println();
				System.out.println("무통장입금을 선택하셨습니다.");
				break;
			} else if (choose == 4) {
				System.out.println();
				if (SignUp()) {
					continue;
				}
			} else {
				System.out.println();
				System.out.println("1부터 4중에 다시 선택해주세요");
				System.out.println();
			}
		}

	}

	public void Use() {
		// Use() 메서드의 구현
		System.out.println();
		System.out.println("예약이 완료되었습니다");
		System.out.println("예약번호는 " + phoneNumber + " 입니다.");
	}
}
