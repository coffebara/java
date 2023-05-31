package programmers;
//Q. 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
//정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 
//solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

public class days3_4 {
	public static int solution(int[] array) {
		int answer = 0;
		int[] countArr = new int[100];
		int count=0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=i; j<array.length; j++) {
				if(array[i] == array[j]) {
					++count;
				}
			}
			countArr[i]= count;
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,3,3,4};
		int[] arr2 = {1,1,2,2};
		int[] arr3 = {1};
		
		System.out.println(solution(arr1));
	}
}
