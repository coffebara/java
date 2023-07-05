<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OtherPage.jsp</title>
</head>
<body>
	<h4>OtherPage.jsp</h4>
	<ul>
		<li>저장된 값 : ${ requestVar }</li>
		<li>매개변수 1 : ${ param.user_param1 }</li>
		<li>매개변수 2 : ${ param.user_param2 }</li>
	</ul>
</body>
</html>
<%-- <c:out> 태그
<c:out> 태그는 JSP의 표현식처럼 변수를 출력할 때 사용
표현식과다른 점은 출력할 변수가 null일 때 default 속성에 지정한 기본값이 출력됨
escapeXml 속성을 true로 설정하면 HTML 태그를 자유롭게 표현 가능
<c:out value="출력할 변수" default="기본값" escapeXml="특수문자 처리 유무" />

value		:	출력할 변수를 지정한다
<c:catch> 태그는 발생한 예외를 잡아 처리하는 역할
예외가 발생하면 지정한 변수에 에러 메세지가 저장되어 전달
<c:catch var="변수명">
	실행 코드
</c:catch> 

Formatting 태그는 국가별로 다양한 언어, 날짜, 시간, 숫자 형식을 설정할 때 사용
국제화 태그를 사용하려면 먼저 다음의 지시어를  선언해야 함. 접두어로는 "fmt"를 이용
<%@ taglib prefix="fmt" url="http://java.sun.co/jsp/jstl/fmt" %>
 --%>