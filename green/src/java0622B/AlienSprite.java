package java0622B;

import java.awt.Image;

public class AlienSprite extends Sprite {
	private GalagaGame game;
	
	public AlienSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game =game;
		dx =-3;
	}
	// 적 움직임 오버라이딩
	@Override
	public void move() {
// x축 이동량이 0보다 작고 x축 위치가10보다 작거나
// x축 이동량이 0보다 크고 x축 위치가 800보다 크면
		if(((dx <0) && (x <10)) || ((dx >0) && (x > 800))) {
			dx = -dx;
			y += 10;
			if( y> 600)
				game.endGame();
		}
		super.move();
	}
}
