package programmers;

//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
//각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
//위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
public class days9_4 {
	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = {};
		int tmp;
		int tmp2;
		int swi;
		for (int i = 0; i < queries.length; i++) {
			tmp = queries[i][0];
			tmp2 = queries[i][1];
			swi = arr[tmp];
			arr[tmp] = arr[tmp2];
			arr[tmp2] = swi;

			System.out.print("tmp: " + tmp);
			System.out.println(" tmp2: " + tmp2);			
		}
		for(int n :arr) {
			System.out.println(n);
		}
		answer = arr.clone();
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] queries = { { 0, 3 }, { 1, 2 }, { 1, 4 } };
		System.out.println(solution(arr, queries));
	}
}
