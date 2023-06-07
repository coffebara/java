package java0607;

interface Repairable {

}// 유닛이 갖는 공통 성질을 가진 최상위클래스

class Unit {
	int hitPoint;
	final int MAX_HP;
	/* Repairable */ String u;

	Unit(int hp) {
		MAX_HP = hp;
//		System.out.println(hp);
	}
}

//유닛의 큰 범주를 나누는 클래스
class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

//유닛의 큰 범주를 나누는 클래스
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
//세부 유닛 클래스 상위 클래스의 성질을 상속받음
class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	@Override
	public String toString() {
		return "Tank";
	}
}
//세부 유닛 클래스 상위 클래스의 성질을 상속받음
class Marine extends GroundUnit{
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine";
	}
}
//세부 유닛 클래스 상위 클래스의 성질을 상속받음
class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	//repair라는 세부 동작이 추가되어있다.
	void repair(Repairable r) {
//		Unit name = new Unit(r);
//		instanceof 현재 레퍼런스가 어떤 클래스의형의 객체 주소를 참조하고 있는지
//		알고싶을 때 사용
		if(r instanceof Unit) {
			Unit u = (Unit) r;//r이 가르키는 객체를 unit 타입으로 캐스팅한다
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
//			System.out.println("Tank 수리완료");;
			System.out.println(u.toString() + "수리완료");
		}
	}
	@Override
	public String toString() {
		return "SCV";
	}
}
public class Ex_04 {
	public static String print(Unit r) {
		Unit u = (Unit) r;
		return u.toString() +"의 hp: " + u.MAX_HP;
	}
	public static void main(String[] args) {
		//각 유닛의 객체 생성
		Tank t = new Tank();
		Marine m = new Marine();
		SCV s = new SCV();
		
		s.repair(t);
//		s.repair(m);
		print(t);
		print(m);
		print(s);
//		System.out.println("Tank의 hp: "+t.MAX_HP);
//		System.out.println("Marine의 hp: " +m.MAX_HP);
//		System.out.println("SCV의 hp: " + s.MAX_HP);
	}
}
