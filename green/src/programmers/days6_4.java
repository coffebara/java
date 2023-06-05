package programmers;

public class days6_4 {
	public static int solution(int a, int b) {
        int answer = 0;
        String stringA = String.valueOf(a);
        int ab = Integer.valueOf(stringA+b);
        answer = ab >= 2*a*b ? ab : 2*a*b; 
        return answer;
    }
	public static void main(String[] args) {
		int b = 2;
		int a = 91;
		System.out.println(solution(a,b));
	}
}
