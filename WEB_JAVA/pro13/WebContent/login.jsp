<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>���̵� �Է��ϼ���</h1>
	<form action="result.jsp" method="post">
		ID: <input type="text" name="user_id"><br>
		PW: <input type="password" name="user_pw"><br>
		<input type="submit" value="Login">
		<!--
		form�±׿����� �Ʒ��� 2���� ���� ���� ��û ��ư ��� 
		<button>Login</button>
		<input type="image" src="s.png"> 
		-->
	</form>
</body>
</html>