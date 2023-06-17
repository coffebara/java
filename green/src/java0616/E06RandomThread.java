package java0616;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;

public class E06RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false;

	public E06RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}

	void finish() {
		flag = true;
	}

	@Override
	public void run() {
		while (true) {
			int x = (int) (Math.random() * contentPane.getWidth());
			int y = (int) (Math.random() * contentPane.getHeight());
			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			// 받아온 컨텐트팬에 넣고 컨텐트팬 다시 그리기
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if (flag == true)
					contentPane.removeAll();
				// 라벨 생성하여 finish 빨간 글자로
				// 크기와 마지막으로 생성한 랜덤 x, y 좌표로 지정
				label = new JLabel("finish");
				label.setSize(80, 30);
				label.setLocation(x, y);
				label.setForeground(Color.RED);
				// 컨텐트팬에 넣고 다시 그리고
				contentPane.add(label);
				contentPane.repaint();
//				return;

			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
//class E06RandomThread extends Thread{
//	private boolean isStop= false;
//	private Container c;
//	
//	public E06RandomThread(Container c) {
//		this.c = c;
//	}
//	public void finish() {
//		isStop = true;
//	}
//}