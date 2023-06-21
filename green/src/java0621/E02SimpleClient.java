package java0621;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

// 객체 스트림을 이용한 지속되는 채팅 프로그램 클라이언트 단
public class E02SimpleClient {
	public static void main(String[] args) throws IOException {
//args 문자열 배열이 비어있으면
		if(args.length == 0) {
			System.out.println("사용법 java SimpleClient [server_name");
			System.out.println("server_name을입력하지않으셔서 localhost로 접속을 시도합니다");
// 문자열 배열객체생성 및 0번인덱스에 내 IP주소 저장
			args = new String[] {"localhost"};
		}
		try {
// 내  IP와 포트 5434로 소켓 생성하며 연결
			Socket s1 = new Socket(args[0], 5434);
// 직접 입력한 문자에 대한 문자 스트림 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
// 연결된 소켓으로 객체의 원시 데이터 유형과 그래프를 주고받는 입출력 스트림 생성
			ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
			System.out.println("접속완료..");
// 서버가 보낸 객체를 읽어 문자열로 변환하여 출력
			System.out.println((String)ois.readObject());
			System.out.println("서버에게 먼저 메세지를 보내십시오!!");
			while(true) {
				System.out.println("<Client> : ");
// 문자 스트림으로 문자열 입력
				String temp = in.readLine();
// 입력한 문자열이 "exit"이면 채팅종료
				if (temp.equals("exit")) {
					System.out.println("bye");
					break;
				}
// 입력한 문자열을 출력스트림으로 서버에게 전송
				oos.writeObject("<Client> : "+ temp);
// 서버가 보낸 객체를 읽어문자열로 변환하여 출력
				System.out.println((String) ois.readObject());
			}
// 스트림, 연결소켓 닫기
			ois.close();
			s1.close();
// EOFException 예외
// ObjectOutputStream/ObjectInputStreram 클래스를 사용하여 객체를 직렬화,
// 역직렬화하는 과정에서 readObject 메서드에 의해 발생
// 이런 문제의 원인은 readObject 메서드가읽을  데이터가 없는 경우null을 반환하지 ㅇ낳고,
// EOFException 예외를  반환하기 때문에 아래와 같이 예외처리를 하던가,
// 아니면 readObject()로 읽을 데이터의 마지막에 null을 넣고
// readObject()로 null을 읽을 시 읽기를 종료하는 로직을 짜야한다
		}catch (EOFException o) {
			System.out.println("Server로 부터 연결이 끊어졌습니다. 종료합니다...");
		} catch (ClassNotFoundException e) {
			System.out.println("Server로 부터 연결이 끊어졌습니다. 종료합니다...");
			System.exit(0);
		} catch(IOException io) {
			io.printStackTrace();
		}
	}
}
