<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>OuterPage2 ���Ե� ���� ����� ���� �ܺ�����2</h2>
	<%
		String newVar2 = "���� ������";
	%>
	<ul>
		page���� ��ü ������ ����� �� �� ���
		<li><%=pageContext.getAttribute("pAttr") %></li>
		<li><%=request.getAttribute("rAttr") %></li>
	</ul>
</body>
</html>