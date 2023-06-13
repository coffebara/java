package java0613B;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("C:\\java\\green\\src\\java0613\\writer.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			while (s != null) {
				System.out.println("read: " + s);
				s = in.readLine();
			}
			in.close();
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//FileReader 클래스는 파일을 읽는 기능을 제공하지만
//단순히 파일을 한 문자씩 읽어오는 기능에 불과합니다.
//BufferedReader 클래스는 Filereader 객체를 생성자로 받아들여
//내부적으로 버퍼를 사용하여 효율적인 파일 읽기를 지원합니다.
//BufferedReader 클래스는 read() 및 readLine()과 같은 메서드를 제공
//결국 부모를 자식이 상속하듯이 확장해서 재사용한거네요
