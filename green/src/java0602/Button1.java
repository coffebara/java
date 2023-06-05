package java0602;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Button1 extends JFrame{
	Button1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("대박");
		setLayout(new FlowLayout());
		Button btn1 = new Button("가위");
		Button btn2 = new Button("바위");
		Button btn3 = new Button("보");
		add(btn1); 	// 버튼추가
		add(btn2); 
		add(btn3); 
		btn1.setBackground(Color.CYAN);
		btn3.setForeground(Color.RED);//보 색깔만 레드
		btn2.setEnabled(false); //바위 사용 안함
		setBackground(Color.PINK);
		setForeground(Color.BLUE);
		setSize(200,200);
		setVisible(true); // 보여주는값을 참으로해서 보여주겠다
	}//인코딩 문제로 한글이 깨질수 있습니다.
	public static void main(String[] args) {
		new Button1();
//		main()메소드에서 Button1 클래스  실행
//		Button1()생성자가 실행되므로 window참이 출력
	}
}
//AWT와 Swing 패키지 등 어떤 언어보다 강력한 GUI 라이브러리를 제공하며,
//GUI를 쉽게 구성할 수 있도록 해준다.
//-Dfile.encorfing=MS949