<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어(EL) - 내장 객체</title>
</head>
<body>
	<h2>ImplictForwardResult 페이지</h2>
	<h3>각 영역에 저장된 속성읽기</h3>
	<ul>
		<li>페이지 영역 : ${ pageScope.scopeValue }</li>
		<li>리퀘스트 영역 : ${ requestScope.scopeValue }</li>
		<li>세션 영역 : ${ sessionScope.scopeValue }</li>
		<li>애플리케이션 영역 : ${ applicationScope.scopeValue }</li>
	</ul>
	<h3>영역 지정 없이 속성 읽기</h3>
	<ul>
		<li>${scopeValue }</li>
	</ul>
</body>
</html>
<!-- 
pageScope: 페이지 스코프는 현재 페이지 내에서만 값이 유효하바니다.
이 스코프 내에서 설정된 변수는 페이지 처리가 끝나면  삭제됩니다.
requestScope: 리퀘스트 스코프는 하나의 HTTP 요청 내에서만 값이 유효합니다.
요청처리가 끝나면 삭제됩니다.
sessionScope: 세션 스코프는 하나의 사용자 세션 내에서만 값이 유효합니다.
사용자 세션이 끝나면 삭제됩니다.
applicationScope: 애플리케이션 스코프는 전체 웹 애플리케이션에서 값이 유효합니다.
웹 애플리케이션이 종료되면  삭제됩니다. 
-->