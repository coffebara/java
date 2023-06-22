package java0622B;

import java.awt.Image;

// 탄환 클래스
public class ShotSprite extends Sprite{
	private GalagaGame game;
	
	public ShotSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dy =-3;
	}
// 탄환 이미지 움직임 오버라이딩
	@Override
	public void move() {
		super.move();
		if(y<-100)
			game.removeSprite(this);
	}
// 적과 부딪힘 오버라이딩
	@Override
	public void handleCollision(Sprite other) {
// other 객체가(부딪힌 객체가) AlienSprite(적)이라면
		if(other instanceof AlienSprite) {
			game.removeSprite(this);
			game.removeSprite(other);
		}
	}
}
