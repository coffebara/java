package java0615A;

class MyRunnable implements Runnable {
	public void run() {
		for(int i=10; i>=0; i--) {
			System.out.println(i + " ");
		}
	}
}
public class MyThreadTest2 {
	public static void main(String[] args) {
//		Runnable r = new MyRunnable();
//		Thread t = new Thread(r);
		Thread t = new Thread(new MyRunnable());
		t.start();
	}
}
