package java0530;

public class TodaysAssingment {
	public static int summarize(int n1, int n2) {
		int result = 0;
		for (int i = n1; i <= n2; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static int summarize(int n) {
		int result =0;
		for(int i=0; i<=n; i++) {
			result += i;
		}
		
		return result;
	}
	public static void main(String[] args) {
//		int result = summarize(1,10);
//		int result = summarize(1,20);
		TodaysAssingment m = new TodaysAssingment();
		
//		System.out.println("1에서 10까지의 합은 " + result);
//		System.out.println("1에서 20까지의 합은 " + result);
		System.out.println("1에서 100까지의 합은 " + m.summarize(100));
	}
}
