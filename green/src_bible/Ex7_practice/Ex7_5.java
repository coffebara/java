package Ex7_practice;

class MyTv2 {
	private boolean isPoweOn;
	private int channel;
	private int volume;
	private int prevCh;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int c) {
		if(this.channel!=0) {
			prevCh = channel;
		}
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
	public void gotoPrevChannel() {
		setChannel(prevCh);
	}
}

public class Ex7_5 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
