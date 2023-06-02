package model_rent;

import java.util.Random;
import java.util.Scanner;

public class Car {
	String carNumber; // 5개 번호 지정
	boolean carRent; // 렌트 여부
	String carType; // 전기차, 휘발유차, 경유차
	int fuel; // 랜덤값으로 0~100까지 나오게 하기

	public Car(String carNumber, boolean carRent, String carType, int fuel) {
		this.carNumber = carNumber;
		this.carRent = carRent;
		this.carType = carType;
		this.fuel = Fuel();
	}

	public void drive() {
		System.out.println(carNumber + "이(가) 주행 중입니다.");
	}

	public void stop() {
		System.out.println(carNumber + "이(가) 정지했습니다.");
	}

	public void aircondition(int temperature) {
		System.out.println(carNumber + "의 에어컨을 설정한 온도로 조절합니다: " + temperature + "도");
	}

	public void park() {
		System.out.println(carNumber + "이(가) 주차되었습니다.");
	}

	public int Fuel() {
		Random random = new Random();
		return random.nextInt(101);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Car[] cars = new Car[5];
		cars[0] = new Car("01가1234", true, "전기차", 0);
		cars[1] = new Car("02나5678", false, "휘발유", 0);
		cars[2] = new Car("03다1234", true, "경유", 0);
		cars[3] = new Car("04라5678", true, "휘발유", 0);
		cars[4] = new Car("05마2346", true, "경유", 0);

		Scanner keyboard = new Scanner(System.in);
		boolean again = true;
		while (again) {
			System.out.print("차량 정보를 조회할 차량 번호를 입력하세요:(ex. 1) ");
			int input = scanner.nextInt();

			if (input >= 1 && input <= cars.length) {
				int index = input - 1;
				System.out.println("Car[" + input + "] 정보:");
				System.out.println("차량번호: " + cars[index].carNumber);
				System.out.println("렌트 여부: " + cars[index].carRent);
				System.out.println("차량 종류: " + cars[index].carType);
				System.out.println("연료량: " + cars[index].fuel + "%");
			} else {
				System.out.println("잘못된 차량 번호입니다.");
			}
			System.out.println("계속하기를 원하세요(true 혹은 false)?: ");
			again = keyboard.nextBoolean();
		}
	}
}
