package java0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//서버에서 날짜 및 시간 데이터를 받아 출력하는 클라이언트
public class E04DateClient {
	public static void main(String[] args) throws IOException {
//내 ip의 9100 포트에 소켓 생성하며 연결 요청
		Socket s =new Socket("localhost", 9100);
//서버와 연결된 소켓에대한 입력 스트림
		BufferedReader input =new BufferedReader(new InputStreamReader(s.getInputStream()));
//입력 스트림으로 서버에서 보낸 데이터 1줄을 읽는다
		String res = input.readLine();
//읽은 데이터를 출력한다
		System.out.println(res);
// 프로그램 종료한다
		System.exit(0);
// 프로그램 종료한다
		s.close();
	}
}
