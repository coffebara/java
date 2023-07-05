<%@ page import="java.util.*" %>
<%@ page import="common.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어(EL) - 객체 매개변수</title>
</head>
<body>
<h2>List 컬렉션</h2>
<%
	List<Object> aList = new ArrayList<>();
	aList.add("청해진");
	aList.add(new Person("장보고", 28));
	pageContext.setAttribute("Ocean", aList);
//List 컬렉션을 page영역에 저장
%>
<ul>
	<li>0번째 요소 ${ Ocean[0] }</li>
	<li>1번째 요소 ${ Ocean[1].name }, ${Ocean[1].age}</li>
	<li>2번째 요소 ${ Ocean[2] }</li><!-- 출력되지 않음 --> 
</ul>
<h2>Map 컬렉션</h2>
<%
	Map<String, String> map =new HashMap<>();
	map.put("한글", "훈밍정음");
	map.put("Eng", "English");
	pageContext.setAttribute("King", map);
%>
<ul>
	<li>영문 Key : ${ King["Eng"] }, ${King['Eng'] }, ${King.Eng }</li>
	<li>한글 Key : ${ King["한글"] }, ${King['한글'] }, \${King.한글 }</li>
	<!-- 에러발생이유는? 키가 한글: .(점)은 사용 금지 -> 점을 사용하면 500에러 발생 -->
</ul>
</body>
</html>