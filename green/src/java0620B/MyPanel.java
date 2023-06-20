package java0620B;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

class MyPanel extends JPanel implements KeyListener {
	Enemy enemy;
	SpaceShip spaceship;
	Fire fire;
	Missile missile;
	final int ENEMYS = 4;
	Vector<Enemy> enemyVector = new Vector<Enemy>();

	public MyPanel() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);

		for (int i = 0; i < ENEMYS; i++) {
			Enemy e = new Enemy("enemy.png", 60*(i), 60*(i));
			enemyVector.add(e);
		}
		spaceship = new SpaceShip("spaceship.png");
		fire = new Fire("missile.png");
		missile = new Missile("missile.png", 10, 20);

		class MyThread extends Thread {
			public void run() {
				while (true) {
					for (int i = 0; i < enemyVector.size(); i++) {
						enemyVector.get(i).update();
					}
					fire.update();
					missile.update();
					repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}

					for (int i = 0; i < enemyVector.size(); i++) {
						if (Math.sqrt((double) (missile.x - enemyVector.get(i).x)) < 10
								&& (Math.sqrt((double) (missile.y - enemyVector.get(i).y)) < 10)) {
							// 충돌 처리
							System.out.println("<<< 격추 !!! >>>");
							enemyVector.remove(i);
							missile.remove();
						}
					}
				}
			}
		}


		Thread t = new MyThread();
		t.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < enemyVector.size(); i++) {
			enemyVector.get(i).draw(g);
		}
		spaceship.draw(g);
		fire.draw(g);
		missile.draw(g);
	}

	public void keyPressed(KeyEvent event) {
		spaceship.keyPressed(event);
		missile.keyPressed(event, spaceship.x, spaceship.y);
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}
}
