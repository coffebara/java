package Ex6.practice;

public class Ex6_4 {
	static double getDistance(int x, int y, int x1, int y1) {
		int bx, sx, by, sy;
		if(x>=x1) {
			bx= x;
			sx = x1;
		} else {
			bx = x1;
			sx = x;
		}
		if(y> y1) {
			by =y;
			sy=y1;
		} else {
			by = y1;
			sy = y;
		}
		
		double distance = Math.sqrt(Math.sqrt(Double.valueOf(bx - sx)) + Math.sqrt(Double.valueOf(by - sy)));

		return distance;
	}

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
