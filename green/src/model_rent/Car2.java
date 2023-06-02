package model_rent;
import java.util.Scanner;

public class Car2 {
	Scanner sc = new Scanner(System.in);
	public String carNumber;//지장
	public boolean carRent;
	public char carType;
	public int fuel; 
	
	public Car2() {
		
	}
	
	public Car2(String carNumber, boolean carRent, char carType, int fuel) {
		this.carNumber = carNumber;
		this.carRent = carRent;
		this.carType = carType;
		this.fuel = fuel;
	}
	


	public void drive() {
		System.out.println("운전시작");
	}
	public void stop() {
		System.out.println("운전끝");
	}
	public void airCondition () {
		System.out.println("에어컨 사용합니다");
	}
	public void parking() {
		System.out.println("주차하겠습니다.");
	}
	
	
}

