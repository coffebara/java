package java0621;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
// 클라이언트에게 날짜 및 시간 정보를 보내는 서버
public class E04Server {
	public static void main(String[] args) throws IOException{
// 포트 번호 9100의 서버 소켓 생성
		ServerSocket ss = new ServerSocket(9100);
		try {
			while(true) {
//클라이언트의 연결 요청이 오길 기다리다가
//연결 요청이 오면 연결 소켓을 생성
				Socket socket = ss.accept();
				try {
//getOutputStream으로 socket에 대한 출력 스트림을 연결한다					
					PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
//PrintWriter(OutputStream out, boolean autoFlush) 는
//autoFlush 인수가 true이면 println, prinf 또는 format 메서드가
//출력 버퍼를 자동으로 플러시합니다
//출력 스트림으로 클라이너트에게 현재 날짜 및 시간 데이터를 전송한다.
					out.println(new Date().toString());
				}  finally {
//무조건 소켓을 닫는다		
					socket.close();
				}
//서버 종료가 없어서 그냥 한번만 동작하도록 했음
				System.out.println("전송완료, 종료...");
				break;
			}
		} finally {
// 무조건 서버 소켓을 닫느다
			ss.close();
		} //소켓 : 두 응용프로그램 간의양방향 통신 링크의 한쪽 끝 단
	}// 소켓끼리 데이터를 주고받음, 소켓은 특정 IP 포트 번호와 결합
}// 웹브라우저 소켓 포트 <--> 인터넷 <--> 포트 소켓 웹서버
