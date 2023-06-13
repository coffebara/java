package java0613;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
// HashMap 객체를 활용해 키-값을 저장하고
		Map<String, String> st = new HashMap<String, String>();
		
		st.put("map","지도");
		st.put("java","자바");
		st.put("scholl", "학교");
		
// Scanner 객체와 do-while 문으로 키를 검색하는 예제
		Scanner sc = new Scanner(System.in);
		do {
// 입력받은 값을 ket 변수에 저장
			System.out.print("영어 단어를 입력하세요 : ");
			String key = sc.next();
// 입력받은 값이 quit 이면 반복문 탈출
			if(key.equals("quit"))
				break;
// 입력받은 키에 해당하는 값을 출력
			System.out.println("단어의 의미는 " +  st.get(key));
		} while(true);
		sc.close();
	}
}
