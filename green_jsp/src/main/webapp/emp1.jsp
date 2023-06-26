<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import= "java.sql.*" %>
<%
// Oracle
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String driver = "oracle.jdbc.driver.OracleDriver";
String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // jdbc 드라이버 주소
String user = "scott";
String pass = "tiger";
Connection conn = null;
Statement stmt = null;
ResultSet rs =null;
ResultSet rs2 = null;


try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, user, pass);
	stmt = conn.createStatement();
	rs = stmt.executeQuery("SELECT * FROM EMP");
%>
<table border="1">
	<tr>
	<th>EMPNO</th> 	<th>ENAME</th>	<th>JOB</th>
	<th>MGR</th> 	<th>HIREDATE</th>  <th>SAL</th>
	<th>COMM</th> <th>DEPTNO</th>
	</tr>
	<% while(rs.next()) { %>
	<tr>
		<td><%= rs.getInt("EMPNO") %> </td>
		<td><%= rs.getString("ENAME") %></td>
		<td><%= rs.getString("JOB") %></td>
		<td><%= rs.getInt("MGR") %></td>
		<td><%= rs.getDate("HIREDATE") %></td>
		<td><%= rs.getDouble("SAL") %></td>
		<td><%= rs.getDouble("COMM") %></td>
		<td><%= rs.getInt("DEPTNO") %></td>
		</tr>
		<%} %>
</table>
<% 
} catch(Exception e){
	e.printStackTrace();
} finally {
	if( rs != null) try {rs. close(); } catch (Exception e){}
	if( stmt != null) try {stmt. close(); } catch (Exception e){}
	if( conn != null) try {conn. close(); } catch (Exception e){}
}
%>

<%-- 스크립틀릿
<% %> : 자바 코드 실행
자바에서 하는 모든 일은 여기서 할 수 있다.
(if문, for문, while문, switch문 등등)
표현식
<%= %> : 변수 출력, 수식 출력, 메서드 호출등의 역할
웹 컨테이너에 의해 out.print 형식으로 변형시킴
즉, <%= 출력할 것 %> 와 out.print(출력할 것)은 동일함
ㅣ기사
<%@ %> : 디렉티브 태그, 외부 문서나 태그 라이브러리를 활용함, import 등의 역할도 수행
contentType, pageEncoding을 사용하여 문서 타입과 인코딩을 설정함
contentType 인코딩은 JSP파일을 HTML문서로 변환할 때 적용되는 인코딩
pageEncoding 인코딩은 그냥 JSP파일에 적용되는 인코딩
선언문
<%! %> : 함수선언 같은 것을 여기서 할 수 있음
주석
<!-- --> HTML주석(소스보기를 하면 보임)
Jsp주석 ctrl + shift + /
--%>