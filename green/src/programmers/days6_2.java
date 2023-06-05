package programmers;
// Q. 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
public class days6_2 {
	public static String Solution(String str, int k) {
		String answer = "";
		for(int i =0; i<k; i++) {
			answer += str;
		}
		return answer;
	}
	public static void main(String[] args) {
		String s = "abc";
		
		
		System.out.println(Solution(s,3));
	}
}
;