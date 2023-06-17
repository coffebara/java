package java0616;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class E07CarGameThread extends JFrame{
	class MyThread extends Thread {
		private JLabel label;
		private int x, y =0;
		
		public MyThread(String fname, int x, int y) {
			this.x = x;
			this.y = y;
			label= new JLabel();
			label.setIcon(new ImageIcon(fname));
//해당 문자열 이름을 가진 파일을 상대경로로 이미지 아이콘으로 생성, 라벨에 아이콘으로 세팅
			label.setBounds(x,y,100,100);
			add(label); // 프레임에 라벨 추가
		}
		public void run() {
			for(int i=0; i<200; i++) {
				x += 10* Math.random();
				label.setBounds(x,y,100,100); // 라벨 재배치
				repaint(); //update+paint
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public E07CarGameThread() {
		setTitle("carRace");
		setSize(1150, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		(new MyThread("car1.gif", 100, 0)).start();
		(new MyThread("car2.gif", 100, 50)).start();
		(new MyThread("car3.gif", 100, 100)).start();
		setVisible(true);
	}
	public static void main(String[] args) {
		new E07CarGameThread();
	}
}
