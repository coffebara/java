package programmers;
// Q.길이가 같은 두 문자열 str1과 str2가 주어집니다.
//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어
//return 하는 solution 함수를 완성해 주세요.
public class days6_1 {
	public static String Solution(String str1, String str2) {
		String answer ="";
		int len1 = str1.length();
		for(int i=0; i<len1; i++) {
			answer += str1.substring(i,i+1)+str2.substring(i,i+1);
		}
		return answer;
	}
	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		System.out.println(Solution(str1, str2));
	}
}
