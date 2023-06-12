package java0609.rent;

import java0609.rent.car.Car;
import java0609.rent.car.CarImpl;
import java0609.rent.common.exception.RentException;
import java0609.rent.common.util.UtilDisp;
import java0609.rent.member.Member;
import java0609.rent.member.MemberImpl;
import java0609.rent.reserve.Reserve;
import java0609.rent.reserve.ReserveIpml;

public class RentTest {
	public static void main(String[] args) {
		String carInfo;
		String resData;
		try {
			// 회원 가입하기
			Member member = new MemberImpl(); // upcasting
			member.regMember();

			// 렌트카를 조회한다.
			Car car = new CarImpl(); // upcasting
			carInfo = car.checkCarInfo();
			UtilDisp.displayData(carInfo);

			// 예약을 한다.
			Reserve reserve = new ReserveIpml(); // upcasting
			resData = reserve.reserveCar();
			UtilDisp.displayData(resData);
			// 예약을 수정한다.
			reserve.modReserveInfo();

			// 예약을취소한다.
			reserve.cancelReserveIinfo();
		} catch (RentException e) {
			System.out.println(e.getRentExceptionInfo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//업캐스팅은 부모의 눈높이에맞추고 다운캐스팅은 자식의 눈높이에 맞춘다
}//업캐스팅(upcasting)은 서브클래스(subclass, 즉 자신 클래스)의 인스턴스를
//슈퍼클래스(superclass, 즉 부모 클래스)의 타입으로 변환하는 것
//다운캐스팅(downcasting)은 슈퍼클래스의인스턴스를 서브클래스의 타입으로 변환하는것
//ClassCastException이 발생한다