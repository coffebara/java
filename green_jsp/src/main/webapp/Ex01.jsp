<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 : 아이디 비밀번호 입력</h3>
	<form method="get" action="LoginServlet">
		<!-- doGet 메서드 활용 LoginServlet 매핑 맞추고 -->
		<label for="userid">아이디 : </label>
		<input type="text" name="id" id="userid"><br>
		<!-- 텍스트 상자 만들기 type="text" -->
		<label for="userpwd"> 암 &nbsp; 호 : </label>
		<input type="password" name="pwd" id="userpwd"><br>
		<!-- 텍스트 상자 만들기 type ="pssword" -->
		<input type="submit" value="로그인">
		<!-- 버튼 submit 타입으로 해서 전송되도록 -->
	</form><br>
</body>
</html>