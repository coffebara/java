package java0613;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//열명의 시험 점수를 입력 받아서 파일에 저장하는 예제
public class ScoreWrite {
	public static void main(String[] args) {
		int count =1; // 몇번 입력했는지를 카운트하는 변수
		String scoreData = "";
		String s =null;
		String path = "C:\\\\java\\\\green\\\\src\\\\java0613";
		File file = new File(path,"scoreData.txt");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file, false));
//false를 인수로 주면, 파일을 덮어쓰는 모드로 열게 됩니다.
			do {
				System.out.println(count + " 번째 점수를 입력하세요");
				s = in.readLine();
				if(isRealNumber(s)) { // 입력한 데이터가 숫자인지를 체크한다.
					if(count != 10) {
						scoreData += s + ",";
					} else {
						scoreData += s;
					}
					count++;
				} else {
					System.out.println("숫자만 입력 가능합니다.");
				}
			} while(count <=10);
			
			out.println(scoreData);
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
		System.out.println("시험점수를 파일로 출력합니다.");
	}
	
	//입력 받은 데이터가 숫자인지를 체크하는 메서드
	static boolean isRealNumber(String s) {
		try {
			Integer.valueOf(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
