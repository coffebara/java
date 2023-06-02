package java0601;

import java.util.Scanner;

public class CityDriver {
	public static void main(String[] args) {
		City aCity;
		// 예상 인구
		int newPopulation;
		int years = 10;
		Scanner keyboard = new Scanner(System.in);
		// 계속 여부
		boolean again = true;
		// 사용자가 계속하기를 원하는 동안 도시의 10년후 예상 인구를 게산한다
		while(again) {
			// City 객체를  생성하고 aCity가 가리키게 한다
			aCity = new City();
			// aCity의 도시 이름, 인구와 인구 증가율을 읽어 들인다
			aCity.readInput();
			// aCity의 도시 이름, 인구와 인구 증가율을 출력한다
			aCity.writeOutput();
			//aCity의 10년 후 인구를 계산한다
			newPopulation = aCity.computeFuturePopulation(years);
			// aCity의 예상 인구를 출력한다
			System.out.println(years + "년 후 예상 인구: " + newPopulation);
			// 계속 여부를 입력 받는다
			System.out.print("계속하기를 원하세요(true 혹은 false)?: ");
			again = keyboard.nextBoolean();
		}
	}
}

//도시 이름을 입력하세요: 서울
//인구를 입력하세요: 1000
//인구 증가율(%)을 입력하세요: 10

//도시 = 서울
//인구 = 10000
//인구 증가율 = 10.0%
//10년후 예상 인구: 5937
//계속하기를 원하세요(true 혹은 false)?: false;