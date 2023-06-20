package java0620;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnowFrame extends JFrame {
	public SnowFrame() {
		super("눈 내리는 샤갈의 마을");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new SnowPanel());
		setSize(300, 300);
		setResizable(false);
		setVisible(true);
	}

	class SnowPanel extends JPanel {
		ImageIcon icon = new ImageIcon("background.jpg");
		Image img = icon.getImage();
		final int SNOWS = 50;
		final int SNOW_SIZE = 10;
		Vector<Point> snowVector = new Vector<Point>();

		// 눈 송이의 왼쪽 좌표 Point
		public SnowPanel() {
			this.addComponentListener(new ComponentAdapter() {
				@Override
				public void componentResized(ComponentEvent e) {
					// 패널의 위치와 크기가 설정되면 그 때 비로소 눈을 만든다.
					addSnow();
					new SnowThread().start();
					SnowPanel.this.removeComponentListener(this); // SnowPanel클래스 참조하는 객체
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); // 배경 이미지를 그린다.
			drawSnow(g); // 눈을 그린다
		}

		void addSnow() {
			for (int i = 0; i < SNOWS; i++) {
				Point p = new Point((int) (Math.random() * getWidth()), (int) (Math.random() * getHeight()));
				snowVector.add(p);
			}
		}

		void drawSnow(Graphics g) {
			g.setColor(Color.WHITE);
			for (int i = 0; i < snowVector.size(); i++) {
				Point p = snowVector.get(i);
				g.fillOval(p.x, p.y, SNOW_SIZE, SNOW_SIZE);
			}
		}

		void changeSnowPosition() {
			for (int i = 0; i < SNOWS; i++) {
				Point p = snowVector.get(i);
				int xDir = Math.random() > 0.5 ? 1 : -1;
				// xDir이 1이면 오른쪽으로, 아니면 왼쪽으로 눈을 이동시킨다.
				int offsetX = (int) (Math.random() * 3) * xDir; // x축 최대 이동거리 3필셀
				int offsetY = (int) (Math.random() * 7) ; // y축 최대 이동거리 7픽셀
				p.x += offsetX;
				if (p.x < 0)
					p.x = 0;
				p.y += offsetY;
				if (p.y > getHeight()) {
					p.x = (int) (Math.random() * getWidth());
					p.y = 5;
				}
			}
		}

		class SnowThread extends Thread {
			@Override
			public void run() {
				while (true) {
					try {
						sleep(300);
					} catch (InterruptedException e) {
						return;
					}
					changeSnowPosition();
					repaint();
				}
			}
		}
	}

	public static void main(String[] args) {
		new SnowFrame();
	}
}
