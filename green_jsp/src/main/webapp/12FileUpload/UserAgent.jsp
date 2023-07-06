<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User-Agent 확인하기</title>
</head>
<body>
<%
String client = request.getHeader("User-Agent");
out.println(client);
%>
</body>
</html>
<!-- User-Agent는HTTP 요청을 보낼 때 웹 브라우저가 자신을 식별하는 데 
사용하는 문자열입니다.
이 문자열은 보통 웹 브라우저의 이름과 버전, 그리고 운영체제 정보를 포함합니다. -->

<!-- Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36 -->