package programmers;
//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//
//각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
//단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
public class days9_5 {
	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		int result = 1000001;
		int index =0;
		for (int[] query : queries) {
			for (int i = query[0]; i <= query[1]; i++) {
				if (arr[i] > query[2]) {
					result = arr[i] <result ? arr[i] : result;
				}
			}
			answer[index++] = (result == 1000001) ? -1: result;
			
			System.out.println(result);
			result = 1000001;
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {0,1,2,4,3};
		int[][] queries = {
				{0,4,2},
				{0,3,2},
				{0,2,2}
		};
		solution(arr, queries);
	}
}
