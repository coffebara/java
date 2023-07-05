<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 페이지 영역에 속성 설정
pageContext.setAttribute("scopeValue", "페이지 영역");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 영역 테스트</title>
</head>
<body>
<h2>페이지 영역 테스트</h2>
<ul>
<!-- 페이지 영역의 속성 읽기 -->
<li>페이지 영역 : ${ pageScope.scopeValue }</li>
</ul>
</body>
</html>
<!-- 페이지 영역(pageScope)의 속성은 같은 페이지에서 속성을 설정하고 읽어야 확인할 수 있습니다
즉, 포워딩이나 리다이렉트 없이 해당 페이지 내에서값을 설정하고
출력하는 방식을 사용해야 합니다. -->