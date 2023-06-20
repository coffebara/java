package java0620B;

class Enemy extends GraphicObject {
	int dx = -10;
	int dy = -10;
	boolean siva = true;

	public Enemy(String name) {
		super(name);
		x = 0;
		y = 0;
	}

	public Enemy(String name, int x, int y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	public void update() {
		if (siva) {
			x += dx;
			y += dy;
			if (x < 0)
				dx = 10;
			if (x > 450)
				dx = -10;
			if (y < 0)
				dy = 10;
			if (y > 80)
				dy = -10;
		}
	}
}
