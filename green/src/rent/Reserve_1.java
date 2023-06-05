package rent;


import java.util.Scanner;

class Store {
	public static String g;
	public static String b;
	public static String h;
	public static String y;
}

public class Reserve_1 {
	Scanner sc = new Scanner(System.in);

	public Reserve_1() {
		while (true) {
			System.out.println("차량을 받을 지점을 선택해주세요.\n" + Store.g + "\n" + Store.b + "\n" + Store.h + "\n" + Store.y);
			String intpo = sc.next();
			if (intpo.equals(Store.g) || intpo.equals(Store.b) || intpo.equals(Store.h) || intpo.equals(Store.y)) {// 값이
																													// 동일한지
																													// 확인
				System.out.println(intpo + "을 선택하셨습니다.");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}

	}

//			String[] aa = ReserveDate.split("-");
//			for(String a:aa) {
//				System.out.println(a);
//			}
//
//	public void SR() {
//		System.out.println("예약번호를 입력해주세요: ");
//		int dfdf = sc.nextInt();
//		
//		if (dfdf == phoneNumber) {
//			System.out.println("예약자 확인이 완료되었습니다.");
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//		}
//	}

//	public void fuel() {
//		System.out.println("차량주유여부 입력칸입니다 차량번호를 입력해주세요: ");
//		String fdfr = sc.next();
//		while (carNumber == fdfr) {
//			System.out.println("차량번호 확인이 완료되었습니다.");
//			if (fuel <= 80) {
//				System.out.println("주유를 하지않아도 됩니다");
//			} else {
//				System.out.println("주유를 하셔야합니다");
//			}
//		}
//	}

//	public void Lend() {
//		System.out.println("차량을 빌리시겠습니까? Y or N");
//		char rbej = sc.next().charAt(0);
//		if (rbej == 'Y') {
//			System.out.println("차량을 빌리셨습니다");
//		} else if (rbej == 'N') {
//			System.out.println("취소하였습니다");
//		}
//	}

	public static void main(String[] args) {
		Store.g = "강남지점";
		Store.b = "분당지점";
		Store.h = "해운대지점";
		Store.y = "연수구지점";
		// 이후 코드 작성
		
        
	}
}
