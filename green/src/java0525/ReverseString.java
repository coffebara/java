package java0525;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String str; // 입력받는 문자열
		int length; // 문자열의 길이
		int index; // 지수
		char ch; // 마지막 문자
		String rest; // 남은 문자열
		String outputStr = ""; // 출력 문자열

		Scanner scan = new Scanner(System.in);

		// 문자열을 입력받는다
		System.out.print("문자열을 입력하세요: ");
		str = scan.nextLine();
		length = str.length();
		index = length - 1;
		for (int i = index; i >= 0; i--) {
			ch = str.charAt(i);
			rest = str.substring(0,i);
			if(outputStr == "") {
				outputStr = Character.toString(ch);				
			} else {
				outputStr = outputStr.concat(Character.toString(ch));
			}
		}
		System.out.println(outputStr);

//		System.out.println(str);
//       		 // 입력 문자열을 출력한다			
//		length = str.length();
//		// 문자열의 길이를 구한다	
//		index = length-1;
//		// 마지막 문자를 끄집어 낸다			
//		ch = str.charAt(index);
//		// 마지막 문자를 제거한 후 남은 문자열을 rest가 가리키게 한다			
//		rest = str.substring(0,index);
//
//		// 끄집어 낸 문자를 출력 문자열의 끝에 추가한다			
//		outputStr = Character.toString(ch);
//		// 남은 문자열의 길이를 구한다
//		length = rest.length();
//		index = length-1;
//		// 남은 문자열의 마지막 문자를 끄집어 낸다			
//		ch = rest.charAt(index);
//		// 마지막 문자를 제거한 후 남은 문자열을 rest가 가리키게 한다			
//		outputStr = outputStr.concat(Character.toString(ch));
//		// 끄집어 낸 문자를 출력 문자열의 끝에 추가한다			
//		rest = str.substring(0,index);
//		outputStr = outputStr.concat(Character.toString(ch));
//		// 남은 문자열을 출력 문자열의 끝에 추가한다			
//		System.out.println(outputStr);
//        // 출력 문자열을 출력한다	

	}
}
