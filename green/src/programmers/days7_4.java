package programmers;

public class days7_4 {
	public static void main(String[] args) {
		solution("<","=",20,50);
		solution(">","!",41,78);
	}
	public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch(ineq){
        case ">" :
        	if(eq.equals("=")) {
        	answer = (n>=m)? 1:0;
        	break;
        	} else {
        		answer = (n>m)? 1:0;
        		break;
        	}
        case "<" : 
        	if(eq.equals("=")) {
            	answer = (n<=m)? 1:0;
            	break;
            	} else {
            		answer = (n<m)? 1:0;
            		break;
            	}
        }
        System.out.println(answer);
        return answer;
    }
}
