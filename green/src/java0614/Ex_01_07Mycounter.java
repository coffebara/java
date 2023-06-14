package java0614;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ex_01_07Mycounter extends JFrame implements ActionListener {
	private JLabel label, label1;
	private JButton increaseButton, decreaseButton, stopButton;
	private int count = 0;
	private Timer timer;

	public Ex_01_07Mycounter() {
		JPanel panel = new JPanel(); // 패널 생성
		label = new JLabel("Counter");
		panel.add(label); // 패널에

		label1 = new JLabel("" + count);
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel.add(label1);

		increaseButton = new JButton("자동 증가");
		panel.add(increaseButton);
		increaseButton.addActionListener(this);// 현재객체
//현재객체인  Ex_01_07Mycounter 객체를  이벤트 리스너로 등록

		decreaseButton = new JButton("자동 감소");
		panel.add(decreaseButton);
		decreaseButton.addActionListener(this);// 현재객체

		stopButton = new JButton("멈춤");
		panel.add(stopButton);
		stopButton.addActionListener(this);

		add(panel);

		setSize(500, 300);
		setTitle("My Counter");
		setVisible(true); // 기본값은 false
	}

	@Override
	public void actionPerformed(ActionEvent e) {// 이벤트가 발생한 객체를 반환하는 메서드
		// 자동 증가 시작, e.getSource()를 사용하면 어떤 버튼이 클릭되었는지를 알 수 있다.
		if (e.getSource() == increaseButton) {
			// 자동 증가 시작
			if (timer != null)
				timer.stop();
//			if (timer == null) {
			timer = new Timer(1000, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					label1.setText("" + count);
				}
			});
			timer.start();
		} else if (e.getSource() == decreaseButton) {
			if (timer != null)
				timer.stop();
//			if (timer == null) {
			timer = new Timer(1000, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					count--;
					label1.setText("" + count);
				}
			});
			timer.start();
		} else if (e.getSource() == stopButton) {
			// 자동증가 멈춤
			if (timer != null) {
				timer.stop();
				timer = null;
			}
		}
	}

	public static void main(String[] args) {
		new Ex_01_07Mycounter(); // 클래스의 객체를 생성: 생성자 호출 -> 객체가 생성된다
	}
}
//class MymouseListener implements MouseListener {
//아래의5개 메서드를 개발자가 구현해야함
//public void mousePressd(MouseEvent e); //마우스 버튼이 눌러지는 순간호출
//public void mmouseReleased(MouseEvent e); //눌러진 마우스 버튼이 떼어지는 순간 호출
//c.addMouseListener(new MyMouseListener());
// 만약 interface MouseListener 을 사용하면, 리스너 작성시 추상 메서드를 모두구현해야 한다
// 즉) mousePressed()만사용하려고 해도 나머지 4개를 무조건 적어야하는 부담이 생긴다. 
//이럴 때 어댑터 클래스를 사용한다. 
//어댑터 클래스란? 리스너의 모든 메서드가 단순 리턴하도록 구현해 놓은 클래스
//ex) 마수으 리스너를 예로 들었을 때
//class MaousAdapter implements
//		MouseListener, MoustMotionListener, mouseWheelListener {} 이므로
//		활용하지 않는 추상 메서드 현하지 않아도 된다.
//리스너 인터페이스에서 대응하는 어댑터클래스가 전부 있는건 아니다
//KeyListener 은 KeyAdapter가 있다 MouseAdapter도 있다
//ActionListener는 대응 어댑터가 없다