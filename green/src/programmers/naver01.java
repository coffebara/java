package programmers;

import java.util.Arrays;

public class naver01 {
	public static int[] solution(int[] arr) {
		int count = 0;
		int dup = 0;
		int tmp = 0;

		int tmpLen = 0;

		Arrays.sort(arr);
		System.out.println("arr :" + Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				++dup;
			}
		}
		if (dup == 0) {
			int[] noAnswer = { -1 };
			return noAnswer;
		}
		int[] tmpArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			tmp = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (i > 0 && arr[i - 1] == arr[j]) {
					continue;
				}
				if (tmp == arr[j]) {
					++count;
				}
			}
			if (count > 1) {
				tmpArr[i] = count;
				count = 0;
			} else {
				count =0;
			}
		}
		System.out.println("tmpArr: "+Arrays.toString(tmpArr));

		for (int i = 0; i < tmpArr.length; i++) {
			if (tmpArr[i] > 1) {
				++count;
			}
		}
		int[] answer = new int[count];
		System.out.println("answer: "+Arrays.toString(answer));
		int ttmp =0;
		for (int i = 0; i < answer.length; i++) {
			for (int j = ttmp; j < tmpArr.length; j++) {
				if (tmpArr[j] > 1) {
					answer[i]=tmpArr[j];
					ttmp=j+1;
					break;
				}
			}
		}
		System.out.println("answer: "+Arrays.toString(answer));

		return answer;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 3, 3, 3, 4, 4 };
		int[] arr2 = { 3, 2, 4, 4, 2, 5, 2, 5, 5 };
		int[] arr3 = { 3, 5, 7, 9, 1 };
		int[] arr4 = { 4, 4, 1, 2, 3 };

		System.out.println("답은 : " + Arrays.toString(solution(arr4)));

	}
}
