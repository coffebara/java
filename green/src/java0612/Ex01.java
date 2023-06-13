package java0612;

public class Ex01 {
	public static void main(String[] args) {
// 각 기본타입 객체 배열 생성
		Integer[] inum  = {1,2,3,4,5};
		Double[] dnum = {1.0,2.0,3.0,4.0,5.0};
		String[] snum= {"1","2","3","4","5"};
// 각 기본 타입의 제네릭 객체 생성 및 위에서 생성한 배열로 초기화
		NumUtil<Integer> iutil = new NumUtil<Integer>(inum);
		NumUtil<Double> dntil = new NumUtil<Double>(dnum);
		NumUtil<String> sutil = new NumUtil<String>(snum);
// 각 객체마다 초기화한 배열의 제일 큰 값 출력
		System.out.println("inum 최대값 : " + iutil.max());
		System.out.println("dnum 최대값 : " + dntil.max());
		System.out.println("snum 최대값 : " + sutil.max());
	}
}
