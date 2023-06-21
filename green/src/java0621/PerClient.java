package java0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//단톡방 같이 여러 클라이언트가 메세지로 대화하게 하는 스레드 클래스
public class PerClient extends Thread {
// 동기화된 ArrayList를 생성하여 PrintWriter만 들어갈 수 있는 List로 업 캐스팅	
// static으로 지정하여 객체 생성이 안되어 PErclient 객체들의공유 데이터로 설정하고
// 각클라이언트 별로 생성된 PrintWriter를  담아서
// 한 명의  클라이언트가 메세지 전송하면 모든 클라이언트한테  전달한다
// 클라이언트들이  메세지를 입력한 순서대로 전달하기 위해 동기화 설정을  한 것이다
// Collenctions.synchronizedList(List) : 
// 지정된 목록이 지원하는 동기화된(스레드로부터 안전한) 목록을 반환
	static List<PrintWriter> List = Collections.synchronizedList(new ArrayList<>());

//Server class에서 사람들이 접속을 할 때마다 하나씩 Thread class가 추가되게 된다.
//이때 미완성 Thread class를 살펴보면
//class PerClient exnteds Thread {  static List<PrintWriter> List 
//									= Collections.synchronizedList(new ArrayList<>());
//여기서 ArrayList<printWriter>(); 는 모든 클라이언트에 대한 출력 스트림을 모아놓은
//리스트를 계속 추가하기 위한 List입니다
//하지만 문제가 되는 것은 동기화 Synchronized 입니다.
//그래서 아래의 Collections.synchronizedList를 사용해서
//ArrayList 객체를 여러 Thread가 안전하게 공유할 수 있는  동기화된 리스트로 만든다.
//public class PerClient exnteds Thread {  static List<PrintWriter> List 
//									= Collections.synchronizedList(new ArrayList<>());
	Socket client;
	PrintWriter pw;

// 생성자로 전달받은 클라이언트와연결된 소켓을 멤버로 초기화하고,
//	해당 클라이언트와연결된 출력 스트림을 생성하여 공유 List에 저장
	public PerClient(Socket client) throws IOException {
		this.client = client;
		pw = new PrintWriter(client.getOutputStream());
		List.add(pw);
	}

// 스레드 동작
	public void run() {
		String name ="";
		try {
// 연결 클라이언트에 대한 문자 입력 스트림 버퍼 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
// 처음으로 전달 받은 클라이언트 닉네임을 저장
			name = br.readLine();
// sendAll 메서드로 연결된 모든 클라이언트에게 입장 메세지 전달			
			sendAll("#" + name + "님이 입장하셨습니다.");
			while(true) {
// 클라이언트의 메세지를 한 줄 받아서 저장한다
				String msg = br.readLine();
// 받은메세지가 null이면 종료
				if(msg == null)
					break;
// sendAll 메서드로 클라이언트가 전송한 메세지를 다른 클라이언트들한테 전달하낟
				sendAll(name + ">" + msg);
			}} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
// 해당 클라이언트가 채팅방을 나가면(소켓 연결을 끊으면)
// 공유 리스트의 PrintWriter 객체를 삭제 후 퇴장 메세지를 전체 전달
				List.remove(pw);
				sendAll("#" + name + "님이 퇴장하셨습니다.");
				try {
					client.close();
				} catch(Exception e) {
				}
			}
		
	}

// 연결된 모든 클라이언트들에게 메세지 전달 메서드
	void sendAll(String msg) {
// 공유 리스트에 저장된 모든 PrintWriter 객체를 하나씩 가져와서			
		for (PrintWriter p : List) {
// 전달 받은 메세지를 전달한다.
			p.println(msg);
			p.flush();
		}
	}
}
