<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<!-- 추가 -->
<%@ page import="dao.ProductRepository"%>
<!-- 미리 만들어둔 자바빈즈, java파일을 불러온다. -->

<jsp:useBean id="productDAO" class="dao.ProductRepository"
	scope="session" />
<!--  id 속성은 생성된 빈의 이름을 지정, class 속성은 빈의 클래스를 지정 scope 속성은 빈의 스코프를 지정
 같은 세션 내에서는 productDAO라는 이름으로 접근 가능한 동일한 인스턴스를 사용할 수 있다 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<!-- 	home이라는 메인 bar가 있는 menu.jsp 내용을 포함한다. ctrl + click하면 jsp 파일로 이동-->
	<jsp:include page="menu.jsp"/>

		<div class="jumbotron">
			<div class="container">
				<h1 class="display-3">상품 목록</h1>
			</div>
		</div>

		<%
		//ArrayList<Product> 형의 ListOfProducts 객체에
		//productDAO 즉) dao 패키지의 ProductRepository java 파일에 있는
		//모든 속성의 값들을 가져온다
		ProductRepository dao = ProductRepository.getInstance(); /* 추가 */
		ArrayList<Product> listOfProducts = dao.getAllProducts();
		%>


		<div class="container">
			<div class="row" align="center">
				<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
				%>

				<div class="col-md-4">
					<!-- 상품명, 설명, 가격을 출력한다. -->
					<h3><%=product.getPname()%></h3>
					<p><%=product.getDescription()%>
					<p><%=product.getUnitPrice()%>원
						<!-- 상세 정보 버튼을 추가로 만든다.
클릭하면 product 페이지로 넘어가게 된다. 
경로? id=를 지정해줘서 얻어온 상품의 id 값들이 나타나는 것! -->
					<p>
						<a href="./product.jsp?id=<%=product.getProductId()%>"
							class="btn btn-secondary" role="button"> <!-- &raquo; = 특수문자 >> -->
							상세 정보 &raquo;
						</a>
				</div>

				<%
				}
				%>
			</div>

			<!-- 구분선 -->
			<hr>
		</div>

		<%@ include file="/0627/footer.jsp"%></body>
</html>

