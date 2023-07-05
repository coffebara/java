<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - if</title>
</head>
<body>
	<!-- 변수 선언 -->
	<c:set var="number" value="100" />
	<c:set var="string" value="JSP" />
	
	<h4>JSTL의 if 태그로 짝수/홀수 판단하기</h4>
	<c:if test="${number mod 2 eq 0 }" var="result">
		${ number }는 짝수입니다. <br/>
	</c:if>
	result: ${ result } <br/>
</body>
</html>
<%-- 
<c:choose>
	<c:when test="조건1">조건1을 만족하는 경우</c:when>
	<c:when test="조건2">조건2을 만족하는 경우</c:when>
	<c:otherwirse>아무 조건도 만족하지 않는 경우</c:otherwirse>
</c:choose>
<c:forEach> 태그
	<c:forEach> 태그는 반복을 위해 사용
	자바는 두 가지 형태의 for문을 제공
<c:forEach var="변수명" items="컬렉션 혹은 배열"	/>
	for(int number: numbers){...} 

<c:forEach var="변수명" begin="시작값" end="마지막값" step="증가값" />
	for(int i=0; i<100; i+=2){...}
		
	--%>
