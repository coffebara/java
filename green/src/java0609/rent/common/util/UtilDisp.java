package java0609.rent.common.util;

public class UtilDisp {
//프로그램 실행 중에 공통적으로 자주 사용되므로
//미리 static으로 지정해서 메모리에생성시켜놓는다.
	public static void displayData(String data) {
		System.out.println("조회한 데이터는 " + data + " 표시합니다.");
	}
}
