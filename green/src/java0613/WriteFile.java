package java0613;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFile {
	public static void main(String[] args) {
		
		File file = new File("C:\\java\\green\\src\\java0613\\writer.txt");
		try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out= new PrintWriter(new FileWriter(file, true));
//file: 파일 객체인 file을 기반으로 파일을 엽니다. 
//true: 파일을 이어쓰기 모드로 엽니다, false 이면 덮어쓰기가 됩니다.
			String s;
			System.out.println("Exite : Ctrl + Z");
			while((s = in.readLine()) != null) {
				out.println(s);	// 출력하는 텍스트에 개행문자를 추가한 후 출력한다.
				//out.print(s);
			}
			in.close();
			out.close();
		} catch(IOException e) {
			System.out.println("IOException");
		} // 파일이 생성됬는지 3라인 정도 확인해보기
	}
}//- System.in 콘솔 입력의 특징
//Console 입력이INputStreeam으로 전달되는 시점	 엔터(Enter) 입력
//Ascii Code = '\r' + '\n'
//#case1. Windows
//while ((data = is.read())) != '\r')
//System.out.println(data);
//#case2. Windows
//while ((data = is.read()) != 13)
//System.out.println(data);

