package programmers;

public class days5_3 {
	static public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		String tmp = my_string.substring(0,s);
		String tmp2 = my_string.substring(s+overwrite_string.length(),my_string.length());
		System.out.println(tmp2);
		System.out.println(tmp);
		answer = tmp.concat(overwrite_string).concat(tmp2);
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d","lloWorl",2));
	}
}
