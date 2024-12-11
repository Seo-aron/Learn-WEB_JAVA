<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String outerPath1 = "./inc/OuterPage1.jsp";
	String outerPath2 = "./inc/OuterPage2.jsp";

	pageContext.setAttribute("pAttr", "동명왕");
	request.setAttribute("rAttr", "온조왕");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>디렉티브태그, 액션태그 동장 방식 차이</h2>
	
	<h3>디렉티브 태그</h3>
	<%@ include file="./inc/OuterPage1.jsp" %>
	<!-- 표현식 사용하면 에러 -->
	<%--<%@ include file="<%=outerPath1%>" %>--%>
	
	<p>외부 파일1에 선언한 변수: <%=newVar1 %></p>
	
	
	<h3>액션 태그</h3>
	<!-- 표현식 사용해도 됨 -->
	<%-- <jsp:include page="./inc/OuterPage2.jsp"></jsp:include> --%>
	<jsp:include page="<%=outerPath2 %>"></jsp:include>
	
	<!-- 액션태그는 그 코드만 재요청받기에, 해당 jsp파일안에 다른 코드는 저장이 안되어 있음 -->
	<%-- <p>외부 파일2에 선언한 변수: <%=newVar2 %></p> --%>
	
	
</body>
</html>