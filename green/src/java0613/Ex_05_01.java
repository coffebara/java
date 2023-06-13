package java0613;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex_05_01 {
	public static void main(String[] args) throws IOException{
//파일클래스의 객체 tmpDir를 생성하는데 경로는 C드라이브의 temp폴더
		File tempDir = new File("C://temp1");
//만약에 tmpDir에 폴더가 없다면 temp 폴더를 생성한다.
		if(!tempDir.exists())
			tempDir.mkdir();
		
//#1-1 . 파일 객체 생성
		File newFile = new File("C://temp1//newFile.txt");
		
//#1-2. 파일이 없는 경우 실제 파일 생성
		if(!newFile.exists())
			newFile.createNewFile(); // temp1폴더가 없는 경우 예외발생
		// 파일에 내용 쓰기
		FileWriter fileWriter = new FileWriter(newFile);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println("Hello, world");
		printWriter.println("만류귀종");
		
		printWriter.close();
		fileWriter.close();
		
		System.out.println("파일에 내용이 작성되었습니다.");
//#2. 파일 구분자
		File newFile2 =new File("C:\\tmp1\\newFile.txt"); //windows둘다 가능
		File newFile3 =new File("C:"+File.pathSeparator+"temp1"
												+File.separator+"newFile.txt");
		File newFile4 =new File("C:/temp1/newFile.txt");
//경로에 파일이 존재하는지 boolean형으로 출력
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		System.out.println(newFile4.exists());
		
	}
	
}
