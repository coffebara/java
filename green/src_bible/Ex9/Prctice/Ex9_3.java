package Ex9.Prctice;

public class Ex9_3 {
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치

		System.out.println("src의 길이: " + src.length());
//		for(int i=0; i<src.length(); i++){
//		while(pos != -1) {
//			pos = pos < src.indexOf(target, pos)? src.indexOf(target, pos)+2 : pos;
//			System.out.println("pos: " + (pos));
//			if(pos == -1) {
//				return count;				
//			}
//			else
//				++count;
//		}
//	
		while (true) {
			if (src.indexOf(target, pos) != -1) {
				pos = src.indexOf(target, pos) + 2;
				++count;
			} else {
				break;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println("--------------------------------");
		System.out.println(count("12345", "AB"));
	}
}
