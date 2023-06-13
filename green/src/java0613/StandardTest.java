package java0613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//키보드로 입력 System.in -> InputStreamReader(문자)
// -> BufferedReader..readLine() -> System.out 출력하기
public class StandardTest {
	public static void main(String[] args) {
		String mesg = null;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(ir);
		System.out.println("exit: Ctrl+Z");
		try {
			mesg = in.readLine();
			while(mesg != null) {
				System.out.println("읽기 :"+mesg);
				mesg = in.readLine();
			}
			in.close();
			ir.close();
		} catch (IOException e){
			e.printStackTrace();
		}// File 클래스 사용법
	}// File file = new File("파일명");
}    // File file = new File("파일 경로", "파일명"); 
// 키보드로 입력 System.in -> InputStreamRreader(문자)
//-> Bufferedreader..readLine() -> System.out 출력하기
//
//파일에 데이터 쓰기 과정
//키보드 입력 PrintWriter[println()] FileWriter --> write.txt
//파일에 데이터 읽기 과정
//write.txt --> FileReader Buffered BufferReader[readLine()] --> 모니터출력