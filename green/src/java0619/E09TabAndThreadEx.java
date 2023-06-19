package java0619;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class E09TabAndThreadEx extends JFrame {
	// 라벨 객체 생성 (공유 객체)
	E09MyLabel bar = new E09MyLabel(100);
			
	E09TabAndThreadEx(String title){
		//프레임 셋팅
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		// 라벨 배경색 오렌지, 배경 보이기 활성화
		bar.setBackground(Color.WHITE.ORANGE);
		bar.setOpaque(true);
		// 라벨 위치, 크기 지정
		bar.setLocation(20, 50);
		bar.setSize(300,20);
		// 프레임에 넣고 무명 클래스로 키 이벤트 생성 및 지정
		c.add(bar);
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// 아무 키나 눌리면 bar객체의 fill 메서드 실행
				bar.fill();
			}
		});
		// 프레임 셋팅
		setSize(350,200);
		setVisible(true);
		c.requestFocus(); // 현재 컴포넌트에 포커스 강제 지정
		c.setFocusable(true); // 현재 컴포넌트가 포커스를 받을 수 있게 지정
		// 라벨 객체 넘기며 스레드 생성 및 실행
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}
	public static void main(String[] args) {
		new E09TabAndThreadEx("보기만 해");
	}
}
