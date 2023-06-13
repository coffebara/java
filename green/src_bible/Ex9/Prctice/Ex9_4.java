package Ex9.Prctice;

public class Ex9_4 {
	static boolean contains(String src, String targer) {
		return src.contains(targer);
	}

	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}
