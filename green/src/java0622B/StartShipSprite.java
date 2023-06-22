package java0622B;

import java.awt.Image;

// 내 유닛 클래스
public class StartShipSprite extends Sprite {
	private GalagaGame game;
	private int life = 311; // 라이프 추가

	public StartShipSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dx = 0;
		dy = 0;
	}

// 내 유닛 움직임 오버라이딩
	@Override
	public void move() {
// x축 이동량이 0보다 작고 좌표가 10보다 작으면 움직임 종료
		if ((dx < 0) && (x < 10))
			return;
		super.move();

	}

// 적과 부딪힘 오버라이딩
// 라이프 추가
	@Override
	public void handleCollision(Sprite other) {
		if (other instanceof AlienSprite)
			if(life > 0) {
				--life;
			} else {
				game.endGame();
			}
	}

// 우주선의 x축이 맵 안에서만 움직이도록 
	@Override
	public void setDx(int dx) {
		if ((x > 620) && (dx > 0))
			super.dx = 0;
		else
			super.dx = dx;
		
	}
// 우주선의 y축이 맵 안에서만 움직이도록 
	@Override
	public void setDy(int dy) {
		if (((y > 450) && (dy > 0)) || (y <0 ) && (dy <0))
			super.dy = 0;
		else
			super.dy = dy;
	}
	
// 라이프 getter & setter
	public int getLife() {
		return life;
	}
	
}
