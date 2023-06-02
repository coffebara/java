package java0601;
import java.util.*;

public class City {
	private String city;
	private int population;
	private double rate;
	Scanner sc = new Scanner(System.in);
	
	public void readInput() {
		System.out.print("도시 이름을 입력하세요: ");
		this.city = sc.nextLine();
		System.out.print("인구를 입력하세요: ");
		this.population = sc.nextInt();
		sc.nextLine();
		System.out.print("인구 증가율(%)을 입력하세요: ");
		this.rate = sc.nextDouble();
		sc.nextLine();
	}
	public void writeOutput() {
		System.out.print("\n도시 = "+this.city+
				"\n인구 = "+this.population+
				"\n인구 증가율 = "+this.rate+"%\n");
	}
	public int computeFuturePopulation(int years){
		int newPopulation;
		newPopulation = (int)(this.population*(Math.pow((1+rate/100),years)));
		
		return newPopulation;
	}
	
}
