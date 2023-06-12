package Ex7_practice;

class MyTv {
	private boolean isPoweOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int c) {
		this.channel= c;
	}
	public int getChannel() {
		return channel;
	}
	public void setVolume(int v) {
		this.volume = v;
	}
	public int getVolume() {
		return volume;
	}
}
public class Ex7_4 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("Ch:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}
