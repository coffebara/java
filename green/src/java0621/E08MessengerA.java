package java0621;
//UDP 형식 채팅 프로그램 A
//UDP(User Datagram Protocol)은
//데이터를 몇 개의 고정 길이의 패킥(다이어그램이라고 불린다)으로 분할하여 전송
//GUI를 이용한 UDP 통신 채팅 - 통신자 ㅁ
//(1) 서버 - 클라이언트 방식이 아닌 단방향비동기 방식으로 
// 			사대방과의 통신연결 확인 없이 메세지 주고 받기
//(2) 상대가 잘 받았는지 확인 없이 그냥 보내기만 한다

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class E08MessengerA {
	protected JTextField textField;
	protected JTextArea textArea;
//DatagramSocket : 데이터그램 패킷을 보내고 받기 위한 소켓클래스
//데이터그램 소켓은 패킷 전달 서비스를 위한 송신 또는 수신 지점
//데이터그램 소켓에서 보내거나 받은 각 패킷은 개별적으로 주소가 지정되고 라우팅됩니다
//한 시스템에서 다른 시스템으로 전송된 여러 패킷은 다르게 라우팅될 수 있으며
//순서에 관계없이 도착할 수 있습니다.
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address =null;
	final int myPort = 5555;	// 수신용 포트
	final int otherPort = 2222;	// 송신용 포트
	public E08MessengerA() throws IOException {
		new MyFrame();
// localhost(도메인명)의 ip주소를 InetAddress로 반환
		address = InetAddress.getByName("localhost");
// 수신용 포트번호로 데이터그램 소켓 생성 및 연결		
		socket =  new DatagramSocket(myPort);
	}
// 받은 데이터 처리 프로세스	
	public void process() {
		while (true) {
			try {
// 데이터를 담을 바이트 배열 생성				
				byte[] buf = new byte[256];
// buf배열의 길이만큼 패킷을 받아 buf배열에 저장하는  데이터그램패킷 객체생성				
				packet = new DatagramPacket(buf, buf.length);
// 연결된 소켓으로 받아온 데이터를 패킷 객체에 받는다
				socket.receive(packet);
				
/*소켓.receive(데이터그램패킷) 이 소켓에서 데이터그램 패킷을받습니다.
이 메서드가 반환되면 DatagramPacket의 버퍼는수신된 데이터로 채워집니다
데이터그램 패킷에는 보낸 사람의 IP 주소와 보낸 사람 컴퓨터의 포트 번호도 포함됩니다
이 메서드는 데이터그램이 수신될 때 까지 차단됩니다 데이터그램 패킷 객체의  길이 필드는
수신된 메세지의 길이를 포함합니다 메세지가 패킷 길이보다 길면 메세지가 잘립니다
보안관리자가 있는 경우 보안 관리자 checkAccept 메서드가 허용하지 않으면
패킷을 수신할 수 없습니다*/
				
//textArea에 받아온 메세지를추가한다
				textArea.append("Recideved : " + new String(buf) + "\n" );
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
// 프레임 및 이벤트 내부 클래스
	class MyFrame extends JFrame implements ActionListener {
		public MyFrame() {
			super("MessengerA");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 열개수(문자개수) 30인 JTextField 생성 및 이벤트지정
			textField = new JTextField(30);
			textField.addActionListener(this);
// 행개수(줄수) 10, 열개수(문자개수) 30인 JTextArea 생성 및 입력 비활성화			
			textArea = new JTextArea(10, 30);
			textArea.setEditable(false);
// textField를 프레임 아래쪽에 추가
			add(textField, BorderLayout.PAGE_END );
// textArea를 프레임 중앙에 추가
			add(textArea, BorderLayout.CENTER);
//	내부 구성 요소 크기에 프레임 크기 맞춤
			pack();
			setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
// textField에 입력된 문자열을 가져온다			
			String s = textField.getText();
// 문자열의 바이트 데이터를 바이트배열 버퍼에 담는다
			byte[] buffer = s.getBytes();
			DatagramPacket packet;
// 데이터그램 패킷을 생성한다
// 데이터를 보내거나 받을  때 활용되며, 데이터를 묶는 클래스
// 데이터를 보낼 때는 아래와같이 객체 생성하며 4가지 인수가 필요하고
// new DatagramPacket(보낼데이터바이트버퍼, 보낼바이트길이, 보낼곳IP주소, 보낼곳포트번호);
// 보낼 바이트길이는 보낼 데이터바이트버퍼에 담긴 바이트 길이보다 짧아야한다
			packet =new DatagramPacket(buffer, buffer.length, address, otherPort);
			try {
// 연결된 소켓으로 작성한 문자열의바이트 데이터 전송
				socket.send(packet);
			} catch(IOException ee) {
				ee.printStackTrace();
			}
// textArea에 내가 보낸 메세지 추가
			textArea.append("SENT : " +s+"\n");
// 바로 다음 메세지를 입력할 수 있게 작성했던 모든 메시지를 드래그 처리한다
			textField.selectAll();
// 현재 코드에선 ↓ 이거 없이도 동작이 됨
/*
* 캐럿의 위치를 textArea의 문서모델(getDocument)의 문자수(getLength) 위치에 설정한다 즉, 캐럿을 textArea에
* 입력된 문자의 마지막에 위치시킨다 캐럿이라는 것은 커서를 의미 보내거나 받는 문자열의 마지막에 "\n"의 줄바꿈 이스케이프 문자가 있기
* 때문에 텍스트를 입력할 커서를 textFiel에 입력된 마지막 문자의 다음 줄에 위치 시킴
*/
			textArea.setCaretPosition(textArea.getDocument().getLength());
		}
	}
	public static void main(String[] args) throws IOException{
// GUI 구현과 메세지를 보내느 이벤트 분배 스레드
		E08MessengerA n = new E08MessengerA();
// 상대방의 메세지를 받아 GUI 컴포넌트 내용을 업데이트하는 메인 스레드
		n.process();
	}
}
