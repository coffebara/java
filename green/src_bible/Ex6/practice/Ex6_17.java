package Ex6.practice;

public class Ex6_17 {
	static int[] shuffle(int[] arr) {
		int tmp;
		int rnd;
		int[] newArr = {1};
		for(int i=0; i<arr.length; i++) {
			rnd = (int)(Math.random()*arr.length);
			tmp = arr[rnd];
			arr[rnd]= arr[i];
			arr[i]=tmp;
		}
		
		return  arr;
	}

	public static void main(String[] args) {
		int[] original= {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
