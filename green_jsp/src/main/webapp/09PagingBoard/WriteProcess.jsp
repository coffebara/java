<%@page import="model1.board.BoardDAO" %>
<%@page import="model1.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./IsLoggedIn.jsp" %>
<%
//품값 받기
String title = request.getParameter("title");
if(title == null || title.trim().isEmpty()){
	title = "페이징 처리";
}
String content = request.getParameter("content");
if(content == null || content.trim().isEmpty()){
	content = "페이징 Content";
}
// 폼값을 DTO 객체에 저장
BoardDTO dto = new BoardDTO();
dto.setTitle(title);
dto.setContent(content);
dto.setId(session.getAttribute("UserId").toString());

// DAO 객체를 통해 DB에 DTO 저장
BoardDAO dao = new BoardDAO(application);

// 더미 데이터를 삽입하기 위한코드
int iResult =0;
for(int i=1; i<=100; i++){
	dto.setTitle(title + "-" + i);	// 여기를 추가합니디ㅏ
	iResult = dao.insertWrite(dto);
}
dao.close();
// 성공 or 실패?
if( iResult ==1){
	response.sendRedirect("List.jsp");
} else {
	JSFunction.alertBack("글쓰기에 실패하였습니다.",out);
}
%>
<!-- 게시물입력 중 예외 발생
java.sql.SQLIntergrityConstraintViolationException: ORA-01400:
cannot insert NULL into ("MUSTHAVE", "BOARED","CONTENT")-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>