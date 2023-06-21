package java0621A;

import java.net.ServerSocket;
import java.net.Socket;

import java0621.PerClient;

public class Server_Client_sendThread_ReceiveThread_PerClient {
	public static void main(String[] args) {
		try {
// 포트 9002 서버 소켓 생성
			ServerSocket ss = new ServerSocket(9002);
			while(true) {
// 클라이언트 연결 요청시 소켓 생성
				Socket client = ss.accept();
// 연결된 클라이언트의 메세지를 다른클라이언트에게 공유하는 스레드 생성
				PerClient pc = new PerClient(client);
				pc.start();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
