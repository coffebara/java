package java0602;

public class Ex_13 {
	String title;
	String author;

	public Ex_13(String t) {
		title = t;
		author = "작자미상";
	}
	public Ex_13(String t, String a) {
		title = t;
		author = a;
	}
	public static void main(String[] args) {
		// 두 클래스 모두 객체를 생성했으므로 static을 사용하지 않아도 된다.
		Ex_13 littlePrince = new Ex_13("어린왕자", "생택쥐페리");
		Ex_13 lovestory = new Ex_13("춘향전");
		System.out.println(littlePrince.title + " "+littlePrince.author );
		System.out.println(lovestory.title + " "+lovestory.author );
	}
}
