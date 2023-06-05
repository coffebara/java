package rent;
public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();

		if (m.SignUp()) {
			m.Pay();
			m.Use();
		}
	}

}
