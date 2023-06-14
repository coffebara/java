package java0614;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex_10_FlyingTextEx_16 extends JFrame {

//한 번의 키 조작으로 이동하는 거리(픽셀)
	private final int FLYING_UNIT = 10;
//이동할 타겟의 문자열
	private JLabel la = new JLabel("KeyBoard로");

	public Ex_10_FlyingTextEx_16() {
		setTitle("상하좌우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
//컨테이너 배치 관리자 삭세
		c.setLayout(null);
//JFrame 객체에 마우스 이벤트 설정
		c.addKeyListener(new MyKeyListener());
//MyKeyListener 클래스의 인스턴스를 생성하여 JFrame인 la객체의 속성을 변경하는 메서드
		la.setSize(100, 20);
		la.setLocation(50, 50);
		c.add(la);
		setSize(500, 500);
		setVisible(true);
//키 이벤트 포커스를 받을 컴포넌트가 여러개 일 때 우선순위 지정
//키 이벤트는 포커스가 위치해 있어야 발생한다
		c.setFocusable(true);
	}

//key리스너 구현, keyAdapter로 받았기에 다른 메서드는 적지 않아도 된다.
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
//입력된 키의 코드를 알아낸다.			
			int keyCode = e.getKeyCode();
//코드 값에 따라 상하좌우 키를 판별하도록 la의 위치를 이동시킨다.			
			switch (keyCode) {
//FLYING_UIT은 la가 움직이는 폭
//차으이 최 상단 외쪽의  시작은 0,0
//x축은 오른쪽으로 갈수록 값이 커지고 왼쪽으로 갈수록 값이 작아진다
//y축은 아래쪽으로 갈수록 값이 커지고 위쪽으로 갈수록 값이 작아진다
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
				break;
			}
		}
	}
	public static void main(String[] args) {
		new Ex_10_FlyingTextEx_16();
	}

}
