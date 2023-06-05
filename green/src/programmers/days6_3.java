package programmers;

public class days6_3 {
	public int solution(int a, int b) {
		int answer = 0;
		String sa = Integer.toString(a);
		answer = Integer.valueOf(sa+b) >=Integer.valueOf(b+sa) ? Integer.valueOf(sa+b) : Integer.valueOf(b+sa); 
		
		
		return answer;
	}

	public static void main(String[] args) {
		int a=8;
		int b=89;
		days6_3 d = new days6_3();
		System.out.println(d.solution(a,b));
		
	}
}
