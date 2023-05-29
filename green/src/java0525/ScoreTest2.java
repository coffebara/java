package java0525;

import java.util.Scanner;

public class ScoreTest2 {
	public static void main(String[] args) {
		int score;
		int category = 0;
		char credit = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		score = sc.nextInt();
		category = score / 10;
		if (0 <= score && score <= 100) {
			switch (category) {
			case 10:
				credit = 'A';
				break;
			case 9:
				credit = 'B';
				break;
			case 8:
				credit = 'C';
				break;
			case 7:
				credit = 'D';
				break;
			default:
				credit = 'F';
			}
			System.out.println("시험점수 = " + score + "점, 학점 = " + credit);
		} else {
			System.out.println("잘못된 점수입니다.");
		}

	}
}
