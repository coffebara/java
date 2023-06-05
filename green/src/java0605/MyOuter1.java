package java0605;
//static 내부 클래스 정의
//내부 클래스가 static으로 지정된 클래스
//내부 클래스 멤버가 static으로 지정되었으면 내부 클래스도 반드시 static으로 지정해야 한다
public class MyOuter1 {
	private String name;;
	private int age;
	public MyOuter1(String name, int age) {
		this.name = name;
		this.age= age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	static class Inner{
		private String address;
		private String tel = "010-1111-2222";
		public Inner(String address) {
			this.address = address;
		}
		public String getUserInfo() {
//			return name + "" + age; // 에러 외부 클래스의 
			return "주소는:" + address + " , 전화번호: "+ tel;
		}
	}
}



// 고객정보 >> 주소는:세종시 세종구 , 전화번호: 010-1111-2222