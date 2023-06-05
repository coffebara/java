package java0605;

public class MyOuter2 {
	private String name;;
	private int age;
	public MyOuter2(String name, int age) {
		this.name = name;
		this.age= age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
//	public String getInner (String adrress) {
//		Inner i = new Inner(adrress);
//		return i.getUserInfo();
//	}
	public class Inner{
		private String address; //자신만의 인스턴스 값을 가질 수 있다
//		static String tel = "010-1111-2222"; // 공유, 클래스멤버 동작한다
		public Inner(String address) {
			this.address = address;
		}
		public String getUserInfo() {
//			return name + "" + age; // 에러 외부 클래스의 인스턴스변수 접근
			return "이름: "+name+" 나이: "+age+"주소는:" + address;
		}
	}
}//내부 클래스는 외부 클래스의 private 멤버에 접근 가능하다.

