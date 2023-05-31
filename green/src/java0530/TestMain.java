package java0530;

public class TestMain {
public static void main(String[] args) {
//	배열 생성 및 사용방법 [1]
	String[] array1 = new String[] {"자로1", "자료2", "자료3", "자료4", "자료5"};
	String data11 = array1[0];
	String data12 = array1[1];
	String data13 = array1[2];
	String data14 = array1[3];
	String data15 = array1[4];
	int length1 = array1.length; // 배열의 길이
	
//	배열 생성 및 사용방법[2]
	String[] array2 = new String[] {"자로1,", "자료2", "자료3", "자료4", "자료5"};
	String data21 = array2[0];
	String data22 = array2[1];
	String data23 = array2[2];
	String data24 = array2[3];
	String data25 = array2[4];
	int length2 = array2.length; // 배열의 길이
	
//	배열 생성 및 사용방법[3]
	String[] array3 = new String[] {"자로1,", "자료2", "자료3", "자료4", "자료5"};
	String data31 = array3[0];
	String data32 = array3[1];
	String data33 = array3[2];
	String data34 = array3[3];
	String data35 = array3[4];
	int length3 = array3.length; // 배열의 길이
	
	if(array1 != null) {
		for(int i = 0; i< array1.length; i++) {
			System.out.println((i + 1)+ "번째 배열 값 = " + array1[i]);
		}
	}
}
}
