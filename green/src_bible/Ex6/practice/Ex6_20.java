package Ex6.practice;

public class Ex6_20 {
	static int max(int[] arr) {
		int max = 0;
		if (arr == null || arr.length == 0) {
			return -9999999;
		} else {
			for (int i = 0; i < arr.length; i++) {
				max = max < arr[i] ? arr[i] : max;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}
}
