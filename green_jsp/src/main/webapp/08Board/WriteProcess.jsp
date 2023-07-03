<%@page import="model1.board.BoardDAO" %>
<%@page import="model1.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./IsLoggedIn.jsp" %>
<%
//글쓰기 페이지와 글 내용을 DAO객체에 연결해 주는 페이지
//품값 받기
String title = request.getParameter("title");
String content = request.getParameter("content");

// 폼값을 DTO 객체에 저장
BoardDTO dto = new BoardDTO();
dto.setTitle(title);
dto.setContent(content);
dto.setId(session.getAttribute("UserId").toString());
// 보드테이블의 id는 멤버테이블의 id와 외래키로 연결되어 있기 때문에 id가 빈값이면
// INSERT할 때 제약조건 위배가 되기 때문에 세션에 저장된 사용자 아이디까지 DTO에 담은 것입니다.

// DAO 객체를 통해 DB에 DTO 저장
BoardDAO dao = new BoardDAO(application);
int iResult = dao.insertWrite(dto);
dao.close();

// 성공 or 실패?
if( iResult ==1){
	response.sendRedirect("List.jsp");
} else {
	JSFunction.alertBack("글쓰기에 실패하였습니다.",out);
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