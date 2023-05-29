package java0525;

import java.util.Scanner;

public class ScoreTest3 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		int category;
		int score;
		int avg;
		char credit;
		

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(i+1 + "번째 점수를 입력하시오.");
			score = sc.nextInt();
			if (0 <= score && score <= 100) {
				sum = sum + score;
				i++;
			} else {
				System.out.println("0~100 안의 점수를 다시 입력하세요.");
				System.out.println("-----------------------------------");
			}
			if (i == 5) {
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
			}
		} while (i < 5);

	}
}