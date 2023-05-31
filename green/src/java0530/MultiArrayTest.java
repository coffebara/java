package java0530;

public class MultiArrayTest {
	public static void main(String[] args) {
		int arr[][];
		arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 3 * i + j;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}
	}
}
