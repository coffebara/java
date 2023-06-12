package programmers;

public class days10_1 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,4,3};
		int[][] queries= {
				{0,4,1},
				{0,3,2},
				{0,3,3}
		};
		solution(arr,queries);
	}

	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = {};
		
		for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if (j%queries[i][2]==0) {
					arr[j] += 1;
				}
			}
			for(int v:arr) {
				System.out.print(v +", ");
			}
			System.out.println();
		}
		answer = arr.clone();
		return answer;
	}
}
