package java0615A;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

//Runnable 인터페이스를 활용한 스레드 구현
class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	
	// 생성자로 라벨 전달 받아 젖아
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	// run() 구현
	@Override
	public void run() {
		int n=0;
		// 텍스트 라벨의 숫자가1초 간격으로 무한히 올라감
		while(true) {
			timerLabel.setText(String.valueOf(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
public class E12RunnableTest extends JFrame {
	public E12RunnableTest() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		setSize(250, 150);
		setVisible(true);
		
		TimerRunnable runnable =new TimerRunnable(timerLabel);
		// Runnable 인터페이스를 상속 받는 클래스를 스레드 객체로 만든 것
		Thread th = new Thread(runnable);
		th.start();
	}
	public static void main(String[] args) {
		new E12RunnableTest();
	}
} // 내일의 과제 isPaused 필드를 사용합니다 synchronized notify()
//resume() 메서드안에는 synchronized notify()를 사용합니다
//쓰레드답게 레이블 클릭시 addMouseListener()를이용합니다

//동기화(synchronized)의 의미
//하나의 작업이 완전히 완료된 후 다른  작업 수행
//비동기식: 하나의 작업 명령 이후(완료와 상관없이) 바로 다른 작업 명령을 수행
//동기화(synchronized)의 필요성
//	-두 개의 Thread가 하나의 객체를 공유하는 경우