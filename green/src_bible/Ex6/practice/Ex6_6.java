package Ex6.practice;

class MyPoint {
	int x, y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x, int y) {
		int bx, sx, by, sy;

		if (this.x >= x) {
			bx = this.x;
			sx = x;
		} else {
			bx = x;
			sx = this.x;
		}
		if (this.y > y) {
			by = this.y;
			sy = y;
		} else {
			by = y;
			sy = this.y;
		}
		double distance = Math.sqrt(Math.sqrt(Double.valueOf(bx - sx)) + Math.sqrt(Double.valueOf(by - sy)));

		return distance;

	}

}

public class Ex6_6 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);

		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}
