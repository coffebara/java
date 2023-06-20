package java0620;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E09BulletGameFrame extends JFrame {
	public E09BulletGameFrame() {
		setTitle("사격 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel p = new GamePanel();
		setContentPane(p);
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
		p.startGame();
	}

	public static void main(String[] args) {
		new E09BulletGameFrame();
	}
}

class GamePanel extends JPanel {
	TargetThread targetThread = null;
	JLabel baseLabel = new JLabel();
	JLabel bulletLabel = new JLabel();
	JLabel targetLabel;

	public GamePanel() {
		setLayout(null);
		baseLabel.setSize(40, 40);
		baseLabel.setOpaque(true);
		baseLabel.setBackground(Color.BLACK);

		ImageIcon img = new ImageIcon("enemy.png");
		targetLabel = new JLabel(img);
		targetLabel.setSize(img.getIconWidth(), img.getIconHeight());

		bulletLabel.setSize(10, 10);
		bulletLabel.setOpaque(true);
		bulletLabel.setBackground(Color.RED);

		add(baseLabel);
		add(targetLabel);
		add(bulletLabel);
	}

	public void startGame() {
		baseLabel.setLocation(this.getWidth() / 2 - 20, this.getHeight() - 40);
		bulletLabel.setLocation(this.getWidth() / 2 - 5, this.getHeight() - 50);
		targetLabel.setLocation(0, 0);
		// 베이스, 총알, 타겟의 위치 설정 베이스와 총알은 사진 크기를 기반으로 설정
		targetThread = new TargetThread(targetLabel);
		targetThread.start();
		baseLabel.requestFocus();
		// 타겟스레드 객체 생성 및 스레드 실행, 베이스라벨에 포커스 요구
		baseLabel.addKeyListener(new KeyAdapter() {
			// 베이스 라벨에 키리스너 추가 어댑터사용, 무명클래스
			BulletThread bulletThread = null;

			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '\n') {
					if (bulletThread == null || !bulletThread.isAlive()) {
						bulletThread = new BulletThread(bulletLabel, targetLabel, targetThread);
						bulletThread.start();
					}
				}
			}
		});

	}

	class TargetThread extends Thread {
		JComponent target;

		public TargetThread(JComponent target) { // 생성자, 위치설정 및 메서드 호출
			this.target = target;
			target.setLocation(0, 0);
			target.getParent().repaint();
		}

		public void run() {
			while (true) {
				int x = target.getX() + 5;
				int y = target.getY();
				if (x > GamePanel.this.getWidth()) {
					target.setLocation(0, 0);
				} else {
					target.setLocation(x, y);
				}
				try {
					sleep(20);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	class BulletThread extends Thread {
		JComponent bullet, target;
		Thread targetThread;

		public BulletThread(JComponent bullet, JComponent target, Thread targetThread) {
			this.bullet = bullet;
			this.target = target;
			this.targetThread = targetThread;
		}

		public void run() {
			while (true) {
				if (hit()) {
					targetThread.interrupt(); // hit()메서드가 true면 타겟스레드 예외 발생
					target.setLocation(0, 0);
					bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 50);
					return;
				} else {
					int x = bullet.getX();
					int y = bullet.getY() - 5;
					if (y < 0) {
						bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 50);
						return;
					}
					bullet.setLocation(x, y);
				}
				try {
					sleep(20);
				} catch (InterruptedException e) {
				}
			}
		}

		public boolean hit() { // targetContains 메서드를 통한 hit(피격)판정 메서드
			if (targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY())
					|| targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY() + bullet.getHeight() - 1)
					|| targetContains(bullet.getX(), bullet.getY() + bullet.getHeight() - 1))
				return true;
			else
				return false;
		}

		private boolean targetContains(int x, int y) {
			if (((target.getX() <= x) && (target.getX() + target.getWidth() - 1 >= x)) 
					// target.x의 크기가 인자로 받은x의 크기보다 작거나 같고,
					&& ((target.getY() <= y) && (target.getY() + target.getHeight() - 1 >= y)))
				// 타겟x+타겟의width(사진의 x값)의 값이 x보다 작거나  같으며
				return true; // y도 그와 똑같을 때 true
			else
				return false; // 아니면 false
		}
	}
}