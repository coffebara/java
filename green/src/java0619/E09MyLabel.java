package java0619;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class E09MyLabel extends JLabel{
	int barSize = 0;
	int maxBarSize;
	
	E09MyLabel(int maxBarSize){
		this.maxBarSize = maxBarSize;
	}
// 그리기 메서드로 컴포넌트 그림(repaint() 호출시 이거 호출)
	public void paintComponent(Graphics g) {
// 무보(라벨) 받아온 그래픽 변화 객체로 다시 그리기
		super.paintComponent(g);
// 그래픽 객체를 마젠다색 설정
		g.setColor(Color.MAGENTA);
// 현재 라벨의 가로크기/(받아온 maxBarSize * barSize) 의 값 구하기
		int width = (int)((double)(this.getWidth())/maxBarSize*barSize);
// 위 값이 0이면 그리기 메서드 탈출
		if(width == 0)
			return;
// 위 값 0이 아니면 속이 채워지고 가로 크기가 위의 값인 사각형(bar) 그리기
// 즉, 라벨 위에 width 크기 만큼 마젠다색 사각형(bar) 그림
		g.fillRect(0,0, width, this.getHeight());
	}
// 동기화 메서드로 한 번에 하나의 스레드만 접근 가능
	synchronized void fill() {
// bar의 최대 크기가 현재 bar 크기와 같으면
		if(barSize == maxBarSize) {
			try {
// fill() 메서드에 접근한 스레드 일시정지
				wait();
			} catch(InterruptedException e) {
				return;
			}
// bar 최대 크기 아니면 barSize 1 증가하고 다시 그리고
		}
		barSize++;
		repaint();
		notify();
//notify() : 일시정지 상태인 하나의 스레드를 실행 대기 상태로 변화시킴
	}
// 동기화 메서드로 한 번에 하나의 스레드만 접근 가능
	synchronized void consume() {
// fill 메서드와 비슷한 로직이지만, 얘는 barSize가 0이면 접근한 스레드 일시정지 시키고
		if(barSize ==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
// bsarSize를 1씩 감소시킴
		barSize--;
		repaint();
		notify();
	}
}
