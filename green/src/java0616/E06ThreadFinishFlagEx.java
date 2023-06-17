package java0616;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class E06ThreadFinishFlagEx extends JFrame{
	// 스레드 객체 선언
	private E06RandomThread th;
	
	public E06ThreadFinishFlagEx() {
		// 프레임 셋팅
		setTitle("E06ThreadFinishFlagEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		// 무명 클래스로 마우스 이벤트 생성 (어댑터 사용)
		c.addMouseListener(new MouseAdapter() {
			// 마우스로 프레임 안을 클릭하면 스레드 종료
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});
		// 프레임 셋팅
		setSize(300 ,200);
		setVisible(true);
		// 스레드 객체 생성 및 시작
		th = new E06RandomThread(c);
		th.start();
	}
	public static void main(String[] args) {
		new E06ThreadFinishFlagEx();
	}
}
