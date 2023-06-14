package java0614;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
//JFrame 타이틀, 닫기 설정
		setTitle("GrideLayout 테스트 입니다.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 4행 2열의 그리드 레이아웃 객체 생성
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5); //각 행 사이의 간격을 5픽셀로 설정
//JFrame에 컴포넌트 넣을 ContentPane 가져오기
		Container c=getContentPane();
//레이아웃 적용
		c.setLayout(grid);
//JFrame에 각 컴포넌트 삽입
		c.add(new JLabel(" 이름"));//컨텐트 팬에 JLabel 컴포넌트를  추가합니다.
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
//JFrame 사이즈, 가시성 설정
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
