<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>OuterPage2 포함될 실행 결과가 적힌 외부파일2</h2>
	<%
		String newVar2 = "백제 온조왕";
	%>
	<ul>
		page내장 객체 영역에 저장된 값 얻어서 출력
		<li><%=pageContext.getAttribute("pAttr") %></li>
		<li><%=request.getAttribute("rAttr") %></li>
	</ul>
</body>
</html>