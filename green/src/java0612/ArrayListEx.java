package java0612;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList는 스레드 동기화를 지원하지 ㅇ낳고 조금씩 용량을 늘리는 특징이 있습니다.
//일반적으로는 ArrayList를 사용하는 것이 성능면에서 더 효율적입니다.
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
// 데이터 입력
		for(int i =0; i<4; i++) {
			System.out.println("이름을 입력하세요>>");
			String s =sc.next();
			a.add(s);
		}
// 입력 정보 출력
		for( int i =0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
// 가장 긴 문자를 찾아냄
		int longestIndex = 0;
		for(int i=0; i<a.size(); i++) {
// ArrayList의 0번째 부터 그 다음값과 순차적으로 비교하여 큰 값 저장
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n가장 긴 이름은 : "+a.get(longestIndex));
		sc.close();
	}
}
