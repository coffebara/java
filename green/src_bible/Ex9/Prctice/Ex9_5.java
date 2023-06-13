package Ex9.Prctice;

public class Ex9_5 {
	static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src);

		for (int i = 0; i < delCh.length(); i++) {
			while (sb.toString().indexOf(delCh.charAt(i)) != -1) {
					sb.deleteCharAt(sb.toString().indexOf(delCh.charAt(i)));
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}
