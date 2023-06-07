package java0607;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener { // ActionListener 인터페이스와 JPanel 을 상속받는 MyPanel 클래ㅐ스
	JButton[][] buttons = new JButton[3][3]; // JButton 클래스를 2차배열로 초기화
	private char turn = 'X'; // 사용자의 턴
	private boolean isGameOver = false;

	public MyPanel() { // 생성자 메서드
		setLayout(new GridLayout(3, 3, 5, 5)); // awt의 메서드를 가져다써서 컨테이너의 레이아웃을 짬
		Font f = new Font("dialog", Font.ITALIC, 50); // awt 가져온 Font를 초기화

		for (int i = 0; i < 3; i++) { // 2차 배열
			for (int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton(" "); // 인자를 String으로 갖는 JButton 대입
				buttons[i][j].setFont(f); // 해당 배열에 폰트 지정
				buttons[i][j].addActionListener(this); // 버튼을 눌렀을 때 반응하는 메서드
				add(buttons[i][j]); // 생성한 버튼을 컨테이너에 추가함
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {	//ActionEvent 클래스 객체를 매개변수로 받는 actionPerformed 메서드를 재정의
		for (int i = 0; i < 3; i++) {	//2차배열 생성
			for (int j = 0; j < 3; j++) {
				if (e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true  && !isGameOver) {
					//이벤트가 발생한 객체와 버튼의 일치여부 + 비어있는 지 + 게임이 끝났는지 확인
					buttons[i][j].setText(String.valueOf(turn)); // 해당 좌표에 turn 마크 입력
					if (checkWin("X", i, j)) {	// x가 승리했다면
						System.out.println("X가 이겼음!"); // 승리 코멘트 출력
						this.isGameOver = true; // 게임오버 true
						return;	// 메서드 종료
					} else if (checkWin("0", i, j)) {// 0가 승리했다면
						System.out.println("0가 이겼음!"); // 승리 코멘트 출력
						this.isGameOver = true;// 0가 승리했다면
						return; // 메서드 종료
					} else if (isDraw()) {//비겼다면
						System.out.println("비겼습니다.");//비김 코멘드 출력
						this.isGameOver = true;// 게임오버 true
						return; // 메서드 종료
					}
					turn = (turn =='X')? '0' : 'X'; // turn 교체
				}
			}
		}
	}
//	public void actionPerformed(ActionEvent e) { 
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				if (e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
//					if (turn == 'X') {	//x 턴일 때
//						buttons[i][j].setText("X");
//						if (checkWin("X", i, j)) {
//							System.out.println("X가 이겼음!");
//							break;
//						} else if (isDraw()) {
//							System.out.println("비겼습니다.");
//						}
//						turn = '0';
//					} else {
//						buttons[i][j].setText("0");
//						if (checkWin("0", i, j)) {
//							System.out.println("0가 이겼음!");
//							break;
//						} else if (isDraw()) {
//							System.out.println("비겼습니다.");
//						}
//						turn = 'X';
//					}
//				}
//			}
//		}
//	}

	public boolean isDraw() {	// 무승부 확인 메서드 
		for (int row = 0; row < 3; row++) { // 2차 배열 생성
			for (int col = 0; col < 3; col++) {
				if (buttons[row][col].getText().equals(" ")) { // 버튼이 비어있다면
					return false; 
				}
			}
		}
		return true;
	}

	public boolean checkWin(String mark, int r, int c) { // 승리 확인 메서드
		return (buttons[r][0].getText().equals(mark) && buttons[r][1].getText().equals(mark)
				&& buttons[r][2].getText().equals(mark) // 가로 한줄
				|| buttons[0][c].getText().equals(mark) && buttons[1][c].getText().equals(mark) 
						&& buttons[2][c].getText().equals(mark) // 세로 한줄
				|| buttons[0][0].getText().equals(mark) && buttons[1][1].getText().equals(mark)
						&& buttons[2][2].getText().equals(mark) // 왼쪽 대각선
				|| buttons[0][2].getText().equals(mark) && buttons[1][1].getText().equals(mark)
						&& buttons[2][0].getText().equals(mark)); // 오른쪽 대각선
	}

	public static void main(String[] args) {//main 메서드
		JFrame f = new JFrame();	// JFrame 인스턴스 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료설정
		f.add(new MyPanel()); // 컨테이너에 Mypanel 추가
		f.setSize(300, 300);		// 사이즈 설정
		f.setVisible(true);	// 보이게 설정 
		
	}
}
//1. 비긴 상태 확인 로직 변경: 각 턴에서 '승리' 조건을 먼저 확인하고, 승리하지 않은 경우에만
//isDarw()를 호출합니다.
//2. 게임 종료 처리: 승리나 무승무 상황이 확인되면 모든 버튼을 비활성화
//3.턴 교체 로직변경: 기존 코드에서는 버튼을 클릭할 때마다 턴이 바뀌었습니다
//4. 승리 조건 체크 로직 개선: 기존 코드에서는  대각선의 승리  조건이 모든 대각선에 대해
//   동일하게 대각선의 승리 조건을 보드의 위치에 따라 동적으로 확인
