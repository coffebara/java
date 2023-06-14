package java0614;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex_04_03 extends JFrame{
//마우스  클릭에 따른 JLabel 객체 조정
//Follow문구의 좌표값을 얻어서 마우스 클릭하면
//문구가마우스 찍은곳으로 움직이게!
//JLabel 객체 생성 후 문자 입력
	private JLabel la = new JLabel("Follow");
	
	public Ex_04_03() {
//JFrame 설정
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//swing에서 모든 컴포넌트를 받을 수 있는 컨테이너 객체 생성.
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
//배치관리자 제거
//**setLayout 메서드에 null을 입력해
//내부 요소들의 정렬 방식을 지정하지 않는다.
		c.setLayout(null);
//이후 JLabel 객체의 정보를 지정한다.
		la.setSize(50, 20);
		la.setLocation(30, 30);
//JFrame객체에 입력
		c.add(la);
		setSize(500, 500);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener {
// 마우스가 클릭되면
		public void mousePresseed(MouseEvent e) {
//이벤트가 어떤사건, x좌표 y좌표 하나하나
//마우스를 눌렀을 때 그 좌표값을 알아야되는데 그 값을 어떻게 얻어오지?
//get은 값을 가져온다. X 좌표값을 가져온다 !
//set은 입력받은값을 출력한다
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);//해당 컴포넌트가 지정된 좌표로 이동합니다
		}
		public void mouseReleased(MouseEvent e) {}

		public void mouseClicked(MouseEvent e) {}

	    public void mousePressed(MouseEvent e) {}

	    public void mouseEntered(MouseEvent e) {}

	    public void mouseExited(MouseEvent e) {}
	}
//생성자를  실행한다.
	public static void main(String[] args) {
		new Ex_04_03();
	}
}
//사용자의 키보드 조작에 따른 이벤트 발생
//키를 누르는 순간, 누른 키를 떼는 순간 keyPressed, 누른 키를 떼는 순간 keyReleasd
//누른 키를 떼는 순간(UNICODE키 경우에만) keyTyped가 해당된다
//
//* 키 이벤트를 받을 수 있는 조건
//모든 컴포넌트가 가능하지만, 현재 포커스(focus)를 가진 컴포넌트
//
//포커스란?
//컴포넌트나 응용프로그램이 키 이벤트를 독점하는 권한
//<컴포넌트에 포커스 설정하는 방법>
//setVisible(true) //스윙 프레임 출력 이후에 포커스 추가해야 한다.
//component.setFocusable(true); 
//component가 포커스를 받을 수 있도록 설정
//자바 플랫폼마다 실행 환경의 초기화가 다를수 있기 때문에 필요한 코드이다