// Q. 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
//두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 
//분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
package programmers;

import java.util.Arrays;

public class days2_3 {
	public static int getGcd(int numer3, int denom3) {
	    int l = 0;
	    int s = 0;
	    int tmp = 0;
	    int gcd = 0;
	    
	    if(numer3 > denom3){
	        l = numer3;
	        s = denom3;
	    } else if( denom3 > numer3){
	        l = denom3;
	        s = numer3;
	    } else {
	        return gcd = denom3;
	    }
	    
	    while(true) {
						if(l%s != 0) {
							gcd = l%s;
							l = s;
							s = gcd;
							++tmp;
						} else {
							if(tmp==0) {
								gcd = l;
							}
							break;
						}
					}
	    return gcd;
	}
	
	public static void main(String[] args) {
		solution(11, 11, 2, 11);
//		solution(20, 11, 2, 11);
//		solution(4, 2, 3, 1);
//		solution(2, 5, 2, 5);
//		solution(5, 3, 5, 10);
//		solution(10, 2, 3, 5);
//		solution(4, 5, 1, 5);

	}

	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer3 = 0; 
		int denom3 = 0;
		int gcd = 1;
		
//	         분모가 이미 같을 때
		if(denom1 == denom2) {
			numer3 = numer1 + numer2;
			denom3 = denom1;
			
			gcd = getGcd(numer3, denom3);
		
			numer3 = numer3/gcd;
			denom3 = denom3/gcd;
		} else { // 분모가 다를 때,
			numer3 = (numer1 * denom2) + (numer2 * denom1);
			denom3 = denom1 * denom2;
			
			gcd = getGcd(numer3, denom3);
			
			numer3 = numer3/gcd;
			denom3 = denom3/gcd;
		}	
		int[] answer = { numer3, denom3 };
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
