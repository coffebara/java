package java0622B;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Sprite {
	protected int x;
	protected int y;
	protected int dx;
	protected int dy;
	protected Image image;
	
	public Sprite(Image image, int x, int y) {
		this.image = image;
		this.x = x;
		this.y = y;
	}
	public int getWidth() {
		return image.getWidth(null);
	}
	public int getHeight() {
		return image.getHeight(null);
	}
// 이미지 그리기
	public void draw(Graphics g) {
		g.drawImage(image, x, y, null);
	}
	
	public void move() {
		x += dx;
		y += dy;
	}
	public void setDx(int dx) {
		this.dx =dx;
	}
	public void setDy(int dy) {
		this.dy =dy;
	}
	public int getDx() {
		return dx;
	}
	public int getDy() {
		return dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
// 충돌 확인 
	public boolean checkCollision(Sprite other) {
		Rectangle myRect = new Rectangle();
		Rectangle otherRect = new Rectangle();
		myRect.setBounds(x,y,getWidth(), getHeight());
		otherRect.setBounds(other.x, other.y, other.getWidth(), other.getHeight());
		
		return myRect.intersects(otherRect);
	}
	public void handleCollision(Sprite other) {
	}
}
