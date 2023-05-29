package java0525;

import java.util.Scanner;
// 점수 먼저 다 입력하고
// 과락일 시 커멘드 입력 y/n
// continue 사용
// equalsIgnoreCase() 메서드

public class ScoreTest5 {
	public static void main(String[] args) {
		int sum = 0;
		int category;
		int score;
		int avg;
		char credit;
		boolean fail = false;
		boolean reWrite = false;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 점수를 입력하시오.");
			score = sc.nextInt();
			if (0 <= score && score <= 100) {
				sum = sum + score;
				if (score <= 40) {
					fail = true;
				}
			} else {
				System.out.println("0~100 안의 점수를 다시 입력하세요.");
				System.out.println("-----------------------------------");
				--i;
				continue;
			}
			if (i == 4) {
				avg = sum / 5;
				category = avg / 10;
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
				System.out.println("평균점수 = " + avg + "점, 학점 = " + credit);
				if (fail) {
					System.out.println("한 과목 이상에서 40점 이하를 받았습니다. 과락입니다.");
					System.out.println("계속 입력하시겠습니까? (Y/N)");
					if (sc.next().equalsIgnoreCase("y")) {
						i = -1;
						sum = 0;
						score = 0;
					}
				}
			}

		}
	}
}