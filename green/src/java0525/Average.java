package java0525;

public class Average {
	public static void main(String[] args) {
		int compgrade, proggrade, mathgrade, archgrade;
		double avg;
		compgrade = 88;
		proggrade = 92;
		mathgrade = 79;
		archgrade = 80;
		avg = (compgrade + proggrade + mathgrade + archgrade) / 4.0;
		System.out.println(avg);
	}
}
