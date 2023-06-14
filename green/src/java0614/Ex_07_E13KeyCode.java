package java0614;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex_07_E13KeyCode extends JFrame{
	private JLabel la = new JLabel("Start!!");
	
	public Ex_07_E13KeyCode() {
		setTitle("Key Code에서 f1키: 초록색, %키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
//addKeyListener 메서드를 통해 키보드 이벤트 추가
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
//키 이벤트 포커스를 받을 컴포넌트가 여러개 일 때 우선순위 지정
//키 이벤트는 포커스가 위치해 있어야 발생한다. 
//setVisible(true) 다음에 써줘야 한다
		c.setFocusable(true);
	}
//키 이벤트 관련 클래스
//KeyAdapter 클래스를 활용해 코드 간략화
	class MyKeyListener extends KeyAdapter {
//키가 눌렸을 때		
		public void keyPressed(KeyEvent e) {
//입력된 키보드의 키의 코드 번호값 획득
//키값 그대로 획득 하려면 getKeyChar() 메서드 활용
			la.setText(e.getKeyText(e.getKeyCode()));
//키보드이벤트의 e의 KeyCode를 받은 후 그것을 텍스트로 바꾸고,
//그것을 변수 la에 저장함
//getKeyChar: 키의 문자(유니코드) 알아내기
			Container contentPane =(Container)e.getSource();
			if(e.getKeyChar()=='%' )// %가 입력됬을 때 배경색을 바꿈
				contentPane.setBackground(Color.YELLOW);
//getKeyCode: 입력된 키의 가상 키 값 알아내기
//f1이 입력됬을 때 배경색을 바꿈
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		new Ex_07_E13KeyCode();
	}
}//가상키
//유니코드든 아니든(제어키) 모든 키에 자바의 가상 키 코드가 정의되어 있음
//가상 키 코드는 keyEvent 클래스에 상수로  선언
//VK_0~VK_9 0에서 9까지의 키 유니코드값과 동일하다
