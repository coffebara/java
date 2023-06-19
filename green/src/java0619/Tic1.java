package java0619;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Tic1 extends JFrame { 
	private static final long serialVersionUID = 1L; // 객체 직렬화
	JLabel title = new JLabel("Tic1 | "); // 라벨 인스턴스 생성
	JLabel dispCurrentPlayer = new JLabel("Player 0");
	private int score1 = 0;
	private int score2 = 0;
	JLabel scoreLabel = new JLabel(" | " + score1 + " : " + score2);
	// 스코어 라벨 인스턴스 생성, score변수 text로
	JButton startNewGame = new JButton("새 게임 시작");
	// 게임 다시 시작하게 해줄버튼 인스턴스 생성
	JPanel titleBar = new JPanel(); // 각족 JLable이 들어갈 JPanel 인스턴스 생성
	JPanel nineRoom = new JPanel(); // 버튼이 들어갈 패널 인스턴스 생성
	private final int START_PLAYER = 1; // 스타트 플레이어를 int형 상수 1로 선언
	TicTacToeCore ttt = new TicTacToeCore(START_PLAYER);
	boolean isGameEnd = false;

	public Tic1() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null); // JFrame의 크기와 위치설정 : 중앙
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.drawWindow();
		this.setVisible(true);
	}

	public void drawWindow() {
		titleBar.add(title);
		titleBar.add(dispCurrentPlayer);
		titleBar.add(scoreLabel);
		titleBar.add(startNewGame); // JPanel의인스턴스 titleBar에 각종 JLable 인스턴스 추가
		dispCurrentPlayer.setText("Plyear " + START_PLAYER); // 해당 인스턴스에 text 세팅
		add(titleBar, BorderLayout.NORTH); // JFrame에 titleBar 인스턴스 추가하고 상단에 배치
		nineRoom.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++) {
			JButton tempButton = new JButton("");
			tempButton.setFont(new Font("Impact", Font.PLAIN, 22));
			nineRoom.add(tempButton);
		}

		add(nineRoom, BorderLayout.CENTER);
		MouseListener ml = new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JButton tempButton = (JButton) e.getComponent(); // 이벤트의 컴포넌트 tempButton으로 다운캐스팅
				if (isGameEnd) {
					return;
				}
				if (tempButton.getText().equals("O") || tempButton.getText().equals("X")) {
					JOptionPane.showMessageDialog(nineRoom, "이미 둔 곳입니다.");
					return;
				} else if (ttt.getCurrentPlayerNum() == 1) { // "O"나 "X"가 아니고 해당 메서드의 리턴값이 1이라면
					tempButton.setText("O");
					dispCurrentPlayer.setText("Player " + 2);
					// 해당 패널에 Player 1문자열 텍스트 세
				} else {
					tempButton.setText("X");
					dispCurrentPlayer.setText("Player " + 1);
				}
				ttt.changeTurn();
				System.out.println("(" + e.getX() + ", " + e.getY() + ") "); // 해당 이벤트가 발생한 x,y 좌표
				int[][] ticArr = new int[3][3];
				for (int i = 0; i < ticArr.length; i++) {
					for (int j = 0; j < ticArr[0].length; j++) {
						String pl = ((JButton) nineRoom.getComponent(j + i* 3)).getText();
						// nineRoom에 j+(i * 3) 번째로들어간 컴포넌트 문자열 값을 pl에 대입 0~8
						if (pl.equals("O"))
							ticArr[i][j] = 1;
						else if (pl.equals("X"))
							ticArr[i][j] = 2;
						else
							ticArr[i][j] = 0;
					}
				}
				int result = ttt.inputCurrentStage(ticArr);
				System.out.println("result: " + result); // 해당 메서드의 인자로 ticArr배열 사용하여 result로 값 반환받고 출력함
				if (result == 1 || result == 2) {
					JOptionPane.showMessageDialog(nineRoom, "플레이어 " + result + "의 승리입니다.");
					if (result == 1) {
						score1++;
					} else {
						score2++;
					}
					scoreLabel.setText(" | " + score1 + " : " + score2);
					isGameEnd = true;
				} else if (result == 99) {
					JOptionPane.showMessageDialog(nineRoom, "비겼습니다.");
					isGameEnd = true;
				}
			}
		};
		for (Component c : nineRoom.getComponents()) {
			c.addMouseListener(ml);
		}
		startNewGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ttt.resetGame(START_PLAYER);
				isGameEnd = false;
				for (int i = 0; i < nineRoom.getComponents().length; i++) {
					((JButton) nineRoom.getComponent(i)).setText("");
				}
			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			// 여러 이벤트가 동시에 충돌하는 것을 막기위한 invokeLater 메서드
			public void run() {
				new Tic1();
			}
		});
	}
}
