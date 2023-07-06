<%@ page import="utils.JSFunction" %>
<%@ page import="java.io.FileNotFoundException" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.io.File" %>
<%@ page import="java.io.OutputStream" %>
<%@ page import="java.io.InputStream" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String saveDirectory = application.getRealPath("/Uploads");
String saveFilename =request.getParameter("sName");
String originalFilename = request.getParameter("oName");
System.out.println(saveFilename);
System.out.println(originalFilename);
System.out.println(saveDirectory);

try {
	// 파일을 찾아 입력 스트림 생성
	File file = new File(saveDirectory, saveFilename);
	InputStream inStream = new FileInputStream(file);
	// 한글 파일명 깨짐 방지
	String client = request.getHeader("User-Agent"); // 웹 브라우저 종류
	if(client.indexOf("WOW64") == -1){
		originalFilename = new String(originalFilename.getBytes("UTF-8"), "ISO-8859-1");
	} else {
		originalFilename = new String(originalFilename.getBytes("KSC5601"), "ISO-8859-1");
	}
	
	// 파일 다운로드용 응답 헤더 설정
	response.reset();
	
	response.setContentType("application/octet-stream");
	response.setHeader("Content-Disposition", 
			"attachment; filname=\"" + originalFilename + "\"");
	response.setHeader("Content-Length", "" + file.length() );
	
	// 출력 스트림 초기화
	out.clear();
	
	// response 내장 객체로부터 새로운 출력 스트림 생성
	OutputStream outStream = response.getOutputStream();
	
	// 출력 스트림에 파일 내용 출력
	byte b[] = new byte[(int)file.length()];
	// 다운로드할 파일의 경로 문자열 길이 크기의 바이트 배열생성
	int readBuffer = 0;
	while( (readBuffer = inStream.read(b)) > 0){ // 읽어올 게 있다면
		outStream.write(b,0,readBuffer);
	} //(보낼데이터(바이트), 시작인덱스, 보낼데이터의 시작인덱스부터 보낼 바이트 길이)
	// 입/출력 스트림 닫음
	inStream.close();
	outStream.close();
} catch (FileNotFoundException e){
	JSFunction.alertBack("파일을 찾을 수 없습니다.", out);
} catch (Exception e){
	JSFunction.alertBack("예외가 발생하였습니다.", out);
}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>